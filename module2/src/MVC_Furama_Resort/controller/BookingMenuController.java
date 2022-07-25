package MVC_Furama_Resort.controller;

import java.util.Scanner;

public class BookingMenuController {
    public void bookingMenu() {
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("1.\tAdd new booking");
            System.out.println("2.\tDisplay list booking");
            System.out.println("3.\tCreate new constracts");
            System.out.println("4.\tDisplay list contracts");
            System.out.println("5.\tEdit contracts");
            System.out.println("6.\tReturn main menu");
            choose = Integer.parseInt(scanner.nextLine());

            if (choose < 1 || choose > 6) {
                System.out.println("Input Again!!!!");
                continue;
            }
            switch (choose) {
                case 1:

                    break;
                case 2:
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    break;
                case 6:
                    return;
            }
        } while (true);
    }
}
