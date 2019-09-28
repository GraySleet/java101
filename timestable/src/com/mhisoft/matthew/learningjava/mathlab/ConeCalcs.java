package com.mhisoft.matthew.learningjava.mathlab;

import java.util.Scanner;
import java.lang.Math;

public class ConeCalcs {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello! I'm here to calculate the volume and surface area of a cone.");
        System.out.println("For that, I need your radius (any) and a height (any).");
        System.out.println("Please put in your radius.");
        double firstRadius = in.nextDouble();
        System.out.println("Okay, your radius is " + firstRadius + ".");
        System.out.println("You need to put in your height now.");
        double firstHeight = in.nextDouble();
        System.out.println("Okay, your height is " + firstHeight + ".");
        String strV = String.format("%.2f", Double.valueOf(coneVolume(firstRadius, firstHeight)));
        String strS = String.format("%.2f", Double.valueOf(coneVolume(firstRadius, firstHeight)));
        System.out.println("The volume of your cone is " + strV + ".");
        System.out.println("Now, the surface area of your cone is " + strS + ".");
        //System.out.println(Math.PI);
    }
//Volume of a cone is 1/3pi r^2h.
//Surface area of a cone is Pi(radius)lateral length (/) and +pi r ^2

    public static double coneSurface(double x, double y) {
        //we have the height and the radius, Pi(radius) Lateral length {which is the square root of base^2 times height^2} and pir^2
        //double root = Math.sqrt(value);
        double lateralHeight = Math.sqrt((x * x) + (y * y));
        double anySurface = (Math.PI * lateralHeight * x) + (Math.PI * x * x);

        return anySurface;
    }

    public static double coneVolume(double x, double y) {
        //We have the height and the radius. 1/3 pi r^2 h is the formula.
        double anyCone = 0.33333 * x * x * Math.PI * y;
        return anyCone;
    }


}
