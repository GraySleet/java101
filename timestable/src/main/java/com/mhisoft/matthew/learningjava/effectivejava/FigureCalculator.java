package com.mhisoft.matthew.learningjava.effectivejava;

import factory.FigureFactory;

import static factory.FigureFactory.shape.circle;
import static factory.FigureFactory.shape.rectangle;

public class FigureCalculator<T extends ShapeMath> {

    public double calculateArea(T object) {
            return object.findArea();//object is an instance of ShapeMap
    }

    //calcularte cirfumferences too.

    public double calculateCircumference(T object){

        return object.findCircumference();

    }

    public static void main(String[] args) {
        FigureCalculator<ShapeMath> figureCalculator = new FigureCalculator<>();
        Circle c = (Circle) FigureFactory.createShape(circle);  //casting
        c.setRadius(1);

        //todo calc rectangle area similar to above. using same FigureCalculator

        FigureCalculator<ShapeMath> x = new FigureCalculator<>();
        Rectangle r = (Rectangle) FigureFactory.createShape(rectangle);  //casting
        r.setSide1(1);
        r.setSide2(2);

        System.out.println(figureCalculator.calculateArea(c));
    }

}
