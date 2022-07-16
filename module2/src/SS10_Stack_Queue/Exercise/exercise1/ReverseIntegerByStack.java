package SS10_Stack_Queue.Exercise.exercise1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class ReverseIntegerByStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> integerStack = new Stack<>();

        System.out.print("Nhập vào độ dài mảng :");
        int length = scanner.nextInt();

       for(int i =0 ; i < length; i++){
           System.out.print("Nhập vào phần tử thứ "+i+" : ");
           integerStack.push(scanner.nextInt());
       }

        System.out.println("Mảng vừa nhập : "+ integerStack);

        Stack<Integer> newStack = new Stack<>();

        while (!integerStack.isEmpty()) {
            newStack.push(integerStack.pop());
        }

        for(int element : newStack){
            integerStack.push(element);
        }
        System.out.println("Mảng đảo ngược: "+integerStack);
    }
}
