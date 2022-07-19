package SS12_Linear_Binary_Search.Pratice;

public class BinarySearch {
    public static void main(String[] args) {
        int[] list = {1,2,6,9,50,100,200,400,500};

        System.out.println(binarySearch(list,9));
        System.out.println(binarySearch(list,1));
        System.out.println(binarySearch(list,6000));

    }

    static int binarySearch(int[] list, int key) {
       int left = 0;
       int right = list.length - 1;
        while (right >= left){
            int mid = (left + right)/2;
            if(key<list[mid]){
                right = mid -1;
            }else if(key == list[mid]){
                return mid;
            }else {
                left = mid +1;
            }
        }
        return -1;
    }
}
