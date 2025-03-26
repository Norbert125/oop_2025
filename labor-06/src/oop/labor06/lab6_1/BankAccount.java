package oop.labor06.lab6_1;

public class BankAccount {
    public static final String PREFIX = "BT";
    public static final int ACC_N_LEN = 10;
    private static int numAccounts;
    private final String accountNumber;
    private double balance;
    public BankAccount() {
        ++numAccounts;
        accountNumber = creatAccountNumber();
    }
    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
    private static String creatAccountNumber(){
        return PREFIX + String.format("%08d",numAccounts);
    }
    public void deposit(double amount){
        balance += amount;
    }
    public boolean withdraw(double amount){
        if(amount>balance){return false;}
        balance -= amount;
        return true;
    }
    public double getBalance() {
        return balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
}
