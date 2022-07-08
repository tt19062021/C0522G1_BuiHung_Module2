package SS06_Inheritance.Exercise.exercise2.controller;

import SS06_Inheritance.Exercise.exercise2.model.Point2D;
import SS06_Inheritance.Exercise.exercise2.model.Point3D;

public class TestPoint2D3D {
    public static void main(String[] args) {
        Point2D p2d=new Point2D(2.1f,4.5f);
        System.out.println(p2d.toString());

        Point3D p3d = new Point3D(3f,4f,5f);
        System.out.println(p3d.toString());
    }
}
