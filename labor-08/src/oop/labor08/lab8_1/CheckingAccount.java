package oop.labor08.lab8_1;

public class CheckingAccount extends BankAccount{
    private double overdraftLimit;

    public CheckingAccount(double overdrafLimit) {
        this.overdraftLimit = overdrafLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public boolean withdraw(double value){
        super.withdraw(value);
        return true;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "overdrafLimit=" + overdraftLimit +
                '}';
    }
}
