package MVC_Transport.controller;

import java.util.Scanner;

public class MenuController {
    private DisplayAllTransportController displayAllTransportController = new DisplayAllTransportController();
    private AddTransportMenuController addTransportMenuController = new AddTransportMenuController();
    private RemoveTransportController removeTransportController = new RemoveTransportController();
    private SearchingIdLicensePlates searchingIdLicensePlates = new SearchingIdLicensePlates();

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("Chương Trình Quản Lý Phương Tiện Giao Thông");
            System.out.println("1. Thêm mới phương tiện");
            System.out.println("2. Hiển thị danh sách phương tiện");
            System.out.println("3. Xóa phương tiện ");
            System.out.println("4. Tìm kiếm theo bản kiểm soát");
            System.out.println("5. Thoát");
            System.out.print("Nhập sự lựa chọn của bạn: ");
            choose = Integer.parseInt(scanner.nextLine());

            if (choose < 1 || choose > 5) {
                System.out.println("lựa chọn không hợp lệ, vui lòng nhập lại: ");
                continue;
            }
            switch (choose) {
                case 1:
                    addTransportMenuController.menuAddTransport();
                    break;
                case 2:
                    displayAllTransportController.menuDisplayTransport();
                    break;
                case 3:
                    removeTransportController.removeTransport();
                    break;
                case 4:
                    searchingIdLicensePlates.searchIdLicensePlates();
                    break;
                case 5:
                    System.exit(0);
            }
        } while (true);
    }
}
