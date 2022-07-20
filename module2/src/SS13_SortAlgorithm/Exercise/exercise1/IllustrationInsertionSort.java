package SS13_SortAlgorithm.Exercise.exercise1;

public class IllustrationInsertionSort {
    public void insertionSort(int[] arr) {
        int valueToInsert;
        int pos;
        int i;

        // lap qua tat ca cac so
        for (i = 1; i < arr.length; i++) {

            // chon mot gia tri de chen
            valueToInsert = arr[i];

            // lua chon vi tri de chen
            pos = i;

            // kiem tra xem so lien truoc co lon hon gia tri duoc chen khong
            while (pos > 0 && arr[pos - 1] > valueToInsert) {
                arr[pos] = arr[pos - 1];
                pos--;
                System.out.println("Di chuyển phần tử: " + arr[pos]);
            }

            if (pos != i) {
                System.out.println(" Chèn phần tử: " + valueToInsert
                        + ", tại vị t rí: " + pos);
                // chen phan tu tai vi tri chen
                arr[pos] = valueToInsert;
            }

            System.out.println("Vòng lặp thứ: " + i);
            display(arr);
        }
    }

    public void display(int[] arr) {
        int i;
        System.out.print("[");

        // Duyet qua tat ca phan tu
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("]\n");
    }

    public static void main(String[] args) {
        // khoi tao mang arr
        int[] arr = { 6, 7, 0, 2, 8, 1, 3, 9, 4, 5 };

        IllustrationInsertionSort illustrationInsertionSort = new IllustrationInsertionSort();
        System.out.println("Mảng dữ liệu đầu vào: ");
        illustrationInsertionSort.display(arr);
        System.out.println("-----------------------------");
        illustrationInsertionSort.insertionSort(arr);
        System.out.println("-----------------------------");
        System.out.println("Mảng sau khi sắp xếp: \n");
        illustrationInsertionSort.display(arr);
    }
}

