package com.mhisoft.matthew.learningjava;

import java.math.BigInteger;
import java.util.*;
import java.util.Scanner;
import java.math.BigDecimal;

public class Factorial {
    protected static ArrayList table = new ArrayList();

    static {
        table.add(BigInteger.valueOf(1));

    }

    public static synchronized BigInteger factorial(int x) {
        if (x < 0) throw new IllegalArgumentException("x must be non-negative");
        for (int size = table.size(); size <= x; size++) {
            BigInteger last = (BigInteger) table.get(size - 1);
            BigInteger next = last.multiply(BigInteger.valueOf(size));
            table.add(next);
        }
        return (BigInteger) table.get(x);
    }

    public static synchronized BigDecimal root(double z) {
        if (z < 0) throw new IllegalArgumentException("x must be non-negative");
        double val = Math.sqrt(z);
        BigDecimal y = BigDecimal.valueOf(val);
        return y;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int goaway = 0;
        while (goaway == 0) {
            System.out.println("Do you want a factorial, or a bigDecimal? Put in 1 for factorial, 2 for bigdecimal.");
            int y = in.nextInt();
            if (y == 1) {
                System.out.println("This program will give you any factorial of a number.");
                System.out.println("Put in your number");
                int x = in.nextInt();
                System.out.println("Okay, your factorial is " + x + " and the result is " + factorial(x));

            } else if (y == 2) {
                System.out.println("This program will give you a square root number.");
                System.out.println("Put in the number you want to root.");
                double x = in.nextDouble();
                System.out.println("Okay, your number is " + x + " and the result is " + root(x));


            } else {
                System.out.println("Sorry, you didnt put in the right number, try again");


            }
            System.out.println("If you want to exit, type in 1, if you want to keep going, type 0.");
            int a = in.nextInt();
            if(a == 1){
                System.out.println("Goodbye!");
                goaway = 5;
            }


        }
    }
}

