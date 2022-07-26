package SS17_String_reget.exercise.service;


import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class ExtraClassService implements IExtraClassService {
    @Override
    public void add() {
        Scanner sc = new Scanner(System.in);
    String className;
        do{
            try{
                System.out.println("Nhập vào tên lớp: ");
                className = sc.nextLine();
                if(className.matches("^[CAP][\\d]{4}[G-M]$")){
                    System.out.println("Tên lớp : " + className.trim());
                    break;
                }else{
                    System.out.println("Sai định dạng!!");
                }
            }catch(PatternSyntaxException e){
                e.printStackTrace();
            }
        }while(true);

        String phone;
        do{
            try{
                System.out.println("Nhập vào số điện thoại:");
                phone = sc.nextLine();
                if(phone.matches("^[\\d]{2}[-][0][\\d]{9}$")){
                    System.out.println("Số đt: " + phone.trim() );
                    break;
                }else{
                    System.out.println("Sai định dạng!!!");
                }
            }catch(NumberFormatException e){
                e.printStackTrace();
            }
        }while(true);
    }



}
