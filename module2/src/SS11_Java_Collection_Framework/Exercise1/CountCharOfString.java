package SS11_Java_Collection_Framework.Exercise1;

import java.util.*;

public class CountCharOfString {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi:");

        String arr = scanner.nextLine();

        String[] newArr = arr.toLowerCase().split(" ");

        System.out.println(Arrays.toString(newArr));

        for (String key : newArr) {
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
//        System.out.println(map);

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
