package MVCPerson.service.impl;

import MVCPerson.model.Student;
import MVCPerson.model.Teacher;
import MVCPerson.service.ITeacherService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Teacher> teacherList = new ArrayList<>();

    static {
        teacherList.add(new Teacher(12,"Mac Van Khoa",1000000));
        teacherList.add(new Teacher(11,"Quynh Anh",1200000));
    }
    @Override
    public void findAll() {
        for(Teacher teacher: teacherList){
            System.out.println(teacher);
        }
    }

    @Override
    public void searchById() {
        int choose;
        boolean isExist = false;

        do {
            System.out.println("Tìm kiểm giáo viên theo: \n" +
                    "1. Id.\n" +
                    "2. Tên.");
            choose = Integer.parseInt(scanner.nextLine());

            if (choose != 1 && choose != 2) {
                System.out.println("Nhập lại!");
            }
        } while (choose != 1 && choose != 2);

        if (choose == 1) {
            System.out.print("Mời bạn nhập id cần tìm kiếm: ");
            int idFind = Integer.parseInt(scanner.nextLine());

            for (Teacher teacher : teacherList) {
                if (teacher.getId() == idFind) {
                    System.out.println(teacher);
                    isExist = true;
                    break;
                }
            }
        }
        else {
            System.out.print("Mời bạn nhập tên cần tìm kiếm: ");
            String nameFind = scanner.nextLine();

            for (Teacher teacher : teacherList) {
                if (teacher.getName().toLowerCase().contains(nameFind.toLowerCase())) {
                    System.out.println(teacher);
                    isExist = true;
                }
            }
        }
        if (!isExist) {
            System.out.println("Không tìm thấy!");
        }
    }

    @Override
    public void addTeacher() {
        Teacher teacher = infoTeacher();
        teacherList.add(teacher);
        System.out.print("Thêm mới thành công!!");
    }
    public static Teacher infoTeacher(){
        System.out.print("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập tên:");
        String name = scanner.nextLine();

        System.out.print("Nhập điểm: ");
        double salary = Double.parseDouble(scanner.nextLine());

        Teacher teacher = new Teacher(id, name, salary);
        return teacher;
    }

}
