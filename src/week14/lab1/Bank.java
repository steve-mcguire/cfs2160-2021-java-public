package week14.lab1;

public class Bank {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("0789876", 100);
        System.out.println(ba1.toString());
        ba1.deposit(-10);
        System.out.println(ba1.toString());
        ba1.deposit(10);
        System.out.println(ba1.toString());
        ba1.withdraw(50);
        System.out.println(ba1.toString());
        ba1.withdraw(-10);
        System.out.println(ba1.toString());
    }
}
