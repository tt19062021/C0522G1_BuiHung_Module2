import java.util.Scanner;

public class Group3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("nhập vào số hàng:");
             n = sc.nextInt();
            if(n!=9){
                System.out.println("Phải nhập số 9,nhập lại:");
            }
        }while(n!=9);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1; j++) {
                if (j == 6 - i || j == 5 + i) {
                    System.out.print(i);
                } else if (j == i - 4 || j == 15 - i) {
                    System.out.print(n + 1 - i);
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println("\n");
        }
    }
}
