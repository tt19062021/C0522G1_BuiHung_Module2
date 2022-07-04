package SS03_Mang_PhuongThuc.bai_tap;

import java.util.Scanner;

public class TheCountCharOfString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhập vào chuổi ký tự:"+"\n");
        String manyCharacter= sc.nextLine();

        System.out.print("Nhập vào 1 ký tự:"+"\n");
        String character = sc.nextLine();
        int count =0;

        System.out.println("Chuổi nhập vào là: " + manyCharacter);
        System.out.println("ký tự nhập vào là: "+ character);

        for(int i = 0; i< manyCharacter.length() ; i++){
            if(character.charAt(0) == manyCharacter.charAt(i)){
                count++;
            }
        }
        System.out.println("ký tự: "+ character + " có trong chuổi xuất hiên " +count+" lần");
    }
}
