package MVC_Transport.service;

import MVC_Transport.model.Moto;
import MVC_Transport.model.Oto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MotoService implements IMotoService {
    private static List<Moto> motoList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static Moto infoMoto() {
        System.out.print("Nhập biển kiểm soát: ");
        String licensePlates = scanner.nextLine();

        System.out.print("Nhập hãng sản xuất: ");
        String production = scanner.nextLine();

        System.out.print("Nhập năm sản xuất: ");
        int yearOfProduction = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập vào chủ sở hữu:");
        String owner = scanner.nextLine();

        System.out.print("Nhập công suất máy: ");
        int cubicCentimeter = Integer.parseInt(scanner.nextLine());

        Moto moto = new Moto(licensePlates, production, yearOfProduction, owner, cubicCentimeter);
        return moto;
    }

    @Override
    public void addMoto() {
        Moto moto = infoMoto();
        motoList.add(moto);
        System.out.print("Thêm mới thành công");
    }

    @Override
    public void displayMoto() {
        for (Moto moto : motoList) {
            System.out.println(moto);
        }
    }

    @Override
    public void removeMoto(String idLicensePlates) {
        boolean isFlag = false;
        for (Moto moto : motoList) {
            if (moto.getLicensePlates().equals(idLicensePlates)) {
                System.out.println(" Bạn có chắc muốn xóa hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1) {
                    motoList.remove(moto);
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
        for (Moto moto : motoList) {
            if (moto.getLicensePlates().equals(idLicensePlates)) {
                System.out.println(moto);
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy biển số xe");
        }
    }
}
