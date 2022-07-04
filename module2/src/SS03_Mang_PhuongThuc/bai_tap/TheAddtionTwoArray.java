package SS03_Mang_PhuongThuc.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TheAddtionTwoArray {
    public static void main(String[] args) {
        int[] arrA;
        int sizeA;
        int[] arrB;
        int sizeB;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào độ dài Mảng A :");
        sizeA = scanner.nextInt();
        arrA = new int[sizeA];
        for (int i = 0; i < sizeA; i++) {
            System.out.println("arrA[" + i + "] = ");
            arrA[i] = scanner.nextInt();
        }
        System.out.print("Mảng A=" + Arrays.toString(arrA));
        System.out.println("Nhập vào độ dài Mảng B :");
        sizeB = scanner.nextInt();
        arrB = new int[sizeB];
        for (int i = 0; i < sizeB; i++) {
            System.out.println("arrB[" + i + "] = ");
            arrB[i] = scanner.nextInt();
        }
        System.out.print("Mảng B=" + Arrays.toString(arrB)+"\n");

        int[] arrC = Arrays.copyOf(arrA, sizeA+sizeB);

//        int[] arrC;
//        int sizeC = sizeA + sizeB;
//        arrC = new int[sizeC];
//
//        for (int i = 0; i < arrA.length; i++) {
//            arrC[i] = arrA[i];
//        }
//        System.out.println("Mảng C sau khi thêm A :");
//        System.out.println(Arrays.toString(arrC));
//
        int indexB = 0;
        for (int i = arrA.length; i < arrC.length; i++) {
            arrC[i] = arrB[indexB++];
        }
//
        System.out.println("Mảng C sau khi thêm A và B :\n");
        System.out.println(Arrays.toString(arrC));
    }
}
