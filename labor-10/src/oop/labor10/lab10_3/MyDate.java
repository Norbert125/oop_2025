package oop.labor10.lab10_3;

public class MyDate implements Comparable<MyDate> {
    private int year, month, day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String toString() {
        return "Date{" + year + ", " + month + ", " + day + "}";
    }

    @Override
    public int compareTo(MyDate o) {
        if (this.year != o.year){
            return this.year - o.year;
        }
        if (this.month != o.month){
            return this.month - o.month;
        }
        return this.day - o.day;
    }
}
