package week17.practical;

public class YoungSaversAccount extends BankAccount{
    private double maximumBalance;

    public YoungSaversAccount(String accountHolderName, double balance) {
        super(accountHolderName, balance);
        this.maximumBalance = 100;
    }

    @Override
    public void deposit(double depositAmount) {
       if(super.getBalance() + depositAmount <= 100){
           super.deposit(depositAmount);
       }else{
           System.out.println("The balance cannot be greater than £100");
       }
    }

    @Override
    public String toString() {
        return "YoungSaversAccount{" +
                "accountHolderName='" + super.getAccountHolderName() + '\'' +
                ", balance=" + super.getBalance() +
                '}';
    }
}
