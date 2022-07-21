package SS14_Exception_Debug.Exercise.main;


import SS14_Exception_Debug.Exercise.exception.IllegalTriangleException;
import SS14_Exception_Debug.Exercise.model.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        int edgeA;
        int edgeB;
        int edgeC;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Nhập cạnh thứ nhất: ");
                edgeA = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập cạnh thứ hai: ");
                edgeB = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập cạnh thứ ba: ");
                edgeC = Integer.parseInt(scanner.nextLine());
                Triangle triangle = new Triangle(edgeA, edgeB, edgeC);
                System.out.println(triangle);
                break;
            }
            catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập số!");
            }
            catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập đúng giá trị các cạnh của tam giác!");
            }
        }

    }
}
