package MVC_Transport.model;

public class Oto extends Transport {
    private int seat;
    private String carModel;

    public Oto() {
    }

    public Oto(int seat, String carModel) {
        this.seat = seat;
        this.carModel = carModel;
    }

    public Oto(String licensePlates, String production, int yearOfProduction, String owner, int seat, String carModel) {
        super(licensePlates, production, yearOfProduction, owner);
        this.seat = seat;
        this.carModel = carModel;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    @Override
    public String toString() {
        return "Oto: " + super.toString()+
                " ,seat= " + seat +
                ", carModel= " + carModel + '\''
                ;
    }
}
