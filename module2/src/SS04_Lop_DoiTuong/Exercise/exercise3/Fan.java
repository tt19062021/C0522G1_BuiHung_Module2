package SS04_Lop_DoiTuong.Exercise.exercise3;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan(){
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        if (isOn()) {
            return "{" + "speed="+ getSpeed()+ ", radius=" + getRadius() + ", color= " + getColor() + "" + ", Fan is ON" + '}';
        } else {
            return "{" + " radius=" + getRadius() + ", color= " + getColor() + "" + ", Fan is Off"+ '}';
        }
    }
}
