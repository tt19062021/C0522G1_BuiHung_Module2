package model;

public abstract class Person {
    private int id;
    private String sex;
    private String name;
    private String dateOfBirth;

    public Person() {
    }

    public Person(int id, String sex, String name, String dateOfBirth) {
        this.id = id;
        this.sex = sex;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return
               " Id: "+ id + "sex= " + sex +
                ", name=" + name +
                ", dateOfBirth=" + dateOfBirth;
    }
}
