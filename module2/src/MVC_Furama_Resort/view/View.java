package MVC_Furama_Resort.view;

import MVC_Furama_Resort.controller.FuramaController;

import java.io.IOException;

public class View {
    public static void main(String[] args) throws IOException {
        FuramaController furamaController = new FuramaController();
        furamaController.displayMainMenu();
    }
}
