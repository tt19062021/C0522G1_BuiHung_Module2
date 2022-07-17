package MVC_Transport.service;

import MVC_Transport.model.Moto;
import MVC_Transport.model.Oto;
import MVC_Transport.model.Truck;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OtoService implements IOtoService{
    private static List<Oto> otoList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static Oto infoOto() {
        System.out.print("Nhập biển kiểm soát: ");
        String licensePlates = scanner.nextLine();

        System.out.print("Nhập hãng sản xuất: ");
        String production = scanner.nextLine();

        System.out.print("Nhập năm sản xuất: ");
        int yearOfProduction = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập vào chủ sở hữu:");
        String owner = scanner.nextLine();

        System.out.print("Nhập chổ ngồi: ");
        int seat = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhâp kiểu xe: ");
        String carModel = scanner.nextLine();

        Oto oto = new Oto(licensePlates, production, yearOfProduction, owner, seat,carModel);
        return oto;
    }

    @Override
    public void addOto() {
        Oto oto = infoOto();
        otoList.add(oto);
        System.out.print("Thêm mới thành công!");
    }

    @Override
    public void displayOto() {
        for(Oto oto : otoList){
            System.out.println(oto);
        }
    }

    @Override
    public void removeOto(String idLicensePlates) {
        boolean isFlag = false;
        for (Oto oto : otoList) {
            if (oto.getLicensePlates().equals(idLicensePlates)) {
                System.out.println(" Bạn có chắc muốn xóa hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1) {
                    otoList.remove(oto);
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
        for (Oto oto : otoList) {
            if (oto.getLicensePlates().equals(idLicensePlates)) {
                System.out.println(oto);
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy biển số xe");
        }

    }
}
