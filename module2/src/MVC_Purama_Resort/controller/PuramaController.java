package MVC_Purama_Resort.controller;

import java.util.Scanner;

public class PuramaController {
    PromotionMenuController promotionMenuController = new PromotionMenuController();
    FacilityMenuController facilityMenuController = new FacilityMenuController();
    EmployeeMenuController employeeMenuController = new EmployeeMenuController();
    CustomerMenuController customerMenuController = new CustomerMenuController();
    BookingMenuController bookingMenuController = new BookingMenuController();

    public void displayMainMenu() {
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
