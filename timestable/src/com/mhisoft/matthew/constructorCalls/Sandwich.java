package com.mhisoft.matthew.constructorCalls;

class Meal {
    Meal(){
        System.out.println("Meal()");}
    }

class Bread {
    Bread(){
        System.out.println("Bread()");}
}

class Cheese {
    Cheese(){
        System.out.println("Cheese()");}
}

class Lettuce {
    Lettuce(){
        System.out.println("Lettuce()");}
}

class Lunch extends Meal {
    Lunch(){
        System.out.println("Lunch()");}
}


class PortableLunch extends Lunch {
    PortableLunch(){
        System.out.println("PortableLunch()");}
}


class Sandwich extends PortableLunch{
    Bread b = new Bread();
    Cheese c = new Cheese();
    Lettuce l = new Lettuce();
    Sandwich(int i){
        System.out.println(i + "- Sandwich()");
    }
    public static void main(String[] args){
        new Sandwich(1);
        new Sandwich(2);
    }
}