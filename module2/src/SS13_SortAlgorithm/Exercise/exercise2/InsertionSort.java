package SS13_SortAlgorithm.Exercise.exercise2;

public class InsertionSort {
    public static void insertionSort(int[] list) {
//        for (int i = 0; i < list.length; i++) {
//            int key = list[i];
//            int j;
//            for (j = i - 1; j >= 0 && list[j] > key; j--) {
//                list[j + 1] = list[j];
//            }
//            list[j + 1] = key;
//        }
        int pos, valueToInsert;
        for(int i = 1; i < list.length; i++){ //đoạn array[0] đã sắp xếp
            valueToInsert = list[i];
            pos = i;
            while(pos > 0 && valueToInsert < list[pos-1]){
                list[pos] = list[pos-1]; // đổi chỗ
                pos--;
            }if(pos !=i){   // chèn phần tử tại vị trí chèn.
                list[pos] = valueToInsert;
            }
        }
    }
}
