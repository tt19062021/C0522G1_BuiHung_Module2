package MVC_Furama_Resort.model;

public class Villa extends Facility{
    private String roomStandard;
    private double poolArea;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String roomStandard, double poolArea, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String serviceID, String serviceName, double area, int cost, int numberOfPeople, String rentalType, String roomStandard, double poolArea, int numberOfFloors) {
        super(serviceID, serviceName, area, cost, numberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", roomStandard= " + roomStandard +
                ", poolArea= " + poolArea +
                ", numberOfFloors= " + numberOfFloors ;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s",
                this.getServiceID(),
                this.getServiceName(),
                this.getArea(),
                this.getCost(),
                this.getNumberOfPeople(),
                this.getRentalType(),
                this.roomStandard,
                this.poolArea,
                this.numberOfFloors);
    }
}
