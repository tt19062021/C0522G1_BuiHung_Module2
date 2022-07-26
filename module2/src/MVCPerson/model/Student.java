package MVCPerson.model;

public class Student extends Person{
    private double score;

    public Student() {
    }


    public Student(int id, String name, String dateOfBirth, double score) {
        super(id, name, dateOfBirth);
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

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s\n",getId(),getName(),getDateOfBirth(),getScore());
    }

}
