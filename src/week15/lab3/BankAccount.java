package week15.lab3;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double depositAmount){
        if(depositAmount > 0){
            this.balance += depositAmount;
        }else{
            System.out.println("Deposit value greater than zero");
        }
    }

    public void withdraw(double withdrawAmount){
        if(withdrawAmount > 0){
            this.balance -= withdrawAmount;
        }else{
            System.out.println("Withdraw value greater than zero");
        }
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}