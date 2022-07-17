package MVC_Transport.model;

public class Moto extends Transport {
    private int cubicCentimeter;

    public Moto() {
    }

    public Moto(int cubicCentimeter) {
        this.cubicCentimeter = cubicCentimeter;
    }

    public Moto(String licensePlates, String production, int yearOfProduction, String owner, int cubicCentimeter) {
        super(licensePlates, production, yearOfProduction, owner);
        this.cubicCentimeter = cubicCentimeter;
    }

    public int getCubicCentimeter() {
        return cubicCentimeter;
    }

    public void setCubicCentimeter(int cubicCentimeter) {
        this.cubicCentimeter = cubicCentimeter;
    }

    @Override
    public String toString() {
        return "Moto: " + super.toString() +
                " , cubicCentimeter=" + cubicCentimeter ;
    }
}
