package SS11_Java_Collection_Framework.Exercise2.MVC_Product.service;

import SS11_Java_Collection_Framework.Exercise2.MVC_Product.model.Product;

import java.util.*;

public class ProductManagerService implements IProductManagerService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Product> productList = new ArrayList<>();
    private static SortPriceUpService sortPriceUpService = new SortPriceUpService();
    private static SortPriceDowndService sortPriceDowndService = new SortPriceDowndService();

    static {
        productList.add(new Product(1, "sửa tươi", 5000));
        productList.add(new Product(2, "bánh mỳ", 3000));
        productList.add(new Product(3, "quyển vở 200 trang", 10000));
    }

    public Product infoProduct() {
        System.out.print("Nhập id sản phẩm:");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập tên sản phẩm:");
        String name = scanner.nextLine();

        System.out.print("Nhập giá sản phẩm:");
        double price = Double.parseDouble(scanner.nextLine());

        Product product = new Product(id, name, price);
        return product;
    }

    @Override
    public void addProduct() {
        Product product = infoProduct();
        productList.add(product);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void removeProductById() {
        System.out.print("Nhập vào id cần xóa");
        int id = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Product product : productList) {
            if (id == product.getId()) {
                System.out.println(" Bạn có chắc muốn xóa hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1) {
                    productList.remove(product);
                    System.out.println("Xóa thành công!.");
                }
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy id sản phẩm");
        }
    }

    public static int inputId() {
        System.out.print("Id mới: ");
        int id = Integer.parseInt(scanner.nextLine());
        return id;
    }

    public static String inputName() {
        System.out.print("Tên mới:  ");
        String name = scanner.nextLine();
        return name;
    }

    public static double inputPrice() {
        System.out.print("Giá mới: ");
        double price = Double.parseDouble(scanner.nextLine());
        return price;
    }

    @Override
    public void repairProductById() {
        System.out.println("Nhập vào id cần sửa");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.get(i).setId(inputId());
                productList.get(i).setName(inputName());
                productList.get(i).setPrice(inputPrice());
                break;
            }
        }
    }

    @Override
    public void displayProduct() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void searchProductByName() {
        System.out.println("Nhập tên sản phẩm cần tìm: ");
        String name = scanner.nextLine();

        boolean isFlag = false;
        for (Product product : productList) {
            if (Objects.equals(product.getName(), name)) {
                System.out.print(product);
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy tên sản phẩm");
        }
    }

    @Override
    public void sort() {
        int chose;
        do {
            System.out.println("1.Sắp xếp giá tăng dần\n" +
                    "2.Sắp xếp giá giảm dần\n"+
                    "3.Về menu chính \n");
            chose = Integer.parseInt(scanner.nextLine());

            switch (chose) {
                case 1:
                    productList.sort(sortPriceUpService);
                    for (Product product : productList) {
                        System.out.println(product);
                    }
                    break;
                case 2:
                    productList.sort(sortPriceDowndService);
                    for (Product product : productList) {
                        System.out.println(product);
                    }
                    break;
                case 3:
                    return;
                default:
                    System.out.print("Mời bạn nhập lại!!!");
            }
        } while (true);

    }
}
