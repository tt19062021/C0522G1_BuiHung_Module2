package MVCPerson.view;

import MVCPerson.controller.MainController;

public class View {
    public static void main(String[] args) {
        MainController mainController = new MainController();
        mainController.displayMenu();
    }
}
