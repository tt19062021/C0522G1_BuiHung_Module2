package MVC_Furama_Resort.controller;

import java.util.Scanner;

public class PromotionMenuController {
    public void promotionMenu() {
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("1.\tDisplay list customers use service");
            System.out.println("2.\tDisplay list customers get voucher");
            System.out.println("3.\tReturn Main menu");

            choose = Integer.parseInt(scanner.nextLine());

            if (choose < 1 || choose > 4) {
                System.out.println("Input Again !!!");
                continue;
            }
            switch (choose) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    return;
            }
        } while (true);
    }
}
