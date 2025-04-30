package oop.labor10.lab10_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<MyDate> dates = new ArrayList<>();
        Random random = new Random();
        while (dates.size() != 10){
            int year = 2025;
            int month = random.nextInt(12)+1;
            int day = random.nextInt(31)+1;
            if (DateUtil.isValidDate(year,month,day)){
                dates.add(new MyDate(year,month,day));
            }
        }
        System.out.println("rendezetlen sorrend:");
        for (MyDate date : dates) {
            System.out.println(date);
        }
        System.out.println("rendezet sorrend:");
        Collections.sort(dates);
        for (MyDate date : dates) {
            System.out.println(date);
        }
        System.out.println("forditott sorrend:");
        Collections.sort(dates,(d1,d2) -> {
            return d2.compareTo(d1);
        });
        for (MyDate date : dates) {
            System.out.println(date);
        }
    }
}
