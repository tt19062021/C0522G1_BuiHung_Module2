package SS03_Mang_PhuongThuc.Practice;

import java.util.Scanner;

public class ThePrime {
    // return Đúng sai
    static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for (int i=2; i<=Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    static void isPrime2(int n){
        if(n<2){
            System.out.println("n không phải số nguyên tố");
            return;
        }
        for (int i=2; i<=Math.sqrt(n);i++){
            if(n%i == 0){
                System.out.println("n không phải số nguyên tố");
                return;
            }
        }
        System.out.println("n là số nguyên tố");
    }
    int inputPositive(String target){
        Scanner scanner = new Scanner(System.in);
        int n;
        boolean isInvalindN;//
        do{
            System.out.printf("nhập vào %s :", target);
            n = scanner.nextInt();
            isInvalindN = n<0;

            if(isInvalindN){
                System.out.printf("%s >=0 , xin kiểm tra lại!!! \n");
            }
        }while (isInvalindN);
            return  n;
    }

    public static void main(String[] args) {
        //kiểm tra số nguyên tố
        //đếm trong mảng có bao nhiêu số nguyên tố
        ThePrime temp = new ThePrime();
        int n = temp.inputPositive("n");
        // Kiem TRA XEM N CÓ PHẢI SỐ NGUYÊN TỐ
        isPrime2(n);
        isPrime(n);
    }
}
