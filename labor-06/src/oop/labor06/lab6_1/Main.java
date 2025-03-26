package oop.labor06.lab6_1;

public class Main {
    public static void main(String[] args) {
        /*BankAccount account1 = new BankAccount();
        System.out.println(account1);
        BankAccount account2 = new BankAccount();
        System.out.println(account2);*/
        Bank bank = new Bank("OTP");
        Customer cust1 = new Customer("Molnar", "Norbert");
        Customer cust2 = new Customer("Modi", "Norbert");
        bank.addCustomer(cust1);
        bank.addCustomer(cust2);
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount();
        BankAccount acc3 = new BankAccount();
        BankAccount acc4 = new BankAccount();
        cust1.addAccount(acc1);
        cust1.addAccount(acc2);
        cust2.addAccount(acc3);
        cust2.addAccount(acc4);
        for (int i = 1; i <= bank.numCustomers(); i++) {
            if(bank.getCustomer(i).getId() == 1) {
                System.out.println(bank.getCustomer(i));
            }
        }
        bank.getCustomer(1).getAccount(acc1.getAccountNumber()).deposit(1000);
        bank.getCustomer(1).getAccount(acc2.getAccountNumber()).deposit(2000);
        bank.getCustomer(2).getAccount(acc3.getAccountNumber()).deposit(3000);
        bank.getCustomer(2).getAccount(acc4.getAccountNumber()).deposit(4000);
        for (int i = 1; i <= bank.numCustomers(); i++) {
            if(bank.getCustomer(i).getId() == 2) {
                System.out.println(bank.getCustomer(i));
            }
        }
        bank.printCustomersToFile("bank_customers.csv");
    }
}
