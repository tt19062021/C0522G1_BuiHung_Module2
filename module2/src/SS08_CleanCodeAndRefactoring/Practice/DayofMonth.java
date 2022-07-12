package SS08_CleanCodeAndRefactoring.Practice;

public class DayofMonth {
    /**
     * Great HungIT
     * @param year
     * @return boolean isLeapYear điều kiện năm nhuận
     */

    private static boolean isLeapYear(int year) {
        boolean isLeapYear4 = year % 4 == 0 ;
        boolean isLeapYear100 = year % 100 == 0 ;
        boolean isLeapYear400 = year % 400 == 0 ;

        return (isLeapYear4 && ! isLeapYear100 || isLeapYear400);
    }

    /**
     * Great HungIT
     * @param  month case 1 trùng với tháng 1;
     * @param year năm nhuận có tháng 2 là 29 ngày, không pải năm nhuận thì có 28 ngày.
     * @return
     */

    public static int getDayofMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                boolean isLeapYear = isLeapYear(year);
                if(isLeapYear){
                    return 29;
                }else{
                    return 28;
                }
            default:
                return 0;
        }
    }
}

