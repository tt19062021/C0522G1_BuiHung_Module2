package MVC_Furama_Resort.model;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String serviceID, String serviceName, double area, int cost, int numberOfPeople, String rentalType, String freeService) {
        super(serviceID, serviceName, area, cost, numberOfPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", freeService= " + freeService ;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s",
                this.getServiceID(),
                this.getServiceName(),
                this.getArea(),
                this.getCost(),
                this.getNumberOfPeople(),
                this.getRentalType(),
                this.freeService);
    }
}
