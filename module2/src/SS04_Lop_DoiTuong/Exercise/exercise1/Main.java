package SS04_Lop_DoiTuong.Exercise.exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;

        do {
            System.out.print("Nhập vào a:");
            a = scanner.nextDouble();
            if (a == 0) {
                System.out.print("Dieu kien a # 0, Nhập lại:");
            }
        } while (a == 0);

        System.out.print("Nhập vào b:");
        double b = scanner.nextDouble();

        System.out.print("Nhập vào c:");
        double c = scanner.nextDouble();

        QuadraticEquation2 quadraticEquation2 = new QuadraticEquation2(a,b,c);

        System.out.println(quadraticEquation2.display());
        System.out.println(quadraticEquation2.viewResult());

    }
}
