package SS02_Loop_Java.bai_tap;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the square");
            System.out.println("2. Draw the triangle");
            System.out.println("3. Draw isosceles triangle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 2:
                    System.out.println("góc vuông ở dưới bên trái");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                    String topLeft = "";
                    System.out.println("góc vuông ở trên bên trái");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 5; j >= i; j--) {
                            topLeft = topLeft + "*";
                        }
                        topLeft = topLeft + "\n";
                    }
                    System.out.print(topLeft);

                    String topRight = "";
                    System.out.println("góc vuông ở trên bên phải");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if (j > i - 1) {
                                topRight = topRight + "*";
                            }else {
                                topRight = topRight + " ";
                            }
                        }
                        topRight = topRight + "\n";
                    }
                    System.out.print(topRight);

                    String botRight = "";
                    System.out.println("góc vuông ở dưới bên phải");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if (i > 5 - j) {
                                botRight = botRight + "*";
                            }else {
                                botRight = botRight + " ";
                            }
                        }
                        botRight = botRight + "\n";
                    }
                    System.out.print(botRight);
                    break;
                case 1:
                    System.out.println("Draw the square");
                    for (int i = 1; i <= 8; i++) {
                        for (int j = 1; j <= 8; j++) {
                            System.out.print("*"+" ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    for (int i = 7; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
//                            if (i == 1 || j == 1 || i == 4 || j == 6) {
                                System.out.print("*"+" ");
//                            }else{
//                                //result=result +"  ";
//                                System.out.print(" ");
//                                //result=result +"&ensp;";
                            }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}

