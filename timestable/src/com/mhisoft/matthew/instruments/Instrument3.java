package com.mhisoft.matthew.instruments;

public class Instrument3 {
    public void play(){
        System.out.println("Instrument3.play*(");
    }
    public String what() {
        return "Instrument3";
    }
    public void adjust(){}
}

class Wind3 extends Instrument3{
    @Override
    public void play()
    {
        System.out.println("Wind3.play()");
    }
    public String what(){return "Wind3";}
    public void adjust(){}
}
class Percussion3 extends Instrument3{
    public void play()
    {
        System.out.println("Percussion3.play()");
    }
    public String what(){return "Percussion3";}
    public void adjust(){}
}

class Stringed3 extends Instrument3{
    public void play()
    {
        System.out.println("Stringed3.play()");
    }
    public String what(){return "Stringed3";}
    public void adjust(){}
}
class Brass3 extends Wind3{
    public void play()
    {
        System.out.println("Brass3.play()");
    }
    public String what(){return "Brass3";}
    public void adjust(){}
}
class Woodwind3 extends Wind3{
    public void play()
    {
        System.out.println("Woodwind3.play()");
    }
    public String what(){return "Woodwind3";}
    public void adjust(){}
}
