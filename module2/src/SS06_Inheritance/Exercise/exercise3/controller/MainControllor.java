package SS06_Inheritance.Exercise.exercise3.controller;

import SS06_Inheritance.Exercise.exercise3.model.MovablePoint;

import java.util.Arrays;

public class MainControllor {
    public static void main(String[] args) {
//        MovablePoint move1 = new MovablePoint(3,6);
//        System.out.println(move1.toString());

        MovablePoint move2 =new MovablePoint(2,3,4,5);
        System.out.println(move2);

//        float[] arr = move2.getSpeed();
//        System.out.println(Arrays.toString(arr));

        System.out.println(move2.move());
        System.out.println(move2.move());
        System.out.println(move2.move());



    }

}
