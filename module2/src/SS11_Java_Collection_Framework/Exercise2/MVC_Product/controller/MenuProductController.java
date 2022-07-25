package SS11_Java_Collection_Framework.Exercise2.MVC_Product.controller;

import SS11_Java_Collection_Framework.Exercise2.MVC_Product.service.IProductManagerService;
import SS11_Java_Collection_Framework.Exercise2.MVC_Product.service.ProductManagerService;

import java.util.Scanner;

public class MenuProductController {


    public void displayMenuProduct() {

        IProductManagerService iProductManagerService = new ProductManagerService();
        Scanner scanner = new Scanner(System.in);
        int choose = 0;
        do {
            System.out.println("Chương Trình Quản Lý Sản Phẩm");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa thông tin sản phẩm theo id");
            System.out.println("3. Xoá sản phẩm theo id ");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
            System.out.println("7. Thoát");

            try {
                System.out.print("Nhập sự lựa chọn của bạn: ");
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số !!!");
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
                default:
                    System.out.println("Vui lòng chọn lại! ");
            }
        } while (true);
    }
}
