package SS05_Access_Modifier_StaticPethod_StaticProperty.Exercise2;

public class Student2 {
    private String name = "Hung";
    private String group = "C05";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    Student2(String n, String g) {
        this.name = n;
        this.group = g;
    }
}
