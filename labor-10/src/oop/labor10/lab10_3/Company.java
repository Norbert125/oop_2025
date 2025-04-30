package oop.labor10.lab10_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

public class Company {
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void hire(Employee emp){
        employees.add(emp);
    }
    public void hireAll(String filename){
        try (Scanner scanner = new Scanner(new File(filename))){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] words = line.split(",");
                if (words.length == 7){
                    MyDate bDay = new MyDate(Integer.parseInt(words[3].strip()),Integer.parseInt(words[4].strip()),Integer.parseInt(words[5].strip()));
                    employees.add(new Manager(words[0].strip(),words[1].strip(),Double.parseDouble(words[2].strip()),bDay,words[6].strip()));
                }
                else {
                    MyDate bDay = new MyDate(Integer.parseInt(words[3].strip()),Integer.parseInt(words[4].strip()),Integer.parseInt(words[5].strip()));
                    employees.add(new Employee(words[0].strip(),words[1].strip(),Double.parseDouble(words[2].strip()),bDay));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void fire(int num){
        employees.remove(num);
    }
    public void printaALL(PrintStream fout){
        for (Employee employee : employees) {
            fout.println(employee);
        }
    }
    public void printManagers(PrintStream fout){
        for (Employee employee : employees) {
            if (employee instanceof Manager){
                fout.println(employee);
            }
        }
    }
    public void sortByComparator(Comparator<Employee> comp){
        Collections.sort(employees,comp);
    }
}
