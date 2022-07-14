package model;

public class Student extends Person {
    private double point;
    private String school;

    public Student() {
    }

    public Student(double point, String school) {
        this.point = point;
        this.school = school;
    }

    public Student(int id, String sex, String name, String dateOfBirth, double point, String school) {
        super(id, sex, name, dateOfBirth);
        this.point = point;
        this.school = school;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Id: " + this.getId() + " ,Name : " + this.getName() +
                " ,Birth: " + this.getDateOfBirth() +
                " ,Sex: " + this.getSex() + " ,Điểm: "+ point + " ,Trường học: "+ school;

    }
}
