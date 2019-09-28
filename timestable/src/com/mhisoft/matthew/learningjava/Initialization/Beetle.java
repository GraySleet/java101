package com.mhisoft.matthew.learningjava.Initialization;

public class Beetle extends Insect {
    int k = prt("Beetle.k initialized");
    Beetle(){
        prt("K="+k);
        prt("j = " + j);

    }
    static int x2 =
            prt("static Beetle.x2 initialized");
    static int prt(String s){
        System.out.println(s);
        return 63;
    }

    public static void main(String[] args){
        prt("Beetle constructor");
        Beetle b = new Beetle();

    }
    }
