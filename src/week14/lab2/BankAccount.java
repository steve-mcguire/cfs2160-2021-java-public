package week14.lab2;

public class BankAccount {
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double depositAmount){
        if(depositAmount > 0){
            this.balance += depositAmount;
        }else{
            //do an error message
            System.out.println("Deposit must be greater than zero");
        }

    }

    public void withdraw(double withdrawAmount){
        if(withdrawAmount > 0){
            this.balance -= withdrawAmount;
        }else{
            System.out.println("Withdraw must be greater than zero");
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolderName='" + accountHolderName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
