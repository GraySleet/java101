package com.mhisoft.matthew.learningjava.FinallyPackage;


class Switch{
    boolean state = false;
    boolean read() {return state;}
    void on() {state = true;}
    void off(){state = false;}
}

public class OnOffSwitch {
    static Switch sw = new Switch();
    public static void main(String[] args) {
        try{
            sw.on();
            sw.off();
        } catch(NullPointerException e){
            System.out.println("NullPointerException");
            sw.off();
        }catch (IllegalArgumentException e){
            System.out.println("IOEXCEPTION");
            sw.off();
        }
    }

}
