package SS12_Linear_Binary_Search.Pratice;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào sô phần tử của mảng");

        int[] arrays = new int[Integer.parseInt(scanner.nextLine())];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = (int) (Math.random() * 1000);
        }
        Arrays.sort(arrays);

        System.out.println(Arrays.toString(arrays));
        System.out.println("Nhập vào sô cần tìm");
        int x = Integer.parseInt(scanner.nextLine());

        System.out.println("Vj trí của số cần tìm trong mảng là: " + binarySearch(arrays, 0, arrays.length - 1, x));
    }

    static int binarySearch(int[] list,int left, int right, int key) {
        left = 0;
        right = list.length - 1;
        while (right >= left){
            int mid = (left + right)/2;
            if(key<list[mid]){
                right = mid -1;
            }else if(key == list[mid]){
                return mid;
            }else {
                left = mid +1;
            }
        }
        return -1;
    }
}
