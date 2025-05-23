package lab5_1;

import lab2_3.MyDate;

import java.util.ArrayList;

public class Training {
    private Course course;
    private ArrayList<Student> enrolledStudents;
    private MyDate startDate, endDate;
    private double pricePerStudent;
    public Training(Course course, ArrayList<Student> enrolledStudents, MyDate startDate, MyDate endDate, double pricePerStudent) {
        this.course = course;
        this.enrolledStudents = enrolledStudents;
        this.startDate = startDate;
        this.endDate = endDate;
        this.pricePerStudent = pricePerStudent;
    }
    public Course getCourse() {
        return course;
    }

}
