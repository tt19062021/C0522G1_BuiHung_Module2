package SS03_Mang_PhuongThuc.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThePushElementToArray {
    public static void main(String[] args) {
        int[] myList = {1, 2, 2, 4, 5, 6, 7, 8, 9};
        int x;
        int index;
        boolean isNotLength;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào giá trị cần thêm vào mảng:");
        x = scanner.nextInt();

        do {
            System.out.print("Nhập vào vị trí cần chèn");
            index = scanner.nextInt();
            isNotLength = index <= -1 || index >= myList.length;
            if (isNotLength)
                System.out.println("Mời bạn nhập lại ");
        } while (isNotLength);


        System.out.print(Arrays.toString(myList) + "\n");
        int newLength = myList.length;
        int[] newMyList = Arrays.copyOf(myList, newLength + 1);

        newMyList[index] = x; // vị trí thêm phần tử mới vào mảng

        for(int i = index + 1; i < newMyList.length; i++) {
            newMyList[i] = myList[i - 1];
        }
        System.out.println("Mảng mới:" + Arrays.toString(newMyList));

    }
}
