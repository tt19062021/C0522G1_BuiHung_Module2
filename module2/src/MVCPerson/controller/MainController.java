package MVCPerson.controller;

import MVCPerson.service.IStudentService;
import MVCPerson.service.ITeacherService;
import MVCPerson.service.impl.StudentService;
import MVCPerson.service.impl.TeacherService;

import java.util.Scanner;

public class MainController {
    private static MenuSearchController menuSearchController = new MenuSearchController();
    private static MenuAddController menuAddController = new MenuAddController();
    private static IStudentService iStudentService = new StudentService();
    private static ITeacherService iTeacherService = new TeacherService();


    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("======== Quản Lý HV-GV ========");
            System.out.println("1. Thêm mới");
            System.out.println("2. Danh sách");
            System.out.println("3. Tìm kiếm");
            System.out.println("4. Chỉnh sửa");
            System.out.println("5. Thoát");
            System.out.print("Lựa chọn: ");
            choose = Integer.parseInt(scanner.nextLine());

            if (choose < 1 || choose > 5) {
                System.out.println("Mời bạn nhập lại!!!!");
                continue;
            }
            switch (choose) {
                case 1:
                    menuAddController.displayAddMenu();
                    break;
                case 2:
                    iTeacherService.findAll();
                    iStudentService.findAll();
                case 3:
                    menuSearchController.displayMenuSearch();
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
            }
        } while (true);
    }
}
