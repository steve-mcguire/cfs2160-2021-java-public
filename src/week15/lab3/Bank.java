package week15.lab3;

import java.util.ArrayList;

public class Bank {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();

        BankAccount ba1 = new BankAccount("0789876", 100);
        BankAccount ba2 = new BankAccount("3454", 1000);
        BankAccount ba3 = new BankAccount("567656", 10000);

        accounts.add(ba1);
        accounts.add(ba2);
        accounts.add(ba3);

        double total = 0;
        for (BankAccount ba : accounts){
            total += ba.getBalance();
        }
        System.out.println(total / accounts.size());
    }
}