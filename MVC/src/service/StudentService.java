package service;

import com.sun.deploy.net.MessageHeader;
import model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static List<Student> listStudent = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
        listStudent.add(new Student(1, "Hoàng Châu Cách Cách", "12-12-1990", "Nữ", 9.2, "CodeGym"));
        listStudent.add(new Student(2, "Ngũ A Ka", "21-08-1989", "Nam", 8, "CodeGym"));
    }

    public static Student infoStudent() {
        System.out.print("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập name: ");
        String name = scanner.nextLine();

        System.out.print("Nhập ngày sinh: ");
        String dateOfBirth = scanner.nextLine();

        System.out.print("Nhập vào giới tính (Nam) hoặc (Nữ) :");
        String sex = scanner.nextLine();

        System.out.print("Nhập vào trường học: ");
        String school = scanner.nextLine();

        System.out.print("Nhập điểm: ");
        double point = Double.parseDouble(scanner.nextLine());

        Student student = new Student(id, name, dateOfBirth, sex, point, school);
        return student;
    }

    @Override
    public void addStudent() {
        Student student = infoStudent();
        listStudent.add(student);
        System.out.print("Thêm mới thành công!. ");
    }

    @Override
    public void removeStudent() {
        System.out.println("Mời bạn nhập id cần xóa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Student student : listStudent) {
            if (student.getId() == idRemove) {
                System.out.println(" Bạn có chắc muốn xóa hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1) {
                    listStudent.remove(student);
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
    public void displayAllStudent() {
        for (Student student : listStudent) {
            System.out.println(student);
        }
    }
}
