package com.mhisoft.matthew.learningjava.effectivejava;



public class ComplexNumber {

    private double x, y;


    public ComplexNumber(double x, double y){
        this.x = x;
        this.y = y;


    }

    public double real(){return x;}

    public double imaginary(){return y;}
    public double magnitude(){return Math.sqrt(x*x + y*y);}


    public String toString(){return "{" + x + "," + y + "}";}

    public ComplexNumber multiplication(ComplexNumber b ){
        //double w ,x, y, z;


        ComplexNumber a = this;

        double w = a.real() * b.real();//real by real
        double x = a.imaginary() * b.imaginary() * -1;//imaginary by imaginary, but because i squared is -1, we multiply by -1.
        double y = a.real() * b.imaginary(); //imaginary
        double z = a.imaginary() * b.real();//imaginary

        return new ComplexNumber((w + x), (y + z));
    }

    public static void main(String[] args) {

        ComplexNumber a = new ComplexNumber(5, 2);
        ComplexNumber b = new ComplexNumber(3, -1);

        System.out.println(a.multiplication(b));


    }


}
