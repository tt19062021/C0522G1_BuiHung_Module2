package SS01_Introduction_java.Practice;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Giải Phương trình bậc 1");
        System.out.println("Phương trình có dạng ax + b = 0 , Nhập vào a và b");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a:");
        double a = scanner.nextDouble();

        System.out.println("Nhap b:");
        double b = scanner.nextDouble();

        //System.out.println("Nhap c:");
        //double c = scanner.nextDouble();
        if (a != 0) {
            double answer = -b / a;
            System.out.println(answer);
        } else if (a == 0 && b == 0) {
            System.out.println("Phương trình vô số nghiệm");
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}