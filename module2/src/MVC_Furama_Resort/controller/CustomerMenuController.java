package MVC_Furama_Resort.controller;

import MVC_Furama_Resort.service.ICustomerService;
import MVC_Furama_Resort.service.impl.CustomerService;

import java.util.Scanner;

public class CustomerMenuController {
    private static ICustomerService iCustomerService = new CustomerService();
    public void customerMenu() {
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("1.\tDisplay list customers");
            System.out.println("2.\tAdd new customer");
            System.out.println("3.\tEdit customer");
            System.out.println("4.\tReturn Main menu");

            choose = Integer.parseInt(scanner.nextLine());

            if (choose < 1 || choose > 4) {
                System.out.println("Input Again !!!");
                continue;
            }
            switch (choose) {
                case 1:
                    iCustomerService.display();
                    break;
                case 2:
                    iCustomerService.add();
                    break;
                case 3:
                    iCustomerService.repair();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }
}
