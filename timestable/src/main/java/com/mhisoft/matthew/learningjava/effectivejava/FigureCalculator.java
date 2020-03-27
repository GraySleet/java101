package com.mhisoft.matthew.learningjava.effectivejava;

import factory.FigureFactory;

public class FigureCalculator<T extends ShapeMath> {

    public double calculateArea(T object) {
            return object.findArea();//object is an instance of ShapeMap
    }

    //todo     calcularte cirfumferences too.

    public double calculateCircumference(T object){

        return object.findCircumference();

    }

    public static void main(String[] args) {
        FigureCalculator<ShapeMath> figureCalculator = new FigureCalculator<>();
        Circle c = (Circle) FigureFactory.createShape(1);  //casting
        c.setRadius(1);

        //todo calc rectangle area similar to above. using same FigureCalculator

        System.out.println(figureCalculator.calculateArea(c));
    }

}
