package week11.bank;

public class Bank {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Steve", 120);
        System.out.println(b1);
        //directly assign value to attribute, we would never want to set the balance to be a negative number
        //it is likely that we would want to add or subtract a value to / from the existing value
        b1.deposit(10);
        System.out.println(b1);
        b1.withdraw(70);
        System.out.println(b1);
        b1.withdraw(100);
        System.out.println(b1);
    }
}