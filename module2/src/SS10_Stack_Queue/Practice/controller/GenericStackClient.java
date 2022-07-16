package SS10_Stack_Queue.Practice.controller;

import SS10_Stack_Queue.Practice.model.MyGenericStack;

public class GenericStackClient {
    public static void main(String[] args) {
        MyGenericStack myGenericStack = new MyGenericStack();

        System.out.println("1. Stack of Integer");
        myGenericStack.stackOfIntegers();

        System.out.println("2. Stack of String");
        myGenericStack.stackOfStrings();

    }
}
