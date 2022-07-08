package SS01_Introduction_java.Exercise;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        System.out.print("Input Dolar you want change (USD):");
        Scanner scanner = new Scanner(System.in);
        double moneyUsd = scanner.nextDouble();
        System.out.print("To VND is:" + (moneyUsd * 23000) + " VND");
    }
}
