package MVC_Furama_Resort.regex;

import MVC_Furama_Resort.exception.InputIDException;

import java.nio.charset.CharacterCodingException;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class ServiceNameRegex {
    private final String REGEX = "^[A-Z][a-z0-9]+$";
    public String getServiceNameRegex() {
        Scanner sc = new Scanner(System.in);
        String serviceName;
        while (true) {
            try {
                System.out.println("Nhập vào tên dịch vụ (Viết hoa chữ cái đầu): ");
                serviceName = sc.nextLine();
                if (serviceName.matches(REGEX)) {
                    break;
                }else {
                    throw new InputIDException("Sai định dạng!!");
                }
            } catch (PatternSyntaxException | InputIDException e) {
                e.printStackTrace();
            }
        }
        return serviceName;
    }


}
