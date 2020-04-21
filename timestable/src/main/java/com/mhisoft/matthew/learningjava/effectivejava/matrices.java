package com.mhisoft.matthew.learningjava.effectivejava;

import java.util.Scanner;

public class matrices {





    public static int[][] multiply(int[][] firstMatrix, int[][] secondMatrix) {
        int[][] product = new int[getRows(firstMatrix)][getCols(secondMatrix)];
        for(int i = 0; i < getRows(firstMatrix); i++) {
            for (int j = 0; j < getCols(secondMatrix); j++) {
                for (int k = 0; k < getCols(firstMatrix); k++) {
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        return product;
    }



    public static  int getRows(int[][] a) {
        return a.length;
    }
    public static int getCols(int[][] a) {
        return a[0].length;
    }
    public static void printout(int[][]a) {

        for (int i = 0; i < a.length; i++) {
            System.out.println("Row " + i + ":");
            for (int j = 0; j < a[0].length; j++) {
                System.out.println(a[i][j]);
            }
        }


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("This program makes matrices.");
        System.out.println("Put in the number of rows you want your matrix to have.");
        int x = in.nextInt();
        System.out.println("Next, put in the number of columns you want your matrix to have.");
        int y = in.nextInt();
        int[][] a = new int[x][y];

        System.out.println("Okay, you have " + x + " rows and you have " + y + " columns. Now, we need to make a matrix you can multiply by. Remember, the columns");
        System.out.println("Of the first matrix must equal the number of rows of the second matrix.");
        System.out.println("Enter the number of rows for your second matrix.");
        int w = in.nextInt();
        System.out.println("Okay, put in the number of columns for your second matrix.");
        int z = in.nextInt();
        int[][] b = new int[w][z];
        System.out.println("Now, you need to fill your matrices.");
        for(int i = 0; i < getRows(a); i++){
            for(int j = 0; j< getCols(a); j++){
                System.out.println("Input the value for row " + i + " and column " + j + ".");
                a[i][j] = in.nextInt();

            }
        }
        System.out.println("Now that you've filled in the first, matrix, fill in the next one.");
        for(int i = 0; i < getRows(b); i++){
            for(int j = 0; j< getCols(b); j++){
                System.out.println("Input the value for row " + i + " and column " + j + ".");
                b[i][j] = in.nextInt();

            }
        }
        printout(multiply(a, b));

    }
}