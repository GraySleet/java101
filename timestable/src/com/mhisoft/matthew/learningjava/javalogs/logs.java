package com.mhisoft.matthew.learningjava.javalogs;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class logs {


    public static void main(String[] args) {
        String filename = "d:/logoutput.csv"; //todo

        Scanner in = new Scanner(System.in);
        System.out.println("This program will help you find logs.");
        System.out.println("First, put in the base if your log.");
        double logBase = in.nextDouble();
        System.out.println("Next, put in the number of logs you want to print out.");
        int logAmount = in.nextInt();

        FileWriter fileWriter;
        PrintWriter printWriter = null;
        try {
            fileWriter = new FileWriter(filename);
            printWriter = new PrintWriter(fileWriter);


            findingLogs(printWriter, logBase, logAmount);


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (printWriter != null)
                printWriter.close();
        }


    }

    public static void findingLogs(PrintWriter printWriter, double base, int upperLimit) {
        for (int i = 1; i <= upperLimit; i++) {
            double logValue = Math.log(i) / (Math.log(base));
            printWriter.println(i + "," + logValue);

        }

    }


}
