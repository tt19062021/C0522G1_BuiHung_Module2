package SS09_DSA.Exercise.service.impl;


import SS09_DSA.Exercise.model.Student;
import SS09_DSA.Exercise.service.IStudentService;

import java.util.Scanner;

public class StudentService implements IStudentService {
    private static Scanner sc = new Scanner(System.in);
    public static MyList<Student> studentList = new MyList<>();

    static {
        studentList.add(new Student(1, "Nguyễn Văn A", "tt@gmail.com"));
        studentList.add(new Student(2, "Hoàng Thị B", "rr@gmail.com"));
        studentList.add(new Student(3, "Bùi Gia Gia", "ee@gmail.com"));
    }


    public void display() {
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.elements[i]);
        }
    }

    public void all() {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i) instanceof Student) {
                System.out.println(studentList.get(i));
            }
        }

    }

    public Student creatStudent() {
        System.out.print("Nhập vào Id : ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập vào Tên : ");
        String name = sc.nextLine();

        System.out.print("Nhập vào Gmail : ");
        String gmail = sc.nextLine();
        Student student = new Student(id, name, gmail);
        return student;
    }

    public void addStudent() {
        Student student = creatStudent();
        studentList.add(student);
    }

    public void removeStudent() {
        System.out.println("Mời bạn nhập id cần xóa: ");
        int idRemove = Integer.parseInt(sc.nextLine());
        boolean isFlag = false;

        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == idRemove) {
                System.out.print("Bạn muốn xóa \n"
                +"1.Có"+
                "2.Không");

                int chose= Integer.parseInt(sc.nextLine());
                if(chose == 1){
                    studentList.remove(i);
                    System.out.println("Xóa Thành công");
                }
                isFlag = true;
                break;
            }
        }
        if(!isFlag){
            System.out.print("không thìm thấy");
        }
    }


}
