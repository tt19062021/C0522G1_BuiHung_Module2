package MVC_Transport.model;

public abstract class Transport {
    private String licensePlates;
    private String production;
    private int yearOfProduction;
    private String owner;

    public Transport() {
    }

    public Transport(String licensePlates, String production, int yearOfProduction, String owner) {
        this.licensePlates = licensePlates;
        this.production = production;
        this.yearOfProduction = yearOfProduction;
        this.owner = owner;
    }

    public String getLicensePlates() {
        return licensePlates;
    }

    public void setLicensePlates(String licensePlates) {
        this.licensePlates = licensePlates;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return
                "licensePlates= " + licensePlates + '\'' +
                        ", production= " + production + '\'' +
                        ", yearOfProduction= " + yearOfProduction +
                        ", owner= " + owner + '\''
                ;
    }
}
