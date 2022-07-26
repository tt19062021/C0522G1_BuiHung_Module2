package MVCPerson.untils;

import MVCPerson.model.Student;
import MVCPerson.model.Teacher;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileUntil {
    public static void writeFile(String path,String data) throws IOException {
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(data);
        bufferedWriter.close();
    }
    public static void writeStudentFile(String path, List<Student> students) throws IOException {
        String data = "";
        for(Student student :students){
            data += student.getInfo();
        }
        writeFile(path,data);
    }
    public static void writeTeacherFile(String path, List<Teacher> teachers) throws IOException {
        String data = "";
        for (Teacher teacher : teachers) {
            data += teacher.getInfo();
        }
        writeFile(path,data);
    }
}
