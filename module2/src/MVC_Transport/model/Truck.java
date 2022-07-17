package MVC_Transport.model;

public class Truck extends Transport {
    private double tonnage;

    public Truck() {
    }

    public Truck(double tonnage) {
        this.tonnage = tonnage;
    }

    public Truck(String licensePlates, String production, int yearOfProduction, String owner, double tonnage) {
        super(licensePlates, production, yearOfProduction, owner);
        this.tonnage = tonnage;
    }

    public double getTonnage() {
        return tonnage;
    }

    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Truck: " + super.toString()+
                " , tonnage=" + tonnage ;
    }
}
