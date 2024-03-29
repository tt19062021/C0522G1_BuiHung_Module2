package MVC_Furama_Resort.model;

public class Customer extends Person{
    private String customerType;
    private String address;

    public Customer() {
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s\n",
                this.getId()
                ,this.getName()
                ,this.getBirthDay(),
                this.getGender()
                ,this.getIdCard()
                ,this.getPhone(),
                this.getGmail()
                ,this.customerType
                ,this.address);
    }

    public Customer(String customerType, String address) {
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(int id, String name, String birthDay, String gender, int idCard, int phone, String gmail, String customerType, String address) {
        super(id, name, birthDay, gender, idCard, phone, gmail);
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", customerType= " + customerType +
                ", address= " + address  ;
    }
}
