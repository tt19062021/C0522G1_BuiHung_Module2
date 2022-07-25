package MVC_Furama_Resort.controller;

import java.io.IOException;
import java.util.Scanner;

public class FuramaController {
    EmployeeMenuController employeeMenuController = new EmployeeMenuController();
    FacilityMenuController facilityMenuController = new FacilityMenuController();
    PromotionMenuController promotionMenuController = new PromotionMenuController();
    BookingMenuController bookingMenuController = new BookingMenuController();
    CustomerMenuController customerMenuController = new CustomerMenuController();


    public void displayMainMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("======== PURAMA-RESORT ========");
            System.out.println("1.\tEmployee Management");
            System.out.println("2.\tCustomer Management");
            System.out.println("3.\tFacility Management ");
            System.out.println("4.\tBooking Management");
            System.out.println("5.\tPromotion Management");
            System.out.println("6.\tExit ");
            System.out.print("Your chose: ");
            choose = Integer.parseInt(scanner.nextLine());

            if (choose < 1 || choose > 6) {
                System.out.println("Input Again!!!!");
                continue;
            }
            switch (choose) {
                case 1:
                    employeeMenuController.employeeMenu();
                    break;
                case 2:
                    customerMenuController.customerMenu();
                    break;
                case 3:
                    facilityMenuController.facilityMenu();
                    break;
                case 4:
                    bookingMenuController.bookingMenu();
                    break;
                case 5:
                    promotionMenuController.promotionMenu();
                    break;
                case 6:
                    System.exit(0);
            }
        } while (true);
    }
}
