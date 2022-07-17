package MVCPerson.controller;

import MVCPerson.service.IPersonService;
import MVCPerson.service.IStudentService;
import MVCPerson.service.impl.PersonService;
import MVCPerson.service.impl.StudentService;

import java.util.Scanner;

public class MainController {
    IPersonService iPersonService = new PersonService();
    IStudentService iStudentService = new StudentService();

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("======== Menu ========");
            System.out.println("1. them moi");
            System.out.println("2. hien thi danh sach");
            System.out.println("3. chinh sua");
            System.out.println("4. delete");
            System.out.println("5. thoat");
            System.out.print("nhap su lua chon cua ban: ");
            choose = Integer.parseInt(scanner.nextLine());

            if (choose < 1 || choose > 5) {
                System.out.println("lua chon khong hop le, xin nhap lai");
                continue;
            }
            switch (choose) {
                case 1:
                    break;
                case 2:
                    iPersonService.findAll();
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
            }
        } while (true);
    }
}
