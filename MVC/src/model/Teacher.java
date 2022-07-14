package model;

public class Teacher extends Person{
    private String specialize;

    public Teacher() {
    }

    public Teacher(String specialize) {
        this.specialize = specialize;
    }

    public Teacher(int id, String sex, String name, String dateOfBirth, String specialize) {
        super(id, sex, name, dateOfBirth);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return " Name : " + this.getName() +
                " ,Birth: " + this.getDateOfBirth() +
                " ,Sex: " + this.getSex() + " ,Chuyên môn: " + specialize;
    }
}
