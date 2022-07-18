package SS11_Java_Collection_Framework.Exercise2.MVC_Product.controller;

import SS11_Java_Collection_Framework.Exercise2.MVC_Product.service.IProductManagerService;
import SS11_Java_Collection_Framework.Exercise2.MVC_Product.service.ProductManagerService;

import java.util.Scanner;

public class MenuProductController {
    private static Scanner scanner = new Scanner(System.in);
    private static IProductManagerService iProductManagerService = new ProductManagerService();

    public void displayMenuProduct() {
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("Chương Trình Quản Lý Sản Phẩm");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa thông tin sản phẩm theo id");
            System.out.println("3. Xoá sản phẩm theo id ");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
            System.out.println("7. Thoát");
            System.out.print("Nhập sự lựa chọn của bạn: ");
            choose = Integer.parseInt(scanner.nextLine());

            if (choose < 1 || choose > 7) {
                System.out.println("lựa chọn không hợp lệ, vui lòng nhập lại: ");
                continue;
            }
            switch (choose) {
                case 1:
                    iProductManagerService.addProduct();
                    break;
                case 2:
                    iProductManagerService.repairProductById();
                    break;
                case 3:
                    iProductManagerService.removeProductById();
                    break;
                case 4:
                    iProductManagerService.displayProduct();
                    break;
                case 5:
                    iProductManagerService.searchProductByName();
                    break;
                case 6:
                    iProductManagerService.sort();
                    break;
                case 7:
                    System.exit(0);
            }
        } while (true);
    }
}
