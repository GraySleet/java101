package com.mhisoft.matthew.instruments;

public class Music3{
    static void tune(Instrument3 i) {
        i.play();
    }
    static void tuneAll(Instrument3[]e){
        for(int i = 0; i<e.length; i++)
            tune(e[i]);
    }
        public static void main(String[] args){
        Instrument3[] orchestra = new Instrument3[5];
        int i = 0;
            orchestra[i++]= new Brass3();
        orchestra[i++]= new Woodwind3();
        orchestra[i++]= new Wind3();
        orchestra[i++]= new Percussion3();
        orchestra[i++]=new Stringed3();
        tuneAll(orchestra);
    }


}