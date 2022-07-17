package MVC_Transport.view;

import MVC_Transport.controller.MenuController;

public class MenuView {
    public static void main(String[] args) {
        MenuController menuController = new MenuController();
        menuController.displayMenu();
    }
}
