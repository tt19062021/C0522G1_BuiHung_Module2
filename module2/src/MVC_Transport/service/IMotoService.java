package MVC_Transport.service;

public interface IMotoService {

    void addMoto();

    void displayMoto();

    void removeMoto(String idLicensePlates);

    void searchingLicensePlates(String idLicensePlates);
}
