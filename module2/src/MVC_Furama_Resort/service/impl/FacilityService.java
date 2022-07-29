package MVC_Furama_Resort.service.impl;

import MVC_Furama_Resort.exception.OverloadedPeople;
import MVC_Furama_Resort.model.House;
import MVC_Furama_Resort.model.Room;
import MVC_Furama_Resort.model.Villa;
import MVC_Furama_Resort.service.IFacilityService;
import MVC_Furama_Resort.untils.ReadFileUntil;
import MVC_Furama_Resort.untils.WriteFileUntil;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityService implements IFacilityService {
    private static final String LIST_VILLA = "src/MVC_Furama_Resort/untils/listvilla.csv";
    private static final String LIST_HOUSE = "src/MVC_Furama_Resort/untils/listhouse.csv";
    private static final String LIST_ROOM = "src/MVC_Furama_Resort/untils/listroom.csv";
    private static Scanner sc = new Scanner(System.in);


    @Override
    public void display() {
        Map<Villa, Integer> villaIntegerMap = ReadFileUntil.readVillaFile(LIST_VILLA);
        Set<Villa> villaSet = villaIntegerMap.keySet();
        for(Villa villa :villaSet){
            System.out.println(villa + " - " + villaIntegerMap.get(villa));
        }
        Map<House, Integer> houseIntegerMap = ReadFileUntil.readHouseFile(LIST_HOUSE);
        Set<House> houseSet = houseIntegerMap.keySet();
        for(House house :houseSet){
            System.out.println(house + " - " + houseIntegerMap.get(house));
        }
        Map<Room, Integer> roomIntegerMap = ReadFileUntil.readRoomFile(LIST_ROOM);
        Set<Room> roomSet = roomIntegerMap.keySet();
        for(Room room :roomSet){
            System.out.println(room + " - " + roomIntegerMap.get(room));
        }
    }
    public void displayMaintenance(){
        Map<Villa, Integer> villaIntegerMap = ReadFileUntil.readVillaFile(LIST_VILLA);
        Map<House, Integer> houseIntegerMap = ReadFileUntil.readHouseFile(LIST_HOUSE);
        Map<Room, Integer> roomIntegerMap = ReadFileUntil.readRoomFile(LIST_ROOM);

        Set<Villa> villaSet = villaIntegerMap.keySet();
        for(Villa villa :villaSet){
            if(villaIntegerMap.get(villa) > 5){
                System.out.println(villa + " - " + villaIntegerMap.get(villa));
            }
        }

        Set<House> houseSet = houseIntegerMap.keySet();
        for(House house :houseSet) {
            if (houseIntegerMap.get(house) > 5) {
                System.out.println(house + " - " + houseIntegerMap.get(house));
            }
        }

        Set<Room> roomSet = roomIntegerMap.keySet();
        for(Room room :roomSet) {
            if (roomIntegerMap.get(room) > 5) {
                System.out.println(room + " - " + roomIntegerMap.get(room));
            }
        }
    }
    @Override
    public void add() {

    }

    public void addVilla() {
        Map<Villa, Integer> villaIntegerMap = ReadFileUntil.readVillaFile(LIST_VILLA);
        Villa villa = new Villa(getServiceID(),
                getServiceName(),
                getArea(), getCost(), getNumberOfPeople(),
                getRentalType(),
                getRoomStandard(),
                getPoolArea(),
                getNumberOfFloors());

        villaIntegerMap.put(villa, 0);

        WriteFileUntil.writeVillaFile(LIST_VILLA, villaIntegerMap);
        System.out.println("thêm mới thành công!!");
    }

    public void addRoom() {
        Map<Room, Integer> roomIntegerMap = ReadFileUntil.readRoomFile(LIST_ROOM);
        Room room = new Room(getServiceID(),getServiceName(),
                getArea(),
                getCost(),
                getNumberOfPeople(),
                getRentalType(),
                getFreeService());
        roomIntegerMap.put(room, 0);
        WriteFileUntil.writeRoomFile(LIST_ROOM, roomIntegerMap);
        System.out.println("thêm mới thành công!!");
    }

    public void addHouse() {
        Map<House, Integer> houseIntegerMap = ReadFileUntil.readHouseFile(LIST_HOUSE);
        House house = new House(getServiceID() ,getServiceName(),
                getArea(),
                getCost(),
                getNumberOfPeople(),
                getRentalType(),
                getRoomStandard(),
                getNumberOfFloors());
        houseIntegerMap.put(house, 0);
        WriteFileUntil.writeHouseFile(LIST_HOUSE, houseIntegerMap);
        System.out.println("thêm mới thành công !!");
    }
    public String getServiceID(){
        System.out.println("Nhập vào Mã dịch vụ: ");
        return sc.nextLine();
    }

    public String getFreeService() {
        System.out.print("Nhập dịch vụ kèm theo: ");
        return sc.nextLine();
    }

    public double getPoolArea() {
        System.out.print("Nhập vào diện tích hồ bơi: ");
        return Double.parseDouble(sc.nextLine());
    }

    public int getUse() {
        System.out.print("Nhập vào số lần sử dụng: ");
        return Integer.parseInt(sc.nextLine());
    }

    public String getRoomStandard() {
        System.out.print("Nhập vào tiêu chuẩn phòng: ");
        return sc.nextLine();
    }

    public int getNumberOfFloors() {
        System.out.print("Nhập vào số tầng: ");
        return Integer.parseInt(sc.nextLine());
    }

    public String getServiceName() {
        System.out.print("Nhập tên dịch vụ: ");
        return sc.nextLine();
    }

    public double getArea() {
        double area;
        while (true) {
            try {
                System.out.print("Nhập vào diện tích phòng: ");
                area = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!!!");
            }
        }
        return area;
    }

    public int getCost() {
        int cost;
        while (true) {
            try {
                System.out.print("Nhập giá tiền phòng: ");
                cost = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!!");
            }
        }
        return cost;
    }

    public String getRentalType() {
        System.out.print("Kiểu thuê:\n" +
                "1.Năm\n" +
                "2.Tháng\n" +
                "3.Ngày\n" +
                "4.Giờ\n");
        int chose = 0;
        do {
            try {
                chose = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Vui lòng nhập số!!!");
            }
            switch (chose) {
                case 1:
                    return "Năm";
                case 2:
                    return "Tháng";
                case 3:
                    return "Ngày";
                case 4:
                    return "Giờ";
                default:
                    System.out.println("Chọn lại!!!");
            }
        } while (true);
    }

    public int getNumberOfPeople() {
        int numberOfPeople;// nhỏ hơn 20 n
        while (true) {
            try {
                System.out.print("Nhập vào số lượng người ở: ");
                numberOfPeople = Integer.parseInt(sc.nextLine());
                if (numberOfPeople > 20) {
                    throw new OverloadedPeople("Quá số lượng người cho phép!! Tối đa 20 người ");
                }
                break;
            } catch (OverloadedPeople | NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return numberOfPeople;
    }
}
