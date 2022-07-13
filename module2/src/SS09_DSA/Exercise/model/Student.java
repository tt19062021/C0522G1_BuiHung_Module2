package SS09_DSA.Exercise.model;

public class Student extends Person {
    private String gmail;

    public Student(){

    }
    public Student(String gmail) {
        this.gmail = gmail;
    }

    public Student(int id, String name, String gmail) {
        super(id, name);
        this.gmail = gmail;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    @Override
    public String toString() {
        return  super.toString()+
                " gmail= " + gmail;
    }
}
