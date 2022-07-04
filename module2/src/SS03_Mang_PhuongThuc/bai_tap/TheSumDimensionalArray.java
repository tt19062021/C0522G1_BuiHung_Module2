package SS03_Mang_PhuongThuc.bai_tap;

import java.util.Scanner;

public class TheSumDimensionalArray {
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
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr2D[i][j] + "\t");
            }
            System.out.println("\n");
        }

        int sum = diagonalLineOfDimensionalArray(arr2D);
        System.out.println("Tổng đường chéo trong mảng arr2D :" + sum);
    }

    public static int diagonalLineOfDimensionalArray(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i] == array[j]) {
                    sum = sum + array[i][j];
                }
            }
        }
        return sum;

    }
}
