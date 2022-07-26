package MVC_Furama_Resort.service.impl;

import MVC_Furama_Resort.model.Employee;
import MVC_Furama_Resort.service.IEmployeeService;
import MVC_Furama_Resort.untils.ReadFileUntil;
import MVC_Furama_Resort.untils.WriteFileUntil;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private static final String PATH = "src/MVC_Furama_Resort/untils/listemployee.csv";
     Scanner sc = new Scanner(System.in);

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
        return sc.nextLine();
    }

    public String inputBirthDay() {
        System.out.print("Nhập ngàysinh/tháng/năm: ");
        return sc.nextLine();
    }

    public String inputGender() {
        System.out.print("Nhập giới tính: \n"+
                "1.Nam\n"+
                "2.Nữ");
        int chose = 0 ;
        do{
            try{
                chose  = Integer.parseInt(sc.nextLine());
            }catch(NumberFormatException e){
                System.out.println("Vui lòng nhập số!!");
            }switch(chose){
                case 1:
                    return "Nam";
                case 2:
                    return "Nữ";
                default:
                    System.out.println("Nhập không đúng!!,Vui lòng nhập lại.");
            }
        }while(true);
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
        return sc.nextLine();
    }

    public String inputDegree() {
        System.out.print("Nhập trình độ hiện có:\n" +
                "1.Đại học\n" +
                "2.Cao đẳng\n" +
                "3.Trung cấp\n" +
                "4.Sau đại học");
        int chose = 0 ;
        do{
            try{
                chose  = Integer.parseInt(sc.nextLine());
            }catch(NumberFormatException e){
                System.out.println("Vui lòng nhập số!!");
            }switch(chose){
                case 1:
                    return "Đại học";
                case 2:
                    return "Cao đẳng";
                case 3:
                    return "Trung cấp";
                case 4:
                    return "Sau đại học";
                default:
                    System.out.println("Nhập không đúng!!,Vui lòng nhập lại.");
            }
        }while(true);
    }

    public String inputPosition() {
        System.out.print("Vị trí nhân viên:\n" +
                "1.Lễ tân\n" +
                "2.Phục vụ\n" +
                "3.Quản lý\n" +
                "4.Chuyên viên\n" +
                "5.Giám sát\n" +
                "6.Giám đốc");
        int chose = 0 ;
        do{
            try{
                chose  = Integer.parseInt(sc.nextLine());
            }catch(NumberFormatException e){
                System.out.println("Vui lòng nhập số!!");
            }switch(chose){
                case 1:
                    return "Lễ tân";
                case 2:
                    return "Phục vụ";
                case 3:
                    return "Quản lý";
                case 4:
                    return "Chuyên viên";
                case 5:
                    return "Giám sát";
                case 6:
                    return "Giám đốc";
                default:
                    System.out.println("Nhập không đúng!!,Vui lòng nhập lại.");
            }
        }while(true);
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
         employeeList = ReadFileUntil.readEmployeeFile(PATH);
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
        employeeList = ReadFileUntil.readEmployeeFile(PATH);
        System.out.print("Nhập vào mã nhân viên cần sửa: ");
        int idRepair = Integer.parseInt(sc.nextLine());

        for (Employee employee : employeeList) {
            if (idRepair == employee.getId()) {
                employee.setId(inputId());
                employee.setName(inputName());
                employee.setBirthDay(inputBirthDay());
                employee.setGender(inputGender());
                employee.setIdCard(inputIdCard());
                employee.setPhone(inputPhone());
                employee.setGmail(inputGmail());
                employee.setDegree(inputDegree());
                employee.setPosition(inputPosition());
                employee.setSalary(inputSalary());
                WriteFileUntil.writeEmployeeFile(PATH,employeeList);
            }
        }

        System.out.println("Sửa dữ liệu thành công!!!");
    }

    @Override
    public void remove() {
        employeeList = ReadFileUntil.readEmployeeFile(PATH);
        System.out.print("Nhập vào mã nhân viên cần xóa: ");
        int id = Integer.parseInt(sc.nextLine());

        boolean isFlag = false;
        for (Employee employee : employeeList) {
            if (id == employee.getId()) {
                System.out.println(
                         "Bạn có chắc muốn xóa hay không?\n"+
                        "1.Có\n"+
                        "2.Không");
                int chooseYesNo = Integer.parseInt(sc.nextLine());
                if (chooseYesNo == 1) {
                    employeeList.remove(employee);
                    WriteFileUntil.writeEmployeeFile(PATH,employeeList);
                    System.out.println("Xóa thành công !!!");
                }
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("!! Không tìm thấy mã nhân viên !!");
        }
    }

}
