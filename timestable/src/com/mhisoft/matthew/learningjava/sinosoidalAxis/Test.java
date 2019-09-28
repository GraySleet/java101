package com.mhisoft.matthew.learningjava.sinosoidalAxis;

public class Test {

    public static void main(String args[]) {

        double y;
        for (double x = 0; x <42 ; x=x+0.25 ) {

            y=12+15*Math.cos(Math.PI/50*x);
            System.out.println("x=" + x + ",y=" + y);

        }
    }
}
