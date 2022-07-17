package MVC_Transport.service;

public interface ITruckService {
    void addTruck();

    void displayTruck();

    void removeTruck(String idLicensePlates);

    void searchingLicensePlates(String idLicensePlates);
}
