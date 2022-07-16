package SS10_Stack_Queue.Exercise.exercise2;

import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> integerStack = new Stack<>();
        int number;

        do {
            System.out.print("Nhập vào số:");
            number = sc.nextInt();

            if (number < 0) {
                System.out.println("Bạn nhập sai, Mời bạn nhập lại:");
            }
        } while (number < 0 );

        while(number >0){
            integerStack.push(number % 2);
            number = number / 2;
        }
//        System.out.println(integerStack);
        while(!integerStack.isEmpty()){
            System.out.print(integerStack.pop());
        }
    }
}
