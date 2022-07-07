package SS05_Access_Modifier_StaticPethod_StaticProperty.Bai_tap1;

public class Main1 {
    public static void main(String[] args) {
        Circle circle1 = new Circle();

        circle1.setRaidus(3);

        System.out.println(circle1.getRaidus());
        System.out.println(circle1.getArea());
    }
}
