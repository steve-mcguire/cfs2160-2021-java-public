package week14.support1;

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
        }
    }

    public void withdraw(double withdrawAmount){
        if(withdrawAmount > 0){
            if(withdrawAmount <= this.balance){
                this.balance -= withdrawAmount;
            }else{
                System.out.println("You do not have sufficient funds");
            }
        }else{
            System.out.println("Please withdraw a value greater than zero");
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
