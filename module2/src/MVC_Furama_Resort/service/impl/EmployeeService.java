package MVC_Furama_Resort.service.impl;

import MVC_Furama_Resort.model.Employee;
import MVC_Furama_Resort.service.IEmployeeService;
import MVC_Furama_Resort.untils.ReadFileUntil;
import MVC_Furama_Resort.untils.WriteFileUntil;
import SS11_Java_Collection_Framework.Exercise2.MVC_Product.model.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private static final String PATH = "src/MVC_Furama_Resort/untils/ListEmployee.csv";
    private static Scanner sc = new Scanner(System.in);

    @Override
    public void display() throws IOException {
        employeeList = ReadFileUntil.readEmployeeFile(PATH);
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    public int inputId() {
        int id = 0;
        while (true) {
            try {
                System.out.print("Nhập mã số nhân viên: ");
                id = Integer.parseInt(sc.nextLine());

                for (Employee employee : employeeList) {
                    if (employee.getId() == id) {
                        throw new NumberFormatException("Trùng id, vui lòng nhập lại!");
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            }
        }
        return id;
    }

    public String inputName() {
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        return name;
    }

    public String inputBirthDay() {
        System.out.print("Nhập ngàysinh/tháng/năm: ");
        String birthDay = sc.nextLine();
        return birthDay;
    }

    public String inputGender() {
        System.out.print("Nhập giới tính (Nam hoặc Nữ): ");
        String gender = sc.nextLine();
        return gender;
    }

    public int inputIdCard() {
        int idCard = 0;
        while (true) {
            try {
                System.out.print("Nhập CMND: ");
                idCard = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số !!!");
            }
        }
        return idCard;
    }

    public int inputPhone() {
        int phone = 0;
        while (true) {
            try {
                System.out.print("Nhập số điện thoại: ");
                phone = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số !!!");
            }
        }
        return phone;
    }

    public String inputGmail() {
        System.out.print("Nhập gmail: ");
        String gmail = sc.nextLine();
        return gmail;
    }

    public String inputDegree() {
        System.out.print("Nhập vào trình độ: ");
        String degree = sc.nextLine();
        return degree;
    }

    public String inputPosition() {
        System.out.print("Nhập vào chức vụ thuộc công ty: ");
        String position = sc.nextLine();
        return position;
    }

    public int inputSalary() {
        int salary = 0;
        while (true) {
            try {
                System.out.print("Nhập tiền lương: ");
                salary = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số !!!");
            }
        }
        return salary;
    }

    @Override
    public void add() {
        List<Employee> employeeList = ReadFileUntil.readEmployeeFile(PATH);
        Employee employee = new Employee(inputId()
                , inputName()
                , inputBirthDay()
                , inputGender()
                , inputIdCard()
                , inputPhone()
                , inputGmail()
                , inputDegree()
                , inputPosition()
                , inputSalary());
        employeeList.add(employee);
        WriteFileUntil.writeEmployeeFile(PATH, employeeList);
        System.out.println("Thêm mới thành công !!!");
    }

    @Override
    public void repair() {
        List<Employee> employeeList = ReadFileUntil.readEmployeeFile(PATH);
        System.out.print("Nhập vào mã nhân viên cần sửa: ");
        int idRepair = Integer.parseInt(sc.nextLine());

        for (int i =0; i< employeeList.size();i++) {
            if (idRepair == employeeList.get(i).getId()) {
                employeeList.get(i).setId(inputId());
                employeeList.get(i).setName(inputName());
                employeeList.get(i).setBirthDay(inputBirthDay());
                employeeList.get(i).setGender(inputGender());
                employeeList.get(i).setIdCard(inputIdCard());
                employeeList.get(i).setPhone(inputPhone());
                employeeList.get(i).setGmail(inputGmail());
                employeeList.get(i).setDegree(inputDegree());
                employeeList.get(i).setPosition(inputPosition());
                employeeList.get(i).setSalary(inputSalary());

            }
        }
        WriteFileUntil.writeEmployeeFile(PATH,employeeList);
        System.out.println("Sửa dữ liệu thành công!!!");
    }

    @Override
    public void remove() {
        List<Employee> employeeList = ReadFileUntil.readEmployeeFile(PATH);
        System.out.print("Nhập vào mã nhân viên cần xóa: ");
        int id = Integer.parseInt(sc.nextLine());
        boolean isFlag = false;
        for (Employee employee : employeeList) {
            if (id == employee.getId()) {
                System.out.println(" Bạn có chắc muốn xóa hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(sc.nextLine());
                if (chooseYesNo == 1) {
                    employeeList.remove(employee);
                    System.out.println("Xóa thành công !!!");
                }
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("!! Không tìm thấy mã nhân viên !!");
        }
        WriteFileUntil.writeEmployeeFile(PATH,employeeList);
    }
}
