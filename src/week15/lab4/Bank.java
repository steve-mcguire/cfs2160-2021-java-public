package week15.lab4;

import java.util.ArrayList;

public class Bank {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("Steve", 100);
        BankAccount ba2 = new BankAccount("Ayub", 1000);
        BankAccount ba3 = new BankAccount("Rabia", 10000);

        ArrayList<BankAccount> accounts = new ArrayList<>();

        accounts.add(ba1);
        accounts.add(ba2);
        accounts.add(ba3);

        double total = 0;
        for(BankAccount ba : accounts){
            total += ba.getBalance();
            System.out.println(ba.getAccountHolderName() + " another word " + ba.getBalance());
        }
        System.out.println(total / accounts.size());
    }
}
