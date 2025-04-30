package oop.labor10.lab10_2;

public class DateUtil {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {return true;}
        return false;
    }

    public static boolean isValidDate(int year, int month, int day) {
        if(year > 0 && month > 0 && month < 12) {
            if(month == 2) {
                if(day < 0) {return false;}
                if(!DateUtil.isLeapYear(year) && day > 29) {
                    return false;
                }
            }
            if(month % 2 == 0){
                if(day > 30 || day < 0) {return false;}
            }
            if(month % 2 == 1){
                if(day > 31 || day < 0) {return false;}
            }
            return true;
        }
        return false;
    }
}
