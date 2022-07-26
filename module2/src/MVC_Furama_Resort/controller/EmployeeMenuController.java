package MVC_Furama_Resort.controller;

import MVC_Furama_Resort.service.IEmployeeService;
import MVC_Furama_Resort.service.impl.EmployeeService;

import java.io.IOException;
import java.util.Scanner;

public class EmployeeMenuController {
    private static IEmployeeService iEmployeeService = new EmployeeService();
    public void employeeMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("1.\tDisplay list employees");
            System.out.println("2.\tAdd new employee");
            System.out.println("3.\tEdit employee");
            System.out.println("4.\tReturn Main menu");

            choose = Integer.parseInt(scanner.nextLine());

            if (choose < 1 || choose > 4) {
                System.out.println("Input Again !!!");
                continue;
            }
            switch (choose) {
                case 1:
                    iEmployeeService.display();
                    break;
                case 2:
                    iEmployeeService.add();
                    break;
                case 3:
                    iEmployeeService.repair();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }
}
