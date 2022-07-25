package MVC_Furama_Resort.model;

public abstract class Person {
    private int id;
    private String name;
    private String birthDay;
    private String gender;
    private int idCard;
    private int phone;
    private String gmail;

    public Person() {
    }

    public Person(int id, String name, String birthDay, String gender, int idCard, int phone, String gmail) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.idCard = idCard;
        this.phone = phone;
        this.gmail = gmail;
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

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
    public abstract String getInfo();

    @Override
    public String toString() {
        return
                "id= " + id +
                ", name= " + name +
                ", birthDay= " + birthDay +
                ", gender= " + gender +
                ", idCard= " + idCard +
                ", phone= " + phone +
                ", gmail= " + gmail ;
    }
}
