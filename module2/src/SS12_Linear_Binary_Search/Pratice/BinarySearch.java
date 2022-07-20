package SS12_Linear_Binary_Search.Pratice;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Số phần tử trong mảng(ramdom) : ");
        int size = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=(int)(Math.random()*100);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("Nhập vào sô cần tìm");
        int x = Integer.parseInt(scanner.nextLine());

        System.out.println("Vị trí trong mảng là: " + binarySearch(arr,0,arr.length-1,x));
    }

    static int binarySearch(int[] list, int left, int right, int key) {
        left = 0;
        right = list.length- 1;
        while (right >= left) {
            int mid = (left + right) / 2;
            if (key < list[mid]) {
                right = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
