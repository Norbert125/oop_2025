package oop.labor12.lab12_3;

public class Main {
    public static void main(String[] args) {
        /*Student student = new Student(1,"Molnar","Norbert");
        student.addMark("magyar",5.2);
        student.addMark("roman",6.2);
        student.addMark("matek",9);
        System.out.println(student);*/
        BAC bac = new BAC();
        System.out.println("successful bacs: " + bac.successfuls());
        bac.printUnsuccsessfuls();
    }
}
