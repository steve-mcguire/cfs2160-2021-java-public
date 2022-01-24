package week11.bank;

public class BankAccount {
    //without private access, we can directly assign a value to these attributes
    String name;
    private double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double value){
        if(value < 0){
            System.out.println("you cannot deposit a negative value");
        }else{
            this.balance += value;
        }
    }

    public void withdraw(double value){
        if(value <= 0){
            System.out.println("you cannot withdraw a negative value");
        }else{
            if(value <= this.balance){
                this.balance -= value;
            }else{
                System.out.println("You do not have enough money to withdraw that amount");
            }
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
