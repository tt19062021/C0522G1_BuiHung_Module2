package SS07_AbstractClass_Interface.Exercise.controller;

import SS07_AbstractClass_Interface.Exercise.model.Circle;
import SS07_AbstractClass_Interface.Exercise.model.Rectangle;
import SS07_AbstractClass_Interface.Exercise.model.Shape;
import SS07_AbstractClass_Interface.Exercise.model.Square;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4);
        shapes[1] = new Rectangle(2,5);
        shapes[2] = new Square(3);

        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Square) {
                shape.howToColor();
            }
            System.out.println("Area is = " + shape.getArea());
        }
    }
}
