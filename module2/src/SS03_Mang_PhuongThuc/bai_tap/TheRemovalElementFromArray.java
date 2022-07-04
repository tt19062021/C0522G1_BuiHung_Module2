package SS03_Mang_PhuongThuc.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TheRemovalElementFromArray {
    public static void main(String[] args) {
        int[] myList = {1, 2, 2, 4, 5, 6, 7, 8, 9};
        int x;
        int index = 0;
        boolean notInArray = false ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào X:");
        x = scanner.nextInt();

        for( int i =0 ;i<myList.length;i++){
            if(x == myList[i]){
                index =i;
                System.out.print("Có " + x + "trong mảng myList =  " + myList[i] + " \n tại vị trí " + index +"\n");
                notInArray = true;
                break;
            }
        }
        if(!notInArray){
            System.out.println("Khong tim thay" + x);
        }

        System.out.print(Arrays.toString(myList) + "\n");

        for (int i = 0; i < myList.length; i++) {
            if (x == myList[i]) {
                for (int j = i; j < myList.length - 1; j++) {
                    myList[j] = myList[j + 1];
                }
                myList[myList.length - 1] = 0;
                i--;
            }
        }
        System.out.println("Mảng myList sau khi xóa " + x +"\n" + "là"+Arrays.toString(myList));
    }
}
