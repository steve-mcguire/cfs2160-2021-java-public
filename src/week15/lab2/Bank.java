package week15.lab1;

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


}
