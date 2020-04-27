package com.mhisoft.matthew.learningjava.effectivejava;
import java.sql.SQLOutput;
import java.util.Scanner;
public class polynomials {

    private static  double squared;
    private static  double variable;
    private static double normal;


    public static double getSquared() {
        return squared;
    }



    public static double getVariable() {
        return variable;
    }



    public static  double getNormal() {
        return normal;
    }



    public polynomials(double squared, double variable, double normal) {//the class has been created, now we need to make get/set methods.
        this.squared = squared;
        this.variable = variable;
        this.normal = normal;


    }

    public static String multiply(polynomials a ){
    //so a number is imaginary if b^2-4ac is negative, so we will check for that.
    if(a.getVariable() * a.getVariable() - 4 * a.getSquared() * a.getNormal() < 0){
    return "Sorry, your polynomial is not valid. There are no solutions.";

    }
    else if(a.getVariable() * a.getVariable() - 4 * a.getSquared() * a.getNormal() == 0){
        //Because b squared-4ac is 0, we can just do -b/2a
        double only = (-1 * a.getVariable()) / (2 * getSquared());
        return "Your polynomial has one solution, and the solution is " + only + ".";
    }
    else{
        double first = ((-1 * a.getVariable()) + (Math.sqrt(a.getVariable() * a.getVariable() - 4*a.getSquared() * a.getNormal()))) / (2 * a.getSquared());
        double second = ((-1 * a.getVariable()) - (Math.sqrt(a.getVariable() * a.getVariable() - 4*a.getSquared() * a.getNormal()))) / (2 * a.getSquared());
        return "Your polynomial has two solutions, and the solutions are " + first + " and " + second + ".";

    }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("This program will find the number of solutions for a given polynomial you put in.");
        System.out.println("Put in your squared number, e.g x^2");
        double squared = in.nextDouble();
        System.out.println("Now, put in your normal number, e.g x");
        double variable = in.nextDouble();
        System.out.println("Finally, put in your normal number, e.g 5");
        double normal = in.nextDouble();
        System.out.println("So your number is " + squared + " x squared plus " + variable + " x plus " + normal + ".");
        polynomials value = new polynomials(squared, variable, normal);
        String a = multiply(value);
        System.out.println(a);

    }

}
