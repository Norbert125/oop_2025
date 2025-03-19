package lab3_2;

import lab3_1.BankAccount;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Molnar", "Norbert");
        customer1.addAccount(new BankAccount("BT1"));
        customer1.addAccount(new BankAccount("BT2"));
        System.out.println(customer1);
        customer1.getAccount("BT1").deposit(1000);
        System.out.println(customer1);
    }
}
