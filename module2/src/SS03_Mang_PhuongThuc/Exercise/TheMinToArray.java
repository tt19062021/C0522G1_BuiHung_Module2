package SS03_Mang_PhuongThuc.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TheMinToArray {
    public static int minValue(int[] array) {
        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index += 1;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr1D;
        int size;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập vào chiều dài :");
            size = sc.nextInt();
            if (size > 10) {
                System.out.print("Nhập lại độ dài mảng nhỏ hơn 10 ");
            }
        } while (size > 10);

        arr1D = new int[size];

        int i = 0;
        while (i < arr1D.length) {
            System.out.print("Phần tử trong mảng arr1D " + i + ":");
            arr1D[i] = sc.nextInt();
            i++;
        }

        int min = minValue(arr1D);
        System.out.print("arr1D=" + Arrays.toString(arr1D));
        System.out.println("Phần tử nhỏ nhất trong mảng arr1d là:" + min);
    }
}
