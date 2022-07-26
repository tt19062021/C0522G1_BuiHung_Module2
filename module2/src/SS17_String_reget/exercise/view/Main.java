package SS17_String_reget.exercise.view;

import SS17_String_reget.exercise.service.ExtraClassService;
import SS17_String_reget.exercise.service.IExtraClassService;

public class Main {
    public static void main(String[] args) {
        IExtraClassService iExtraClassService = new ExtraClassService();
        iExtraClassService.add();
    }
}
