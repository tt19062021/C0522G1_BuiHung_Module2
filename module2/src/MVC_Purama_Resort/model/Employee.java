package MVC_Purama_Resort.model;

public class Employee extends Person {
    private String degree;
    private String position;
    private int salary;

    public Employee() {
    }

    public Employee(String degree, String position, int salary) {
        this.degree = degree;
        position = position;
        this.salary = salary;
    }

    public Employee(int id, String name, String birthDay, String gender, int idCard, int phone, String gmail, String degree, String position, int salary) {
        super(id, name, birthDay, gender, idCard, phone, gmail);
        this.degree = degree;
        position = position;
        this.salary = salary;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  super.toString() +
                ", degree= " + degree +
                ", position= " + position +
                ", salary= " + salary;
    }
}
