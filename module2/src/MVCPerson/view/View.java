package MVCPerson.view;

import MVCPerson.controller.MainController;

import java.io.IOException;

public class View {
    public static void main(String[] args) throws IOException {
        MainController mainController = new MainController();
        mainController.displayMenu();
    }
}
