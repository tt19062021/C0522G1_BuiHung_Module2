package MVC_Furama_Resort.regex;

import MVC_Furama_Resort.exception.InputDoubleException;
import MVC_Furama_Resort.exception.InputIDException;

import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class AreaRegex {
    public double getAreaRegex(){
        Scanner sc = new Scanner(System.in);
        double area;
        while (true) {
            try {
                System.out.println("Nhập vào diện tích hồ bơi( > 30m2): ");
                area = Double.parseDouble(sc.nextLine());
                if (area > 30) {
                    break;
                }else {
                    throw new InputDoubleException("Sai định dạng!!");
                }
            } catch (NullPointerException  | InputDoubleException e) {
                e.printStackTrace();
            }
        }
        return area;
    }

    public static void main(String[] args) {
        AreaRegex areaRegex =new AreaRegex();
        System.out.println(areaRegex.getAreaRegex());
    }
}
