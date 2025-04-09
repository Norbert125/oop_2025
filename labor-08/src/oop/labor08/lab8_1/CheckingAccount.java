package oop.labor08.lab8_1;

public class CheckingAccount extends BankAccount{
    private double overdraftLimit;

    public CheckingAccount(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public boolean withdraw(double value){
        if(value > overdraftLimit){return false;}
        super.withdraw(value);
        return true;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "overdrafLimit=" + overdraftLimit +
                " balance= " + super.getBalance() + '}';
    }
}
