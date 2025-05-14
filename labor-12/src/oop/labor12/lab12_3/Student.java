package oop.labor12.lab12_3;

import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;

public class Student {
    private int id;
    private String firstName, lastName;

    private double average;

    private Map<String, Double> marks = new HashMap<>();

    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addMark(String subject, double mark) {marks.put(subject,mark);}

    public double getMark(String subject) throws InvalidKeyException {
        return marks.get(subject);
    }

    public void computeAverage(){
        double avg = 0;
        double hun = marks.get("magyar");
        double ron = marks.get("roman");
        double mtk = marks.get("matek");
        if (hun < 5 || ron < 5 || mtk < 5){
            return;
        }
        avg = (hun+ron+mtk)/3;
        if (avg < 6){
            return;
        }
        this.average = avg;
    }

    public double getAverage() {
        return average;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", average=" + average +
                ", marks=" + marks +
                '}';
    }
}
