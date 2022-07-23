package MVCPerson.controller;

import MVCPerson.service.IStudentService;
import MVCPerson.service.ITeacherService;
import MVCPerson.service.impl.StudentService;
import MVCPerson.service.impl.TeacherService;

import java.io.IOException;
import java.util.Scanner;

public class SortMenuController {
    private static ITeacherService iTeacherService = new TeacherService();
    private static IStudentService iStudentService = new StudentService();

    public void displaySort() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("1. Sắp xếp theo điểm ");
            System.out.println("2. Sắp xếp theo tên");
            System.out.println("3. Về menu chính");

            choose = Integer.parseInt(scanner.nextLine());

            if (choose < 1 || choose > 3) {
                System.out.println("lua chon khong hop le, xin nhap lai");
                continue;
            }
            switch (choose) {
                case 1:
                    iStudentService.sortUp();
                    iStudentService.findAll();
                    break;
                case 2:
                    iStudentService.sortNameByBubble();
                    iStudentService.findAll();
                    break;
                case 3:
                    return;
            }
        } while (true);
    }
}
