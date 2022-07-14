package service;

import model.Student;
import model.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private static List<Teacher> listTeacher = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static Teacher infoTeacher() {
        System.out.print("Nhập Id: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập name: ");
        String name = scanner.nextLine();

        System.out.print("Nhập ngày sinh: ");
        String dateOfBirth = scanner.nextLine();

        System.out.print("Nhập vào giới tính (Nam) hoặc (Nữ) :");
        String sex = scanner.nextLine();

        System.out.print("Nhập vào chuyên môn");
        String specialize = scanner.nextLine();

        Teacher teacher = new Teacher(id, sex, name, dateOfBirth, specialize);
        return teacher;
    }

    @Override
    public void addTeacher() {
        Teacher teacher = infoTeacher();
        listTeacher.add(teacher);
        System.out.print("Thêm mới thành công!. ");

    }

    @Override
    public void removeTeacher() {
        System.out.println("Mời bạn nhập id cần xóa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Teacher teacher : listTeacher) {
            if (teacher.getId() == idRemove) {
                System.out.println(" Bạn có chắc muốn xóa hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1) {
                    listTeacher.remove(teacher);
                    System.out.print("Xóa thành công!.");
                }
                isFlag = true;
                break;

            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy");
        }
    }

    @Override
    public void displayAllTeacher() {
        for (Teacher teacher : listTeacher) {
            System.out.println(teacher);
        }

    }
}
