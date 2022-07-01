package SS01_introduction_java.thuc_hanh;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter a year: ");
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("is a leap year" + year);
                }else{
                    System.out.println("is not a leap year" + year);
                }
            }else{
                System.out.println("is a leap year:"+year);
            }
        }else{
            System.out.println("is Not leap year"+year);
        }
    }
}
