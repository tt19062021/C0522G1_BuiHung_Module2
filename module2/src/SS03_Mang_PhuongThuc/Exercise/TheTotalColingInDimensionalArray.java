package SS03_Mang_PhuongThuc.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TheTotalColingInDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số hàng:");
        int row = sc.nextInt();

        System.out.print("Nhập vào số cột:");
        int col = sc.nextInt();

        int[][] arr2D = new int[row][col];

        for (int i = 0; i < row; i++) {                          //Nhap vao ma trận
            for (int j = 0; j < col; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                arr2D[i][j] = sc.nextInt();
            }
        }
        System.out.println("Ma trận arr2D");                    // in ra ma trận
        for (int i = 0; i < arr2D.length; i++) {
            System.out.println(Arrays.toString(arr2D[i]));
//            for (int j = 0; j < col; j++) {
//                System.out.print(arr2D[i][j] + "\t");
//            }
//            System.out.println("\n");
        }
        System.out.print("Bạn muốn tính tổng của cột nào: ");
        int index = sc.nextInt();
        int sum = 0;
        for (int j = 0; j < arr2D[index].length; j++) {
            sum = sum + arr2D[index][j];
        }
        System.out.print("Cột " + index + " có tổng là: " + sum);
    }
}
