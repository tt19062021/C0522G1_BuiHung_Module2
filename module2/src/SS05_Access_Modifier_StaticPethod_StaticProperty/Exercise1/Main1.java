package SS05_Access_Modifier_StaticPethod_StaticProperty.Exercise1;

public class Main1 {
    public static void main(String[] args) {
        Circle circle1 = new Circle();

        circle1.setRadius(3);

        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
    }
}
