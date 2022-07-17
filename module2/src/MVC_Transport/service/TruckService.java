package MVC_Transport.service;

import MVC_Transport.model.Oto;
import MVC_Transport.model.Truck;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruckService implements ITruckService {
    private static List<Truck> truckList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static Truck infoTruck() {
        System.out.print("Nhập biển kiểm soát: ");
        String licensePlates = scanner.nextLine();

        System.out.print("Nhập hãng sản xuất: ");
        String production = scanner.nextLine();

        System.out.print("Nhập năm sản xuất: ");
        int yearOfProduction = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập vào chủ sở hữu:");
        String owner = scanner.nextLine();

        System.out.print("Nhập trọng tải xe: ");
        double tonnage = scanner.nextDouble();

        Truck truck = new Truck(licensePlates, production, yearOfProduction, owner, tonnage);
        return truck;
    }

    @Override
    public void addTruck() {
        Truck truck = infoTruck();
        truckList.add(truck);
        System.out.print("Thêm mới thành công");
    }

    @Override
    public void displayTruck() {
        for (Truck truck : truckList) {
            System.out.print(truck);
        }
    }

    @Override
    public void removeTruck(String idLicensePlates) {
        boolean isFlag = false;
        for (Truck truck : truckList) {
            if (truck.getLicensePlates().equals(idLicensePlates)) {
                System.out.println(" Bạn có chắc muốn xóa hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1) {
                    truckList.remove(truck);
                    System.out.println("Xóa thành công!.");
                }
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy biển số xe");
        }
    }

    @Override
    public void searchingLicensePlates(String idLicensePlates) {
        boolean isFlag = false;
        for (Truck truck : truckList) {
            if (truck.getLicensePlates().equals(idLicensePlates)) {
                System.out.println(truck);
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy biển số xe");
        }
    }
}
