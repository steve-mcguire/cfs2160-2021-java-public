package week14.lab4;

public class BankAccount {
    private String accountHolderName;
    private double balance, overdraftLimit;

    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public BankAccount(String accountHolderName, double balance, double overdraftLimit) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    public void deposit(double depositAmount){
        if(depositAmount > 0){
            this.balance += depositAmount;
        }else{
            System.out.println("Can only deposit a value greater than zero");
        }
    }

    public void withdraw(double withdrawAmount){
        if(withdrawAmount > 0){
            //check to see if there is enough money in the account
            // if the balance is less than zero but the overdraft limit allows us to withdraw
            if((this.balance + this.overdraftLimit) - withdrawAmount >= 0){
                this.balance -= withdrawAmount;
            }else{
                System.out.println("You do not have enough money in your account");
            }
        }else{
            System.out.println("Can only withdraw a value greater than zero");
        }
    }

    @Override
    public String toString() {
        return "Account Holder Name: " + accountHolderName  +
                ", Balance: " + balance;
    }
}
