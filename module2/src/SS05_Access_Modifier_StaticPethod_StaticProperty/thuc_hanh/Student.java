package SS05_Access_Modifier_StaticPethod_StaticProperty.thuc_hanh;

public class Student {
    private final String name;
    private final int rollno;
    private static String college = "LGBT";

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    static void change() {
        college = "Dai Hoc Mo";
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }


    public static void main(String[] args) {
        Student.change(); //calling change method

        //creating objects
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}

