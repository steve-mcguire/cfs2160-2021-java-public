package week17.practical;

import java.util.ArrayList;

public class BankActivity3 {
    // you do not need to make changes to the arraylist or add other arraylists
    private ArrayList<BankAccount> accounts;

    public BankActivity3() {
        accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account){
        //add code to allow adding of accounts to the array list here
        this.accounts.add(account);
    }

    public void printAccounts(){
        //add code to print all accounts here
        for(BankAccount ba : accounts){
            System.out.println(ba);
        }
    }

    public double getAccountsTotal(){
        double total = 0;
        //add code to calculate total here

        for(BankAccount ba : accounts){
            total += ba.getBalance();
        }
        return total;
    }


}
