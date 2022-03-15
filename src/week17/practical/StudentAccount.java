package week17.practical;

public class StudentAccount extends BankAccount{
    private double overdraftLimit;

    public StudentAccount(String accountHolderName, double balance) {
        super(accountHolderName, balance);
        this.overdraftLimit = 500;
    }

    @Override
    public void withdraw(double withdrawAmount) throws Exception{
        //perform the check specific to StudentAccount
        if((super.getBalance() - withdrawAmount) + overdraftLimit >= 0){
            //do overdraft withdraw
            super.withdraw(withdrawAmount);
        }else{
            System.out.println("You cannot go overdrawn more than £500");
        }
    }

    @Override
    public String toString() {
        return "StudentAccount{" +
                "accountHolderName='" + super.getAccountHolderName() + '\'' +
                ", balance=" + super.getBalance() +
                '}';
    }
}
