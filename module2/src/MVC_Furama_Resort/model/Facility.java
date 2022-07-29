package MVC_Furama_Resort.model;

public abstract class Facility {
    private String serviceID;
    private String serviceName;
    private double area;
    private int cost;
    private int numberOfPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String serviceID, String serviceName, double area, int cost, int numberOfPeople, String rentalType) {
        this.serviceID = serviceID;
        this.serviceName = serviceName;
        this.area = area;
        this.cost = cost;
        this.numberOfPeople = numberOfPeople;
        this.rentalType = rentalType;
    }

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
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
        return  "serviceID= " + serviceID +
                ", serviceName= " + serviceName +
                ", area= " + area +
                ", cost= " + cost +
                ", numberOfPeople= " + numberOfPeople +
                ", rentalType= " + rentalType ;
    }
    public abstract String getInfo();
}
