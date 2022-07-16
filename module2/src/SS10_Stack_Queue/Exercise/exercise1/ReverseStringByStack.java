package SS10_Stack_Queue.Exercise.exercise1;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStringByStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> characterStack = new Stack<>();

        System.out.println("Nhập vào chuổi ký tự: ");
        String character = sc.nextLine();
        /**
         * Chuyển chuổi String thành mảng ký tự.
         */
        for (char i = 0; i < character.length(); i++) {
            char ch = character.charAt(i);
            characterStack.push(ch);
        }
        System.out.print("Chuổi ban đầu : " + characterStack);


        Stack<Character> newStack = new Stack<>();

        while (!characterStack.isEmpty()) {
            newStack.push(characterStack.pop());
        }

        for(char element : newStack){
            characterStack.push(element);
        }
        System.out.println("Chuổi đảo ngược: "+characterStack);
    }
}
