package week17.practical;

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank();
        //add test code here
        BankAccount ba1 = new BankAccount("STeve", 100);
        BankAccount ba2 = new BankAccount("Nathan", 1000);
        bank.addAccount(ba1);
        bank.addAccount(ba2);

        System.out.println(bank.getAccountsTotal());
        bank.printAccounts();

    }
}
