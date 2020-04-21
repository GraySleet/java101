package com.mhisoft.matthew.learningjava.effectivejava;

class Except {

    public static int throwException(int x , int y) throws IllegalArgumentException {
        if (x == 0 || y == 0)
            throw new IllegalArgumentException("Not allowed!");
        else {

            return x / y + y / x;
        }

    }

    public static void tryExcep(int x, int y){
        try {
            int value = throwException(x, y);


        } catch (IllegalArgumentException msg) {

            System.out.println(msg.getMessage());
        }


    }

    public static void main(String args[]) {
        tryExcep(5,0);


    }
}