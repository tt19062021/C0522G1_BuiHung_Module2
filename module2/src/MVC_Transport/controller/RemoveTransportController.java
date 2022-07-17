package MVC_Transport.controller;

import MVC_Transport.service.*;

import java.util.Scanner;

public class RemoveTransportController {
    private Scanner scanner = new Scanner(System.in);
    private IMotoService iMotoService = new MotoService();
    private IOtoService iOtoService = new OtoService();
    private ITruckService iTruckService = new TruckService();

    public void removeTransport() {
        do {
            System.out.print("Nhập biển số xe cần xóa: ");
            String licensePlates = scanner.nextLine();

            char index = licensePlates.charAt(3);

            switch (index) {
                case 'O':
                    iOtoService.removeOto(licensePlates);
                    return;
                case 'T':
                    iTruckService.removeTruck(licensePlates);
                    return;
                case 'M':
                    iMotoService.removeMoto(licensePlates);
                    return;
                default:
                    System.out.println("Định dạng biển số xe sai, mời nhập lại!!! ");
            }
        } while (true);
    }
}
