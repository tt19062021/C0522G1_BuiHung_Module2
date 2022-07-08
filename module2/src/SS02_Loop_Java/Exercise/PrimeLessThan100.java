package SS02_Loop_Java.Exercise;

public class PrimeLessThan100 {
    public static void main(String[] args) {
        int count = 0;
        int countSNT = 0 ;
        System.out.println("In ra dãy số nguyên tố nho hon 100 la:");

        for (int i = 2; i < 100; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                        count += 1;
                    }
            }
                if (count == 2) {
                    System.out.print(i + ",");
                    countSNT += 1;
                }  count = 0;
        }
    }
}
