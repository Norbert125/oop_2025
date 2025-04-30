package oop.labor10.lab10_1;

public class Main {
    public static void main(String[] args) {
        SortingDemo demo = new SortingDemo("fruits.txt");
        System.out.println("rendes sorrend:");
        demo.printFruits();
        System.out.println("alfabetikus sorrend:");
        demo.sortAlphabetically();
        demo.printFruits();
        System.out.println("forditott sorrend:");
        demo.sortReverseAlphabetically();
        demo.printFruits();
    }
}
