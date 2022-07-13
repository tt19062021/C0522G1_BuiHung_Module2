package SS09_DSA.Exercise.service.impl;


import SS09_DSA.Exercise.model.MyList;
import SS09_DSA.Exercise.model.Person;
import SS09_DSA.Exercise.model.Student;
import SS09_DSA.Exercise.service.IStudentService;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService implements IStudentService {
    Scanner sc = new Scanner(System.in);
    public static MyList<Student> student= new MyList<>();

    static {
        student.add(new Student(1,"Nguyễn Văn A","tt@gmail.com"));
        student.add(new Student(2,"Hoàng Thị B","rr@gmail.com"));
        student.add(new Student(3,"Bùi Gia Gia","ee@gmail.com"));
    }

    public void display(){
        for (int i=0;i<student.size();i++){
            System.out.println(student.elements[i]);
        }
    }

    public void all() {
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i) instanceof Student) {
                System.out.println(student.get(i));
            }
        }

    }

    public Student creatStudent(){
        System.out.print("Nhập vào Id : ");
        int id = sc.nextInt();

        System.out.print("Nhập vào Tên : ");
        String name = sc.nextLine();

        System.out.print("Nhập vào Gmail : ");
        String gmail = sc.nextLine();

        return new Student(id,name,gmail);
    }

    public void addStudent() {
        student.add(creatStudent());
    }

}
