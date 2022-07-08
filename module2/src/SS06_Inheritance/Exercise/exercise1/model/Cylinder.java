package SS06_Inheritance.Exercise.exercise1.model;

import SS05_Access_Modifier_StaticPethod_StaticProperty.Exercise1.Circle;

public class Cylinder extends Circle {
        private double height = 2.0;

    public Cylinder(){
    }
    public Cylinder(double height) {
        this.height = height;
    }
    public Cylinder(double radius, String color) {
        super(radius, color);
    }
    public Cylinder(double height, double radius ,String color) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getSurroundingArea(){
        return (2 * super.getArea()* height)/super.getRadius();
    }
    public double getTotalArea(){
        return (2 * super.getArea())+ getSurroundingArea();
    }
    public double getPerimeterCylinder(){
        return height* super.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder = "+ super.getRadius() + ", color = " + super.getColor() + " ,height = " + getHeight();
    }
}
