package SS06_Inheritance.Exercise.exercise3.model;

import SS06_Inheritance.Exercise.exercise2.model.Point2D;

public class MovablePoint extends Point2D {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] arr = {getXSpeed(),getYSpeed()};
        return arr;
    }


    public MovablePoint move() {
        super.setX(xSpeed + super.getX());
        super.setY(ySpeed + super.getY());
        return this;
    }

    @Override
    public String toString() {
        return "MovablePoint{" + xSpeed +" , " +ySpeed+ "}" + super.toString() ;

    }
}
