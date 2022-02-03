package week14.lab4;

public class Bank {
    public static void main(String[] args) {
        //create bank account
        BankAccount ba1 = new BankAccount("Steve", 100, 50);
        System.out.println(ba1);
        //deposit 10
        ba1.deposit(10);
        System.out.println(ba1);
        //deposit -10, should get error
        ba1.deposit(-10);
        System.out.println(ba1);
        //withdraw 50
        ba1.withdraw(50);
        System.out.println(ba1);
        ba1.withdraw(70);
        System.out.println(ba1);
    }
}
