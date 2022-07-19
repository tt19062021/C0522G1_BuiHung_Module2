package SS12_Linear_Binary_Search.Pratice;

public class LinearSearch {
    public static void main(String[] args) {
        int[] list = {3, -2, 5, -40, 100, 50, 9, 60, -4};
        System.out.println(linearSearch(list,-2));
        System.out.println(linearSearch(list,-6));
        System.out.println(linearSearch(list,50));
    }

    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                return 1;
            }
        }
        return -1;
    }
}
