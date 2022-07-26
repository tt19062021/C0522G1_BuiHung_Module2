package MVC_Furama_Resort.untils;

import MVC_Furama_Resort.model.Customer;
import MVC_Furama_Resort.model.Employee;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileUntil {
    public static void writeFile(String path,String data) {
        try{
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void writeEmployeeFile(String path, List<Employee> employeeList) {
        String data = "";
        for(Employee employee :employeeList){
            data += employee.getInfo();
        }
        writeFile(path,data);
    }
    public static void writeCustomerFile(String path, List<Customer> customerList) {
        String data = "";
        for(Customer customer :customerList){
            data += customer.getInfo();
        }
        writeFile(path,data);
    }
}
