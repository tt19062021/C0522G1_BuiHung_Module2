package SS04_Lop_DoiTuong.Bai_tap.bai_tap3;

public class Main {
    public static void main(String[] args) {
        Fan fan =new Fan();
        System.out.println("Mặc định Fan=="+fan);

        Fan fan1 = new Fan();
        fan1.setColor("green");
        fan1.setOn(true);
        fan1.setRadius(8.5);
        fan1.setSpeed(fan1.MEDIUM);
        System.out.println("Fan1 ===="+fan1);

        Fan fan2 = new Fan();
        fan2.setColor("green");
        fan2.setOn(true);
        fan2.setRadius(8.5);
        fan2.setSpeed(20);
        System.out.println("Fan2 ===="+fan2);
    }
}
