package SS13_SortAlgorithm.Pratice;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào độ dài mảng : ");
        int[] arr = new int[Integer.parseInt(sc.nextLine())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 - 1);
        }
        System.out.println("Mảng đầu: "+Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Mảng đã sắp xếp : "+Arrays.toString(arr));
    }

    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;
        for (int i = 0; i < list.length - 1 && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    //Đổi list[j] thành list[j+1]
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }
}
