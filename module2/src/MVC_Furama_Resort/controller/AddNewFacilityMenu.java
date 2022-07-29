package MVC_Furama_Resort.controller;

import MVC_Furama_Resort.model.Villa;
import MVC_Furama_Resort.service.impl.FacilityService;

import java.util.Scanner;

public class AddNewFacilityMenu {
    FacilityService facilityService = new FacilityService();

    public void addFacility() {

        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("1.\tAdd New Villa");
            System.out.println("2.\tAdd New House");
            System.out.println("3.\tAdd New Room");
            System.out.println("4.\tBack to menu");

            choose = Integer.parseInt(scanner.nextLine());

            if (choose < 1 || choose > 4) {
                System.out.println("Input Again !!!");
                continue;
            }
            switch (choose) {
                case 1:
                    facilityService.addVilla();
                    break;
                case 2:
                    facilityService.addHouse();
                    break;
                case 3:
                    facilityService.addRoom();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }
}
