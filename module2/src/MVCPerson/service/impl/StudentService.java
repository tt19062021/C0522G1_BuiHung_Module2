package MVCPerson.service.impl;

import MVCPerson.exception.DuplicateIDException;
import MVCPerson.model.Student;
import MVCPerson.service.IStudentService;
import SS11_Java_Collection_Framework.Exercise2.MVC_Product.model.Product;

import java.util.*;

public class StudentService implements IStudentService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Student> studentList = new ArrayList<>();
    private static SortByScoreUpService sortByScoreUpService = new SortByScoreUpService();
    private static SortByScoreDownService sortPriceDowndService = new SortByScoreDownService();

    static {
        studentList.add(new Student(1, "Nguyen Van Nam", 5.5));
        studentList.add(new Student(2, "Tra Van Kieu", 6.0));
        studentList.add(new Student(3, "Hoang Chau Cach Cach", 8));
        studentList.add(new Student(4, "Ngu A Ka", 9));
        studentList.add(new Student(5, "Dam Huong", 10));
        studentList.add(new Student(6, "Quach Tuan Du", 9));
    }

    @Override
    public void findAll() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void searchTeacherByIdAndName() {
        int choose;
        boolean isExist = false;

        do {
            System.out.println("Tìm kiểm học sinh theo : \n" +
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

            for (Student student : studentList) {
                if (student.getId() == idFind) {
                    System.out.println(student);
                    isExist = true;
                    break;
                }
            }
        } else {
            System.out.print("Mời bạn nhập tên cần tìm kiếm: ");
            String nameFind = scanner.nextLine();

            for (Student student : studentList) {
                if (student.getName().toLowerCase().contains(nameFind.toLowerCase())) {
                    System.out.println(student);
                    isExist = true;
                }
            }
        }
        if (!isExist) {
            System.out.println("Không tìm thấy!");
        }
    }

    @Override
    public void addStudent() {
        Student student = infoStudent();
        studentList.add(student);
        System.out.println("Thêm mới thành công!!");
    }

    @Override
    public void sortUp() {
        int chose;
        do {
            System.out.println("1.Sắp xếp điểm tăng dần\n" +
                    "2.Sắp xếp điểm giảm dần\n" +
                    "3.Về menu chính \n");
            chose = Integer.parseInt(scanner.nextLine());

            switch (chose) {
                case 1:
                    studentList.sort(sortByScoreUpService);
                    for (Student student : studentList) {
                        System.out.println(student);
                    }
                    break;
                case 2:
                    studentList.sort(sortPriceDowndService);
                    for (Student student : studentList) {
                        System.out.println(student);
                    }
                    break;
                case 3:
                    return;
                default:
                    System.out.print("Mời bạn nhập lại!!!");
            }
        } while (true);
    }

    @Override
    public void sortNameByBubble() {
        boolean needNextPass = true;
        for (int i = 0; i < studentList.size() - 1 && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < studentList.size() - 1 - i; j++) {
                if (studentList.get(j).getName().compareTo(studentList.get(j + 1).getName()) > 0) {
                    Collections.swap(studentList, j, j + 1);
                    needNextPass = true;
                }
            }
        }
    }

    public static Student infoStudent() {
        int id = 0;
        while (true) {
            try {
                System.out.print("Nhập id: ");
                id = Integer.parseInt(scanner.nextLine());

                for (Student student : studentList) {
                    if (student.getId() == id) {
                        throw new DuplicateIDException("Trùng id, vui lòng nhập lại!");
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            } catch (DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.print("Nhập tên:");
        String name = scanner.nextLine();

        double score =0;
        while (true){
            try{
                System.out.print("Nhập điểm :");
                score = Double.parseDouble(scanner.nextLine());
             break;
            }catch(NumberFormatException e){
                System.out.print("Vui lòng nhập số!");
            }

        }
//        System.out.print("Nhập điểm: ");
//        double score = Double.parseDouble(scanner.nextLine());

        Student student = new Student(id, name, score);
        return student;

    }
}
