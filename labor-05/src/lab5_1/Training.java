package lab5_1;

import lab2_3.Date;

import java.util.ArrayList;

public class Training {
    private Course course;
    private ArrayList<Student> enrolledStudents;
    private Date startDate, endDate;
    private double pricePerStudent;
    public Training(Course course, ArrayList<Student> enrolledStudents, Date startDate, Date endDate, double pricePerStudent) {
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
