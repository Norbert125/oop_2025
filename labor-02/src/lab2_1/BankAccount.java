package lab2_1;

public class BankAccount {
    private String accountNumber;
    private double balance;
    public BankAccount(String paccountNumber) {
        accountNumber = paccountNumber;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public boolean withdraw(double amount) {
        if(balance < amount) {return false;}
        balance -= amount;
        return true;
    }
    public String toString() {
        return "BankAccount{" + accountNumber + ", " + balance +"}";
    }
}