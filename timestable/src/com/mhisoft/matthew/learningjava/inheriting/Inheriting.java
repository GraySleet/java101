package com.mhisoft.matthew.learningjava.inheriting;



class MyException extends Exception {
    public MyException() {
    }

    public MyException(String msg) {
        super("My Own Special exception " +msg);
    }
}

public class Inheriting {
    public static void f() throws MyException {
        System.out.println(
                "Throwing MyException from f()");
        throw new MyException();
    }

    public static void g() throws MyException {
        System.out.println(
                "Throwing MyException from g()"
        );
        throw new MyException("Originated from g");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace();
        }
        try {
            g();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


