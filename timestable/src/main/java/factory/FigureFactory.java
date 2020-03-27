package factory;

import com.mhisoft.matthew.learningjava.effectivejava.Circle;
import com.mhisoft.matthew.learningjava.effectivejava.Rectangle;
import com.mhisoft.matthew.learningjava.effectivejava.ShapeMath;

public class FigureFactory {
//todo make this choice enum
    public static ShapeMath createShape(int choice) {

        switch (choice) {

            case 1:
                return new Circle();



            case 2:
                return new Rectangle();

            default:
                throw new RuntimeException("number not recognized or is invalid.");
        }


    }


    public static void main(String[] args) {
        System.out.println(FigureFactory.createShape(1));
        System.out.println(FigureFactory.createShape(2));




    }




}

