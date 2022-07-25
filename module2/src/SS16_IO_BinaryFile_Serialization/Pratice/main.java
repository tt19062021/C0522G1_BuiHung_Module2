package SS16_IO_BinaryFile_Serialization.Pratice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void writeToFile(String path, List<Student> students){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1,"hung",8.5));
        list.add(new Student(2,"hung",8));
        list.add(new Student(3,"hung",9));
        list.add(new Student(4,"hung",6));
            writeToFile("src/SS16_IO_BinaryFile_Serialization/Pratice/datastu.txt",list);
            List<Student> list1 = readDataFromFile("src/SS16_IO_BinaryFile_Serialization/Pratice/datastu.txt");
            for(Student student:list1){
                System.out.println(student);
            }
    }
}
