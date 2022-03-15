package week17.practical;

public class DepositAccount extends BankAccount{
    private double interestRate;


    public DepositAccount(String accountHolderName, double balance) {
        super(accountHolderName, balance);
        this.interestRate = 1.5;
    }

    public void payInterest(){
        //ensure the balance is greater than zero
        if(super.getBalance() > 0){
            //calculate the interest to be paid on current balance
            double interestAmount = super.getBalance() / 100 * interestRate;

            //add the amount using the deposit method of BankAccount class
            super.deposit(interestAmount);
        }else{
            System.out.println("Cannot pay interest on a zero or less balance");
        }
    }

    @Override
    public void withdraw(double withdrawAmount) throws Exception{
        if(withdrawAmount > super.getBalance()){
            super.withdraw(withdrawAmount);
        }else{
            System.out.println("You cannot go overdrawn with Deposit Account");
        }

    }

    @Override
    public String toString() {
        return "DepositAccount{" +
                "accountHolderName='" + super.getAccountHolderName() + '\'' +
                ", balance=" + super.getBalance() +
                '}';
    }
}
