package lab2_3;

public class Main {
    public static void main(String[] args) {
        MyDate date = new MyDate(2025,2,29);
        System.out.println(DateUtil.isLeapYear(2000));
        System.out.println(date);
        //System.out.println(DateUtil.isLeapYear(date.getYear()));
        System.out.println(DateUtil.isValidDate(date.getYear(), date.getMonth(), date.getDay()));
    }
}
