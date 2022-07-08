package SS04_Lop_DoiTuong.Exercise.exercise1;

public class QuadraticEquation2 {
    private  double b;
    private  double a;
    private  double c;

    QuadraticEquation2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getA() {
       return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDelta() {
        return Math.pow(getB(), 2) - 4 * getA() * getC();
    }

    public String display() {
        return "Phương trình bậc2: " + getA() + "x^2 " + " + " + getB() + "x " + " + " + getC() + " = 0";
    }

    public double getRoot1() {
        return (-getB() + Math.sqrt(getDelta())) / 2 * getA();
    }

    public double getRoot2() {
        return (-getB() - Math.sqrt(getDelta())) / 2 * getA();
    }

    public String viewResult() {
        if (getDelta() > 0) {
            return "phương trình có 2 nghiệm x1= " + getRoot1() + " , x2= " + getRoot2();
        } else if (getDelta() == 0) {
            return "phương trình có nghiệm kép x = " + (-getB() / 2 * getA());
        } else {
            return "phương trình vô nghiệm";
        }
    }
}
