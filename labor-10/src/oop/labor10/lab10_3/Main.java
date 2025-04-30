package oop.labor10.lab10_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Company myCompany = new Company("MyComp");
        MyDate myBday = new MyDate(2004,11,16);
        Employee me = new Employee("Molnar", "Norbert",9999.9,myBday);
        myCompany.hire(me);
        myCompany.hireAll("emps.txt");
        myCompany.printaALL(System.out);
        myCompany.printManagers(new PrintStream(new File("managers.txt")));
        myCompany.fire(3);
        myCompany.sortByComparator(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return 0;
            }
        });
    }
}
