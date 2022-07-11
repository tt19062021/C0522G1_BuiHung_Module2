package SS06_Inheritance.Practice.cotrollor;

import SS06_Inheritance.Practice.Square;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square("red", true, 5.0);
        System.out.println(square);
    }
}
