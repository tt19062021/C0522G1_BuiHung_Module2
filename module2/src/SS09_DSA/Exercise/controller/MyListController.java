package SS09_DSA.Exercise.controller;

import SS09_DSA.Exercise.service.impl.StudentService;

import java.util.Scanner;


public class MyListController {
    private  StudentService studentService =new StudentService();
    public void displayMenu() {
         Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("========Danh sách lớp C0522G1-CODEGYM ========");
            System.out.println("1.Hiển thị danh sách học sinh ");
            System.out.println("2.Thêm Mới");
            System.out.println("3.Chỉnh sửa");
            System.out.println("4.Delete");
            System.out.println("5.Thoát");
            System.out.print("Nhập sự lựa chọn của bạn : ");
            choose = Integer.parseInt(scanner.nextLine());

            if (choose < 1 || choose > 5) {
                System.out.println("Lựa chọn không hợp lệ, nhập lại :");
                continue;
            }
            switch (choose) {
                case 1:
                    studentService.all();
                    break;
                case 2:
                    studentService.addStudent();
                    System.out.println("Danh sách sau khi tạo:");
                    studentService.display();
                    break;
                case 3:
                    break;
                case 4:
                    studentService.removeStudent();
                    break;
                case 5:
                    System.exit(0);
            }
        } while (true);
    }
//    public static void main(String[] args) {
//        Student stu1= new Student(1,"hung",3);
//        Student stu2= new Student(2,"hai",5);
//        Student stu3= new Student(3,"hieu",6);
//        Student stu4= new Student(4,"nhung",7);
//        Student stu5= new Student(5,"my",8);
//        Student stu6= new Student(6,"my2",9);
//
//        MyList<Student> studentMyList = new MyList<>();
//        studentMyList.add(stu1);
//        studentMyList.add(stu2);
//        studentMyList.add(stu3);
//        studentMyList.add(stu4);
//        studentMyList.add(stu5);
//        studentMyList.add(2,stu6);
//
//        for(int i=0; i < studentMyList.size(); i++){
//            Student student = (Student) ((MyList<Student>) studentMyList).elements[i];
//            System.out.println(student.getId());
//            System.out.println(student.getName());
//
//        }
//        System.out.println(studentMyList.get(3).getName());
//    }
}
