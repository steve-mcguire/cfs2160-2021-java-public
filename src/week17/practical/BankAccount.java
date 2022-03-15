package week17.practical;

public class BankAccount {
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }


    public void deposit(double depositAmount){
        //checks value is greater than zero before depositing.
        if(depositAmount > 0){
            this.balance += depositAmount;
        }else{
            //do an error message
            System.out.println("Deposit must be greater than zero");
        }
    }

    public void withdraw(double withdrawAmount) throws Exception{
        //checks value is greater than zero before withdrawing.
        if(withdrawAmount > 0){
            this.balance -= withdrawAmount;
        }else{
            //System.out.println("Withdraw must be greater than zero");
            throw new Exception("Withdraw must be greater than zero");
        }
    }


    //added to allow use of inheritance
    public double getBalance() {
        return balance;
    }
    //added to allow use of inheritance
    public String getAccountHolderName() {
        return accountHolderName;
    }

    @Override
    public String toString() {
        return "BankAccount{ " +
                "accountHolderName='" + accountHolderName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
