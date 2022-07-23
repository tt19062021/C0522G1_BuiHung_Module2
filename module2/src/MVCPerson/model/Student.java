package MVCPerson.model;

public class Student extends Person{
    private double score;

    public Student() {
    }

    public Student(double score) {
        this.score = score;
    }

    public Student(int id, String name, double score) {
        super(id, name);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return super.toString() +
                " ,score= " + score ;
    }
    public String getInfoStudent(){
        return String.format("%s,%s,%s\n",getId(),getName(),getScore());
    }
}
