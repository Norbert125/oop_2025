package oop.labor12.lab12_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class BAC {
    private String[] subjects = {"magyar","matek","roman"};
    private Map<Integer,Student> students = new HashMap<>();

    public BAC() {
        readNames();
        readMarks();

    }

    private void readMarks(){
        for (String subject:subjects){
            try (Scanner scanner = new Scanner(new File(subject + ".txt"))){
                while (scanner.hasNextLine()){
                    String line = scanner.nextLine();
                    String[] words = line.split(" ");
                    int id = Integer.parseInt(words[0].trim());
                    double mark = Double.parseDouble(words[1].trim());
                    students.get(id).addMark(subject,mark);
                    //students.get(id).computeAverage();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        for (Integer i: students.keySet()){
            students.get(i).computeAverage();
        }

    }

    public int successfuls(){
        int counter = 0;
        for (Integer i:students.keySet()) {
            if (students.get(i).getAverage() >= 6) {
                ++counter;
            }
        }
        return counter;
    }

    private void readNames(){
        try (Scanner scanner = new Scanner(new File("nevek1.txt"))){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] words = line.split(" ");
                int id = Integer.parseInt(words[0].trim());
                Student stud = new Student(id,words[1].trim(),words[2].trim());
                students.put(id,stud);
            }
            System.out.println("Number of studenst: " + students.size());
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public void printUnsuccsessfuls(){
        List<Student> studentList = new ArrayList<>();
        for (Integer i:students.keySet()){
            if (students.get(i).getAverage() < 6){
                studentList.add(students.get(i));
            }
        }
        Collections.sort(studentList,(p1,p2) -> {
            return p1.getFirstName().compareToIgnoreCase(p2.getFirstName());
        });

        System.out.println(studentList);
    }
}
