package factory;

import com.mhisoft.matthew.learningjava.effectivejava.Circle;
import com.mhisoft.matthew.learningjava.effectivejava.Rectangle;
import com.mhisoft.matthew.learningjava.effectivejava.ShapeMath;

public class FigureFactory {

    public enum shape
    {
        circle, rectangle
    }

//todo make this choice enum
    public static ShapeMath createShape(shape shapes) {

        switch (shapes) {

            case circle:
                return new Circle();



            case rectangle:
                return new Rectangle();

            default:
                throw new RuntimeException("number not recognized or is invalid.");
        }


    }






}

