package oop.labor08.lab8_1;
import java.io.PrintStream;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();
    public Bank(String name) {
        this.name = name;
    }
    public Customer getCustomer(int custNum){
        for (Customer customer:customers){
            if(customer.getId() == custNum) {return customer;}
        }
        return null;
    }
    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    public int numCustomers(){
        return customers.size();
    }
    private void printCustomers(PrintStream output){
        output.println("ID, Firstname, Last name, Number of bank accounts");
        for (Customer customer:customers){
            output.println(customer.getId() + " " + customer.getFirstName() + ", " +
                    customer.getLastName() + ", " + customer.getNumAccounts());
        }
    }
    public void printCustomersToStdout() {
        printCustomers( System.out );
    }
    public void printCustomersToFile( String filename ) {
        try (PrintStream out = new PrintStream(filename)) {
            printCustomers(out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
