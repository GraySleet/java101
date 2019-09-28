package com.mhisoft.matthew.learningjava.FinallyPackage;

class Switch2{
    boolean state = false;
    boolean read() {return state;}
    void on() {state = true;}
    void off(){state = false;}
}
public class WithFinally {
    static Switch2 sw = new Switch2();
    public static void main(String[] args) {
        try {
            sw.on();

        } catch(NullPointerException e){
            System.out.println("NullPointerException");
        } catch(IllegalArgumentException e){
            System.out.println("IOEXCEPTION");
        } finally{
            sw.off();
        }
    }
}
