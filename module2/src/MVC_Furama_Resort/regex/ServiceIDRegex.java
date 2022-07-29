package MVC_Furama_Resort.regex;

import MVC_Furama_Resort.exception.InputIDException;

import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class ServiceIDRegex {
    private final String REGEX = "^(SVVL|svvl)[-][0-9]{4}$";
    public String getServiceIdRegex() {
        Scanner sc = new Scanner(System.in);
        String serviceID;
        while (true) {
            try {
                System.out.println("Nhập vào mã dịch vụ SV+(Villa-VL)(House-HO)(Room-RO)+4SỐ: ");
                serviceID = sc.nextLine();
                if (serviceID.matches(REGEX)) {

                    break;
                }else {
                    throw new InputIDException("Sai định dạng!!");
                }
            } catch (PatternSyntaxException | InputIDException e) {
                e.printStackTrace();
            }
        }
        return serviceID.toUpperCase();
    }
}
