package MVCPerson.untils;

import MVCPerson.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileUntil {
    public static List<String> readFile(String path) throws IOException {
        File file = new File(path);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;
        List<String> stringList = new ArrayList<>();
        while ((line = bufferedReader.readLine())!=null){
            stringList.add(line);
        }
        bufferedReader.close();
        return stringList;
    }
     public static List<Student> readStudentFile(String path) throws IOException {
        List<String> stringList = readFile(path);
        List<Student> students = new ArrayList<>();
        String[] info ;
        for(String line : stringList){
            info =line.split(",");
            students.add(new Student(Integer.parseInt(info[0]),info[1],Integer.parseInt(info[2])));
        }
        return students;
     }
}
