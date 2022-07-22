package SS15_IO_TextFile.Exercise.exercise1.controller;

import java.io.*;
import java.util.Scanner;

public class WriteCopyFile {
    public static void main(String [] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào file để copy:");
        String str1 = sc.nextLine();

        System.out.println("Nhập vào file đích đến:");
        String str2 = sc.nextLine();


        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            Reader reader = new FileReader(str1);
            Writer writer = new FileWriter(str2);

            bufferedReader = new BufferedReader(reader);
            bufferedWriter = new BufferedWriter(writer);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                System.out.println("Ký tự trong file là: "+ line.length());
            }
        } finally {
            if (bufferedReader != null) {
                System.out.print("Dữ liệu đang được sao chép....");
                bufferedReader.close();
            }else{
                System.out.println("Không có dữ liệu để sao chép");
            }
            if (bufferedWriter != null) {
                System.out.println("Sao chép dữ liệu thành công!!!");
                bufferedWriter.close();
            }else{
                System.out.println("Không có đích đến, vui lòng nhập đích đến!");
            }
        }
    }
}
