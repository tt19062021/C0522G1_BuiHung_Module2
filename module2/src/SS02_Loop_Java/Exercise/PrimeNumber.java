package SS02_Loop_Java.Exercise;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int inputNum;
        int count = 0;                          // đếm số ước của số đang xét;
        int countSNT = 0;                       // đếm xem đã đủ số lượng số nguyên tố cần in ra chưa;
        Scanner scanner = new Scanner(System.in);
        System.out.println("In ra dãy số nguyên tố đầu tiên:");
        inputNum = scanner.nextInt();


        for (int i = 0; i < 1000; i++) {                // 2,3,4,5,6,7,8,....,1000
            if (countSNT < inputNum) {                  // Nếu số lượng SNT in ra < so với số lượng yêu cầu
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count += 1;
                    }
                }
                if (count == 2) {
                    System.out.print(i+","); //4
                    countSNT += 1; //1
                }
                count = 0;
            } else {
                break;
            }
        }
    }
}
