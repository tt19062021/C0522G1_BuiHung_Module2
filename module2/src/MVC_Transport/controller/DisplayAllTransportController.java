package MVC_Transport.controller;

import MVC_Transport.service.*;

import java.util.Scanner;

public class DisplayAllTransportController {
    private Scanner scanner = new Scanner(System.in);
    private IMotoService iMotoService = new MotoService();
    private IOtoService iOtoService = new OtoService();
    private ITruckService iTruckService = new TruckService();

    public void menuDisplayTransport() {
        do {
            System.out.println("-----Hiển thị phương tiện-----\n" +
                    "1. Oto \n" +
                    "2. Xe tải \n" +
                    "3. Xe máy\n" +
                    "4. Quay về trang chính.");

            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    iOtoService.displayOto();
                    break;
                case 2:
                    iTruckService.displayTruck();
                    break;
                case 3:
                    iMotoService.displayMoto();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }
}
