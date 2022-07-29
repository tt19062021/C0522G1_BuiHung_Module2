package MVC_Furama_Resort.controller;

import MVC_Furama_Resort.service.IBookingService;
import MVC_Furama_Resort.service.ICustomerService;
import MVC_Furama_Resort.service.impl.BookingService;
import MVC_Furama_Resort.service.impl.CustomerService;

import java.util.Scanner;

public class BookingMenuController {
    private static ICustomerService iCustomerService = new CustomerService();
    private static IBookingService iBookingService = new BookingService();
    public void bookingMenu() {
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("1.\tAdd new booking");
            System.out.println("2.\tDisplay list booking");
            System.out.println("3.\tCreate new constracts");
            System.out.println("4.\tDisplay list contracts");
            System.out.println("5.\tEdit contracts");
            System.out.println("6.\tReturn Main menu");
            choose = Integer.parseInt(scanner.nextLine());

            if (choose < 1 || choose > 6) {
                System.out.println("Input Again!!!!");
                continue;
            }
            switch (choose) {
                case 1:
                iBookingService.add();
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
