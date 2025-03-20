package lab5_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Course> courses = readCourses("Lab5_1courses.csv");
        for (Course c: courses){
            System.out.println(c);
        }
        ArrayList<Student> students = readStudents("Lab5_1students.csv");
        for (Student s:students){
            System.out.println(s);
        }
    }
    private static ArrayList<Course> readCourses(String fileName){
        ArrayList<Course> courses = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] array = line.split(",");
                int numHours = Integer.parseInt(array[2].trim());
                Course course = new Course( array[0].trim(), array[1].trim(), numHours);
                courses.add(course);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return courses;
    }


    private static ArrayList<Student> readStudents(String fileName){
        ArrayList<Student> students = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                if (line.isEmpty()){continue;}
                String[] word = line.split(",");
                students.add(new Student( word[0].trim(), word[1].trim(), word[2].trim()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }
}
