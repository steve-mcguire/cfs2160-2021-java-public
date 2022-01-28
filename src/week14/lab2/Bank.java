package week14.lab2;

public class Bank {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("Steve", 100);
        System.out.println(ba1);
        //ba1.balance += 10;
        ba1.deposit(-10);
        System.out.println(ba1);
        ba1.deposit(50);
        System.out.println(ba1);
        BankAccount ba2 = new BankAccount("Avery", 120);
        System.out.println(ba2);
    }
}
