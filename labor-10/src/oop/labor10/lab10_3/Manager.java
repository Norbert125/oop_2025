package oop.labor10.lab10_3;

public class Manager extends Employee{
    private String department;
    public Manager(String firstName, String lastName, double salary, MyDate birthDate, String department) {
        super(firstName, lastName, salary, birthDate);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "birthDate=" + birthDate +
                ", salary=" + salary +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", ID=" + ID +
                ", department='" + department + '\'' +
                '}';
    }
}
