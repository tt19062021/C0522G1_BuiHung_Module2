package SS06_Inheritance.Practice.cotrollor;

import SS06_Inheritance.Practice.Circle;
import SS06_Inheritance.Practice.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);


    }
}
