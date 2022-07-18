package SS11_Java_Collection_Framework.Exercise2.MVC_Product.view;

import SS11_Java_Collection_Framework.Exercise2.MVC_Product.controller.MenuProductController;

public class MainView {
    public static void main(String[] args) {
        MenuProductController menuProductController= new MenuProductController();
        menuProductController.displayMenuProduct();
    }
}
