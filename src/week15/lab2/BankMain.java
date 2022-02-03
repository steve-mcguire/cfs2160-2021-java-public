package week15.lab1;

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank();
        BankAccount ba1 = new BankAccount("0789876", 100);
        BankAccount ba2 = new BankAccount("45445", 120);
        BankAccount ba3 = new BankAccount("7654567", 500);
        bank.addAccount(ba1);
        bank.addAccount(ba2);
        bank.addAccount(ba3);

        bank.printAccounts();
        System.out.println(bank.getTotalSavings());

        //System.out.println(ba1.toString());
        /*ba1.deposit(-10);
        System.out.println(ba1.toString());
        ba1.deposit(10);
        System.out.println(ba1.toString());
        ba1.withdraw(50);
        System.out.println(ba1.toString());
        ba1.withdraw(-10);
        System.out.println(ba1.toString());*/
    }
}
