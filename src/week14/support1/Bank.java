package week14.support1;

public class Bank {
    public static void main(String[] args) {
        BankAccount steve = new BankAccount("Steve", 200);
        BankAccount oliver = new BankAccount("Oliver", 1000);

        System.out.println(steve);
        steve.deposit(10);
        System.out.println(steve);
        System.out.println(oliver);
        oliver.deposit(500);
        System.out.println(oliver);
        System.out.println(oliver);

    }
}
