package controller;

import service.*;

import java.util.Scanner;

public class MainController {
    public static void menuController() {
        StudentController studentController = new StudentController();
        TeacherController teacherController = new TeacherController();
        MainService mainService = new MainService();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Chào mừng bạn đến với Codegym. \n" +
                    "1. Quản lí học sinh.\n" +
                    "2. Quản lí giảng viên \n" +
                    "3. Xem danh sách giảng viên hoặc học sinh \n" +
                    "4. Thoát ");

            System.out.print("Mời bạn nhập lựa chọn: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1: {
                    studentController.menuStudent();
                    break;
                }
                case 2: {
                    teacherController.menuTeacher();
                }
                    break;
                case 3: {
                    mainService.disPlayAll();
                    break;
                }
                case 4:{
                    System.exit(1);
                }
            }
        } while (true);
    }
}
