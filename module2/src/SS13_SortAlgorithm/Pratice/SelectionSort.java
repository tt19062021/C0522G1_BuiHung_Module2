package SS13_SortAlgorithm.Pratice;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            /* Find the minimum in the list[i..list.length-1] */
            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            /* Swap list[i] with list[currentMinIndex] if necessary */
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào độ dài mảng : ");
        int[] arr = new int[Integer.parseInt(sc.nextLine())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 - 1);
        }
        System.out.println("Mảng đầu: "+ Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Mảng đã sắp xếp : "+Arrays.toString(arr));
    }
}
