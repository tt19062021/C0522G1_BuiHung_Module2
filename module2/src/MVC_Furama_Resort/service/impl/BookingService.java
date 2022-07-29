package MVC_Furama_Resort.service.impl;

import MVC_Furama_Resort.model.Customer;
import MVC_Furama_Resort.model.Facility;
import MVC_Furama_Resort.model.Villa;
import MVC_Furama_Resort.service.IBookingService;
import MVC_Furama_Resort.untils.ReadFileUntil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BookingService implements IBookingService {
    private static final String LIST_VILLA = "src/MVC_Furama_Resort/untils/listvilla.csv";
    private static final String LIST_HOUSE = "src/MVC_Furama_Resort/untils/listhouse.csv";
    private static final String LIST_ROOM = "src/MVC_Furama_Resort/untils/listroom.csv";
    private final String PATH_CUSTOMER = "src/MVC_Furama_Resort/untils/listcustomer.csv";
    private static Scanner sc = new Scanner(System.in);

    @Override
    public void add() {
        List<Customer> customerList = ReadFileUntil.readCustomerFile(PATH_CUSTOMER);
        System.out.print("Danh sách mã khách hàng\n");
        for (Customer customer : customerList) {
            System.out.println("MKH: " + customer.getId() + " ,Tên khách hàng: " + customer.getName());
        }
        System.out.print("Danh sách mã dịch vụ\n");
        Map<Villa, Integer> villaList = ReadFileUntil.readVillaFile(LIST_VILLA);
        for (Villa villa : villaList.keySet()) {
            System.out.println(villa.getServiceID());
        }

    }

    @Override
    public void display() {

    }

    public int getBookingCode() {
        System.out.println("Nhập vào mã đặt phòng: ");
        return Integer.parseInt(sc.nextLine());
    }

    public String getStartDay() {
        System.out.print("Nhập ngày đặt phòng");
        return sc.nextLine();
    }

    public String getEndDay() {
        System.out.print("Nhập ngày kết thúc: ");
        return sc.nextLine();
    }

    public int getCustomerId() {
        System.out.println("Nhập vào mã khách hàng: ");
        return Integer.parseInt(sc.nextLine());
    }

    public String getServiceName() {
        System.out.print("Nhập tên dịch vụ: ");
        return sc.nextLine();
    }

    public String getServiceType() {
        System.out.print("Nhập loại dịch vụ: ");
        return sc.nextLine();
    }

}
