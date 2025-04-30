package oop.labor10.lab10_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Company myCompany = new Company("MyComp");
        MyDate myBday = new MyDate(2004,11,16);
        Employee me = new Employee("Molnar", "Norbert",9999.9,myBday);
        myCompany.hire(me);
        myCompany.hireAll("emps.txt");
        myCompany.printaALL(System.out);
        myCompany.printManagers(new PrintStream(new File("managers.txt")));
        myCompany.fire(0);
        myCompany.sortByComparator((e1,e2) -> {
           boolean ise1M = e1 instanceof Manager;
           boolean ise2M = e2 instanceof Manager;
           if (ise1M && !ise2M) return -1;
           if (!ise1M && ise2M) return 1;
           return e1.getFirstName().compareToIgnoreCase(e2.getFirstName());
        });
        System.out.println("Sorted employees:");
        myCompany.printaALL(System.out);
    }
}
