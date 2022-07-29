package MVC_Furama_Resort.untils;

import MVC_Furama_Resort.model.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WriteFileUntil {
    public static void writeFile(String path, String data) {
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeEmployeeFile(String path, List<Employee> employeeList) {
        String data = "";
        for (Employee employee : employeeList) {
            data += employee.getInfo();
        }
        writeFile(path, data);
    }

    public static void writeCustomerFile(String path, List<Customer> customerList) {
        String data = "";
        for (Customer customer : customerList) {
            data += customer.getInfo();
        }
        writeFile(path, data);
    }

    public static void writeVillaFile(String path, Map<Villa, Integer> villaIntegerMap) {
        String data = "";
        Set<Villa> villaSet = villaIntegerMap.keySet();
        for (Villa villa : villaSet) {
            data += villa.getInfo() + "," + villaIntegerMap.get(villa) + "\n";
        }
        writeFile(path, data);
    }

    public static void writeHouseFile(String path, Map<House, Integer> houseIntegerMap) {
        String data = "";
        Set<House> houseSet = houseIntegerMap.keySet();
        for (House house : houseSet) {
            data += house.getInfo() + "," + houseIntegerMap.get(house) + "\n";
        }
        writeFile(path, data);
    }

    public static void writeRoomFile(String path, Map<Room, Integer> roomIntegerMap) {
        String data = "";
        Set<Room> roomSet = roomIntegerMap.keySet();
        for (Room room : roomSet) {
            data += room.getInfo() + "," + roomIntegerMap.get(room) + "\n";
        }
        writeFile(path, data);
    }
}
