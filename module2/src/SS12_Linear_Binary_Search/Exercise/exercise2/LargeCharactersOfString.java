package SS12_Linear_Binary_Search.Exercise.exercise2;

import java.util.LinkedList;
import java.util.Scanner;

public class LargeCharactersOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String string = sc.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            if (list.size() > 1 && string.charAt(i) < list.getLast() ) {
                list.clear();                //1 câu lệnh
            }
            list.add(string.charAt(i));         // 1 câu lệnh

            if (list.size() > max.size()) {  // 1 câu lệnh
                max.clear();
                max.addAll(list);
            }
        }

// T1: 1 vòng lặp trong 3 câu lệnh  = n + 3

        for (Character ch : max) {
            System.out.print(ch);
        }
        System.out.println();
    }
// T2 :1 vòng lặp 1 câu lệnh = n + 1
/************************************
 * T(1 +2) = n + 3 + n + 1
 * T(n) = O(n)
 *  T(n) = O(n)
 */
}
