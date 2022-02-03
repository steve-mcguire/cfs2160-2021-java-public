package week14.lab3;

public class Bank {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("Steve", 100, 50);
        System.out.println(ba1);
        ba1.deposit(-10);
        System.out.println(ba1);
        ba1.withdraw(60);
        System.out.println(ba1);
        ba1.withdraw(60);
        System.out.println(ba1);
        ba1.withdraw(20);
        System.out.println(ba1);
        ba1.withdraw(20);
        System.out.println(ba1);
    }
}
