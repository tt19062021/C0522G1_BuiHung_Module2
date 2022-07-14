package service;

import model.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainService implements IMainService {
    public void disPlayAll() {
        IStudentService iStudentService = new StudentService();
        ITeacherService iTeacherService = new TeacherService();
        List<Teacher> teacherList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("1.Danh sách giảng viên\n" +
                "2.Danh sách học sinh\n"+
                "3.Danh sách giảng viên và học sinh");

        int check = Integer.parseInt(scanner.nextLine());
        if (check == 1) {
            if (teacherList.size() == 0) {
                System.out.println("Danh Sách Rỗng.!");
            } else {
                System.out.println("Danh sách giảng viên");
                iTeacherService.displayAllTeacher();
            }
        }
        if (check == 2) {
            System.out.println("Danh sách học sinh");
            iStudentService.displayAllStudent();
        }
        if(check == 3){
            System.out.println("Danh sách giảng viên");
            iTeacherService.displayAllTeacher();

            System.out.println("Danh sách học sinh");
            iStudentService.displayAllStudent();
        }
    }
}
