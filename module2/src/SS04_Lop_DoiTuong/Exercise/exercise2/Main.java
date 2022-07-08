package SS04_Lop_DoiTuong.Exercise.exercise2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        System.out.println(stopWatch.start() + "milisecond");

        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.floor(Math.random() * 100000);
        }
        Arrays.sort(arr);//sắp xếp

        System.out.println(Arrays.toString(arr));
        System.out.println(stopWatch.stop() + " milisecond");
        System.out.println(stopWatch.getElapsedTime() + " milisecond");
    }
}
