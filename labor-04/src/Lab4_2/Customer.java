package Lab4_2;

import java.util.ArrayList;

public class Customer {
    private String firstName, lastName;
    private ArrayList<BankAccount> accounts = new ArrayList<>();
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accounts=" + accounts +
                '}';
    }

    public void addAccount(BankAccount account){
        //if(accounts.size() >= ) {return;}
        accounts.add(account);
    }
    public BankAccount getAccount(String accountNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if(accounts.get(i).equals(accountNumber)){
                return accounts.get(i);
            }
        }
        return null;
    }
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

}
