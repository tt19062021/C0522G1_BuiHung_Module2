package SS11_Java_Collection_Framework.Exercise2.MVC_Product.view;

import SS11_Java_Collection_Framework.Exercise2.MVC_Product.controller.MenuProductController;
import SS11_Java_Collection_Framework.Exercise2.MVC_Product.model.Product;
import SS11_Java_Collection_Framework.Exercise2.MVC_Product.untils.ReadWriteObjectToFile;

import java.util.ArrayList;
import java.util.List;

public class MainView {

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1,"Sữa",10000));
        ReadWriteObjectToFile.writeToFile("src/SS11_Java_Collection_Framework/Exercise2/MVC_Product/untils/test.dat",productList);
        MenuProductController menuProductController= new MenuProductController();
        menuProductController.displayMenuProduct();
    }
}
