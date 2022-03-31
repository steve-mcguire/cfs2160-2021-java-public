package EXAMPLES.ExceptionDemo;

public class BankAccount {
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    //without exception, does not preserve encapsulation !BAD!
    public void deposit(double depositAmount){
        if(depositAmount > 0){
            this.balance += depositAmount;
        }else{
            //do an error message
            System.out.println("Deposit must be greater than zero");
        }
    }

    //with exception, preserves encapsulation !GOOD!
    public void withdraw(double withdrawAmount) throws InputErrorException{
        if(withdrawAmount > 0){
            this.balance -= withdrawAmount;
        }else{
           throw new InputErrorException("Amount needs to be greater than zero");
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
