package SS03_Mang_PhuongThuc.thuc_hanh;

import java.util.Scanner;

public class TheCountStudentPass {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập vào size");
            size = sc.nextInt();
            if (size > 30) {
                System.out.print("Số lượng nhỏ hơn 30, nhập lại:");
            }
        } while (size > 30);


        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Nhập vào điểm " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            i++;
        }
        int count = 0;
        System.out.print("Danh sách điểm: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
            if (arr[j] >= 5 && arr[j] <= 10)
                count++;
        }
        System.out.print("\n The number of students passing the exam is " + count);
    }
}
