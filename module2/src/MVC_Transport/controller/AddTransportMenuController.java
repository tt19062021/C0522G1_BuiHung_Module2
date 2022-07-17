package MVC_Transport.controller;

import MVC_Transport.service.*;

import java.util.Scanner;

public class AddTransportMenuController {
    private Scanner scanner = new Scanner(System.in);
    private IMotoService iMotoService = new MotoService();
    private IOtoService iOtoService = new OtoService();
    private ITruckService iTruckService = new TruckService();

    public void menuAddTransport() {
        do {
            System.out.println("-----Thêm mới phương tiện-----\n" +
                    "1. Thêm mới oto \n" +
                    "2. Thêm mới xe tải \n" +
                    "3. Thêm mới xe máy\n" +
                    "4. Quay về trang chính.");

            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    iOtoService.addOto();
                    break;
                case 2:
                    iTruckService.addTruck();
                    break;
                case 3:
                    iMotoService.addMoto();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }
}
