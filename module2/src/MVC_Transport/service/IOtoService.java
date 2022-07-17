package MVC_Transport.service;

public interface IOtoService {
    void addOto();

    void displayOto();

    void removeOto(String idLicensePlates);

    void searchingLicensePlates(String idLicensePlates);
}
