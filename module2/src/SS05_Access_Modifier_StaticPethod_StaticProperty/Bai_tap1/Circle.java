package SS05_Access_Modifier_StaticPethod_StaticProperty.Bai_tap1;

public class Circle {
    private static double raidus = 1.0;
    private static String color = "red";
    private static double area = 4.2;

    Circle() {

    }

    public Circle(double r) {
        this.raidus = r;

    }

    public void setRaidus(double raidus) {
        this.raidus = raidus;
    }

    public double getRaidus() {
        return raidus;
    }

    public double getArea() {
        return Math.round(Math.pow(getRaidus(), 2) * Math.PI);
    }

}
