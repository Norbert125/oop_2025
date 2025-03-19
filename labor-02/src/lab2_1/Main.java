package lab2_1;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("OTP1");
        BankAccount account2 = new BankAccount("OTP00002");
        System.out.println("Initial state: " + account1);
        account1.deposit(1000);
        System.out.println("Aftter deposit 1000: " + account1);
        if(account1.withdraw(1500)){
            System.out.println("After withdraw 1500: " + account1);
        } else {
            System.out.println("After withdraw 1500: " + "Insufficient funds -- " + account1);
        }
        System.out.println(account1.getAccountNumber() + ": " + account1.getBalance());
        System.out.println(account2);
        account2.deposit(2000);
        System.out.println("After deposit 2000: " + account2);


    }
}
