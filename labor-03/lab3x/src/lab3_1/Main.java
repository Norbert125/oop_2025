package lab3_1;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Molnar", "Norbert");
        System.out.println(customer1);
        customer1.setAccount(new BankAccount("BT1"));
        System.out.println(customer1);
        customer1.getAccount().deposit(1000);
        System.out.println(customer1);
        customer1.closeAccount();
        System.out.println(customer1);

    }
}
