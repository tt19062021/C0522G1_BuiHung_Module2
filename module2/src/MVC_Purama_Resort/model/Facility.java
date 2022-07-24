package MVC_Purama_Resort.model;

public abstract class Facility {
    private String serviceName;
    private double area;
    private int cost;
    private int numberOfPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String serviceName, double area, int cost, int numberOfPeople, String rentalType) {
        this.serviceName = serviceName;
        this.area = area;
        this.cost = cost;
        this.numberOfPeople = numberOfPeople;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return
                "serviceName= " + serviceName +
                ", area= " + area +
                ", cost= " + cost +
                ", numberOfPeople= " + numberOfPeople +
                ", rentalType= " + rentalType ;
    }
}
