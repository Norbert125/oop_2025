package lab3_2;

/*public class Customer {
    public String firstName, lastName;
    public static final int MAX_ACCOUNTS = 10;
    private int numAccounts;
    private BankAccount accounts[] = new BankAccount[MAX_ACCOUNTS];

    public int getNumAccounts() {return numAccounts;}
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public void setLastName(String lastName){ this.lastName = lastName;}
    public void closeAccount(String accounts){ this.accounts = null;}
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for(int i=0; i<numAccounts; ++i){
            result.append( "\t" + accounts[i] +"\n");
        }
        return result.toString();
    }


}*/

import lab3_1.BankAccount;

public class Customer {
    private String firstName, lastName;
    public static final int MAX_ACCOUNTS = 10;
    private BankAccount[] accounts = new BankAccount[MAX_ACCOUNTS];
    private int numAccounts;
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for(int i=0; i<numAccounts; ++i){
            result.append( "\t" + accounts[i] +"\n");
        }
        return result.toString();
    }

    public void addAccount(BankAccount account){
        if(numAccounts >= MAX_ACCOUNTS) {return;}
        accounts[numAccounts++] = account;
    }

    /*public void closeAccount(){
        this.account = null;
    }*/

    public BankAccount getAccount(String accountNumber) {
        for (int i = 0; i < numAccounts; i++) {
            if(accounts[i].getAccountNumber().equals(accountNumber)){
                return accounts[i];
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
