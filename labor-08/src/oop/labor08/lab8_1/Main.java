package oop.labor08.lab8_1;

public class Main {
    public static void main(String[] args) {
        Bank myBank = new Bank("OTP");
        Customer customer1 = new Customer("Molnar","Norbert");
        Customer customer2 = new Customer("Bartus","Dani");
        myBank.addCustomer(customer1);
        myBank.addCustomer(customer2);
        CheckingAccount checkingAccount1 = new CheckingAccount(1000);
        CheckingAccount checkingAccount2 = new CheckingAccount(1000);
        SavingsAccount savingsAccount1 = new SavingsAccount(0.25);
        SavingsAccount savingsAccount2 = new SavingsAccount(0.25);
        customer1.addAccount(checkingAccount1);
        customer1.addAccount(savingsAccount1);
        customer2.addAccount(checkingAccount2);
        customer2.addAccount(savingsAccount2);
        customer1.getAccount(customer1.getAccountNumbers().get(0)).deposit(100);
        customer1.getAccount(customer1.getAccountNumbers().get(1)).deposit(200);
        customer2.getAccount(customer2.getAccountNumbers().get(0)).deposit(300);
        customer2.getAccount(customer2.getAccountNumbers().get(1)).deposit(400);

        System.out.println(customer1);
        System.out.println(customer2);
    }
}
