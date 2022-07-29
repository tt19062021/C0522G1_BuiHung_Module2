package MVC_Furama_Resort.controller;

import MVC_Furama_Resort.service.IFacilityService;
import MVC_Furama_Resort.service.impl.FacilityService;

import java.util.Scanner;

public class FacilityMenuController {
    private static AddNewFacilityMenu addNewFacilityMenu = new AddNewFacilityMenu();
    private static IFacilityService iFacilityService = new FacilityService();
    private static FacilityService facilityService = new FacilityService();
    public void facilityMenu() {
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("1.\tDisplay list facility");
            System.out.println("2.\tAdd new facility");
            System.out.println("3.\tDisplay list facility maintenance");
            System.out.println("4.\tReturn Main menu");

            choose = Integer.parseInt(scanner.nextLine());

            if (choose < 1 || choose > 4) {
                System.out.println("Input Again !!!");
                continue;
            }
            switch (choose) {
                case 1:
                    iFacilityService.display();
                    break;
                case 2:
                    addNewFacilityMenu.addFacility();
                    break;
                case 3:
                    facilityService.displayMaintenance();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }
}
