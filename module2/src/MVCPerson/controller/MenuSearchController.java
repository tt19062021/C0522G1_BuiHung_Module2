package MVCPerson.controller;

import MVCPerson.service.IStudentService;
import MVCPerson.service.ITeacherService;
import MVCPerson.service.impl.StudentService;
import MVCPerson.service.impl.TeacherService;


import java.util.Scanner;

public class MenuSearchController {
    private static ITeacherService iTeacherService = new TeacherService();
    private static IStudentService iStudentService = new StudentService();

    public void displayMenuSearch(){
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("1. Tìm kiếm học sinh");
            System.out.println("2. Tìm kiếm giáo viên");
            System.out.println("3. Về menu chính");

            choose = Integer.parseInt(scanner.nextLine());

            if (choose < 1 || choose > 3) {
                System.out.println("Lựa chọn không đúng,Vui lòng nhập lại!!!");
                continue;
            }
            switch (choose) {
                case 1:
                    iStudentService.searchTeacherByIdAndName();
                    break;
                case 2:
                    iTeacherService.searchById();
                   break;
                case 3:
                    return;
            }
        } while (true);

    }
}
