package MVCPerson.model;

public abstract class Person {
    private int id;
    private String name;
    private String dateOfBirth;

    public Person() {
    }

    public Person(int id, String name,String dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                " id=" + id +
                ", name= " + name  +
                ", dateOfBirth= " + dateOfBirth;
    }
    public abstract String getInfo();
}
