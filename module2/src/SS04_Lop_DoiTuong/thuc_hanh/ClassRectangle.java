package SS04_Lop_DoiTuong.thuc_hanh;


import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double weight = scanner.nextDouble();
        System.out.print("Enter the height:");
        double hight = scanner.nextDouble();
        ClassRectangle rectangle = new ClassRectangle(weight, hight);
        System.out.println("Your Rectangle \n" + rectangle.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: " + rectangle.getArea());
    }
}

public class ClassRectangle {
    double weight, hight;

    public ClassRectangle() {
    }

    public ClassRectangle(double weight, double hight) {
        this.hight = hight;
        this.weight = weight;
    }

    public double getArea() {
        return this.hight * this.weight;
    }

    public double getPerimeter() {
        return (this.hight + this.weight) * 2;
    }

    public String display() {
        return "Rectangle" + " hight " + hight + " weight " + weight;
    }

}

