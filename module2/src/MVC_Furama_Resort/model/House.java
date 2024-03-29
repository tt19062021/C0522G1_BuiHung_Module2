package MVC_Furama_Resort.model;

public class House extends Facility{
    private String roomStandard;
    private int numberOfFloors;

    public House() {
    }

    public House(String roomStandard, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String serviceID, String serviceName, double area, int cost, int numberOfPeople, String rentalType, String roomStandard, int numberOfFloors) {
        super(serviceID, serviceName, area, cost, numberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return  super.toString() +
                ", roomStandard= " + roomStandard +
                ", numberOfFloors= " + numberOfFloors ;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,&s",
                this.getServiceID(),
                this.getServiceName(),
                this.getArea(),
                this.getCost(),
                this.getNumberOfPeople(),
                this.getRentalType(),
                this.roomStandard,
                this.numberOfFloors);
    }
}
