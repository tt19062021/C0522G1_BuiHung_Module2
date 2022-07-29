package MVCPerson.service.impl;

import MVCPerson.exception.DuplicateIDException;
import MVCPerson.model.Student;
import MVCPerson.service.IStudentService;
import MVCPerson.untils.ReadFileUntil;
import MVCPerson.untils.WriteFileUntil;

import java.io.IOException;
import java.util.*;
import java.util.regex.PatternSyntaxException;

public class StudentService implements IStudentService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Student> studentList = new ArrayList<>();
    private static SortByScoreUpService sortByScoreUpService = new SortByScoreUpService();
    private static SortByScoreDownService sortPriceDowndService = new SortByScoreDownService();
    private static final String REGEX = "^(((0[1-9]|[12][0-9]|30)[-/](0[13-9]|1[012])|31[-/](0[13578]|1[02])" +
            "|(0[1-9]|1[0-9]|2[0-8])[-/]?02)[-/][0-9]{4}|29[-/]02[-/]([0-9]{2}" +
            "(([2468][048]|[02468][48])|[13579][26])|([13579][26]|[02468][048]|0[0-9]|1[0-6])00))$";


    @Override
    public void findAll() throws IOException {
        studentList = ReadFileUntil.readStudentFile("src/MVCPerson/untils/StudentList.txt");
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
    public void addStudent() throws IOException {
        List<Student> students = ReadFileUntil.readStudentFile("src/MVCPerson/untils/StudentList.txt");
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
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();

        String dateOfBirth;
        do {
            try {
                System.out.print("Nhập vào ngày sinh: ");
                dateOfBirth = scanner.nextLine();
                if (dateOfBirth.matches(REGEX)) {
                    System.out.println("dd/MM/YYYY: " + dateOfBirth.trim());
                    break;
                } else {
                    System.out.println("Sai định dạng!!!");
                }
            } catch (PatternSyntaxException e) {
                e.printStackTrace();
            }
        } while (true);

        double score = 0;
        while (true) {
            try {
                System.out.print("Nhập điểm :");
                score = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.print("Vui lòng nhập số!");
            }
        }

        students.add(new Student(id, name, dateOfBirth, score));

        WriteFileUntil.writeStudentFile("src/MVCPerson/untils/StudentList.txt", students);
    }

    @Override
    public void sortUp() throws IOException {
        studentList = ReadFileUntil.readStudentFile("src/MVCPerson/untils/StudentList.txt");
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
                    WriteFileUntil.writeStudentFile("src/MVCPerson/untils/StudentList.txt", studentList);
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


}
