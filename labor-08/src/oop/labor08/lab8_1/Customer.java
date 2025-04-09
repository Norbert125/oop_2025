package oop.labor08.lab8_1;
import java.util.ArrayList;

public class Customer {
    private static int numCustomer;
    private final int id;
    private String firstName, lastName;
    private ArrayList<BankAccount> accounts = new ArrayList<>();
    public Customer(String firstName, String lastName) {
        id = ++numCustomer;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public int getId() {
        return id;
    }
    public int getNumAccounts(){
        return accounts.size();
    }
    public ArrayList<String> getAccountNumbers(){
        ArrayList<String> accountNumbers = new ArrayList<>();
        for (BankAccount account:accounts){accountNumbers.add(account.getAccountNumber());}
        return accountNumbers;
    }
    public void addAccount(BankAccount accNum){
        accounts.add(accNum);
    }
    public BankAccount getAccount(String AccNum){
        for (BankAccount account:accounts){
            if (account.getAccountNumber().equals(AccNum)){return account;}
        }
        return null;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void closeAccount(String accNum){
        for (BankAccount account: accounts){
            if (account.getAccountNumber().equals(accNum)) {accounts.remove(account);}
        }
    }
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}