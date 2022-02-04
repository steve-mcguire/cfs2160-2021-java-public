package week15.lab2;

import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public void addAccount(BankAccount ba){
        this.accounts.add(ba);
    }

    public void printAccounts(){
        System.out.println(accounts);
    }

    public double getTotalSavings(){
        double total = 0;
        for(BankAccount ba : accounts){
            total += ba.getBalance();
        }
        return total;
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        BankAccount ba1 = new BankAccount("0789876", 100);
        BankAccount ba2 = new BankAccount("45445", 120);
        BankAccount ba3 = new BankAccount("7654567", 500);
        bank.addAccount(ba1);
        bank.addAccount(ba2);
        bank.addAccount(ba3);

        bank.printAccounts();
        System.out.println(bank.getTotalSavings());


        //System.out.println(ba1.toString());
        /*ba1.deposit(-10);
        System.out.println(ba1.toString());
        ba1.deposit(10);
        System.out.println(ba1.toString());
        ba1.withdraw(50);
        System.out.println(ba1.toString());
        ba1.withdraw(-10);
        System.out.println(ba1.toString());*/
    }

}
