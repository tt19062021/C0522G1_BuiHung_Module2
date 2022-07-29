package MVC_Furama_Resort.service.impl;

import MVC_Furama_Resort.model.Customer;

import MVC_Furama_Resort.service.ICustomerService;
import MVC_Furama_Resort.untils.ReadFileUntil;
import MVC_Furama_Resort.untils.WriteFileUntil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static Scanner sc = new Scanner(System.in);
    private static List<Customer> customerList = new ArrayList<>();
    private final String PATH_CUSTOMER = "src/MVC_Furama_Resort/untils/listcustomer.csv";

    public int inputId() {
        int id = 0;
        while (true) {
            try {
                System.out.print("Nhập mã số khách hàng: ");
                id = Integer.parseInt(sc.nextLine());

                for (Customer customer : customerList) {
                    if (customer.getId() == id) {
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
        System.out.println("Nhập giới tính: \n" +
                "1.Nam\n" +
                "2.Nữ");
        int chose = 0;
        do {
            try {
                chose = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!!");
            }
            switch (chose) {
                case 1:
                    return "Nam";
                case 2:
                    return "Nữ";
                default:
                    System.out.println("Nhập không đúng!!,Vui lòng nhập lại.");
            }
        } while (true);
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

    public String inputCustomerType() {
        System.out.println("Phân hạng khách hàng:\n" +
                "1.Diamond\n" +
                "2.Platinum\n" +
                "3.Gold\n" +
                "4.Silver\n" +
                "5.Member");
        int chose = 0;
        do {
            try {
                chose = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số !!!");
            }
            switch (chose) {
                case 1:
                    return "Diamond";
                case 2:
                    return "Platinum";
                case 3:
                    return "Gold";
                case 4:
                    return "Silver";
                case 5:
                    return "Member";
                default:
                    System.out.println("Lựa chọn không đúng!! , Nhập lại");
            }
        } while (true);
    }

    public String inputGmail() {
        System.out.print("Nhập gmail: ");
        return sc.nextLine();
    }

    public String inputAddress() {
        System.out.print("Địa chỉ khách hàng: ");
        String address = sc.nextLine();
        return address;
    }

    @Override
    public void display() {
        customerList = ReadFileUntil.readCustomerFile(PATH_CUSTOMER);
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void add() {
        customerList = ReadFileUntil.readCustomerFile(PATH_CUSTOMER);
        Customer customer = new Customer(inputId()
                , inputName()
                , inputBirthDay()
                , inputGender()
                , inputIdCard()
                , inputPhone()
                , inputGmail()
                , inputCustomerType()
                , inputAddress());
        customerList.add(customer);
        WriteFileUntil.writeCustomerFile(PATH_CUSTOMER, customerList);
        System.out.println("Thêm mới thành công!!");

    }

    @Override
    public void repair() {
        customerList = ReadFileUntil.readCustomerFile(PATH_CUSTOMER);
        System.out.print("Nhập vào mã nhân viên cần sửa: ");
        int idRepair = Integer.parseInt(sc.nextLine());

        for (Customer customer : customerList) {
            if (idRepair == customer.getId()) {
                customer.setId(inputId());
                customer.setName(inputName());
                customer.setBirthDay(inputBirthDay());
                customer.setGender(inputGender());
                customer.setIdCard(inputIdCard());
                customer.setPhone(inputPhone());
                customer.setGmail(inputGmail());
                customer.setCustomerType(inputCustomerType());
                customer.setAddress(inputAddress());
                WriteFileUntil.writeCustomerFile(PATH_CUSTOMER, customerList);
            }
        }
        System.out.println("Sửa dữ liệu thành công!!!");
    }

}
