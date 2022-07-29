package MVC_Furama_Resort.untils;


import MVC_Furama_Resort.model.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReadFileUntil {
    public static List<String> readFile(String path) {
        List<String> stringList = new ArrayList<>();
        String line;
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return stringList;
    }

    public static List<Employee> readEmployeeFile(String path) {
        List<String> stringList = readFile(path);
        List<Employee> employeeList = new ArrayList<>();
        String[] info;
        for (String line : stringList) {
            info = line.split(",");
            employeeList.add(new Employee(
                    Integer.parseInt(info[0]),
                    info[1],
                    info[2],
                    info[3],
                    Integer.parseInt(info[4]),
                    Integer.parseInt(info[5]),
                    info[6],
                    info[7],
                    info[8],
                    Integer.parseInt(info[9])));
        }
        return employeeList;
    }

    public static List<Customer> readCustomerFile(String path) {
        List<String> stringList = readFile(path);
        List<Customer> customerList = new ArrayList<>();
        String[] info;
        for (String line : stringList) {
            info = line.split(",");
            customerList.add(new Customer(
                    Integer.parseInt(info[0]),
                    info[1],
                    info[2],
                    info[3],
                    Integer.parseInt(info[4]),
                    Integer.parseInt(info[5]),
                    info[6],
                    info[7],
                    info[8]));
        }
        return customerList;
    }

    public static Map<Villa, Integer> readVillaFile(String path) {
        List<String> stringList = readFile(path);
        Map<Villa, Integer> villaIntegerMap = new LinkedHashMap<>();
        String[] info;
        for (String line : stringList) {
            info = line.split(",");
            Villa villa = new Villa(info[0],info[1],
                    Double.parseDouble(info[2]),
                    Integer.parseInt(info[3]),
                    Integer.parseInt(info[4]),
                    info[5],
                    info[6],
                    Double.parseDouble(info[7]),
                    Integer.parseInt(info[8]));
            villaIntegerMap.put(villa, Integer.parseInt(info[9]));
        }
        return villaIntegerMap;
    }

    public static Map<House, Integer> readHouseFile(String path) {
        List<String> stringList = readFile(path);
        Map<House, Integer> houseIntegerMap = new LinkedHashMap<>();
        String[] info;
        for (String line : stringList) {
            info = line.split(",");
            houseIntegerMap.put(new House(info[0],info[1],
                    Double.parseDouble(info[2]), Integer.parseInt(info[3]),
                    Integer.parseInt(info[4]), info[5],
                    info[6], Integer.parseInt(info[7])),
                    Integer.parseInt(info[8]));
        }
        return houseIntegerMap;
    }

    public static Map<Room, Integer> readRoomFile(String path) {
        List<String> stringList = readFile(path);
        Map<Room, Integer> roomIntegerMap = new LinkedHashMap<>();
        String[] info;
        for (String line : stringList) {
            info = line.split(",");
            roomIntegerMap.put(new Room(info[0],info[1], Double.parseDouble(info[2]),
                    Integer.parseInt(info[3]), Integer.parseInt(info[4]),
                    info[5], info[6]),
                    Integer.parseInt(info[7]));
        }
        return roomIntegerMap;
    }


}
