package SS05_Access_Modifier_StaticPethod_StaticProperty.Exercise1;

public class Circle {
    private double radius = 1.0;
    private String color = "green";
    public Circle() {
    }
    public Circle(double adius , String color){
        this.radius = radius;
        this.color = color;
    }
    public  String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius() + ",Circle color = " + getColor();

    }

}
