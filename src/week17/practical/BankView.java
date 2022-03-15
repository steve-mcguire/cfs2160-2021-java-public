package week17.practical;

public class BankView {
    public static void main(String[] args) {
        BankActivity3 bank = new BankActivity3();
        //add test code here
        YoungSaversAccount amaara = new YoungSaversAccount("Amaara", 50);
        bank.addAccount(amaara);
        StudentAccount steve = new StudentAccount("Steve", 200);
        bank.addAccount(steve);
        DepositAccount rabia = new DepositAccount("Rabia", 1000);
        bank.addAccount(rabia);
        bank.printAccounts();
        System.out.println(bank.getAccountsTotal());
        amaara.deposit(40);
        amaara.deposit(40);
        try{
            steve.withdraw(-10.00);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        bank.printAccounts();
        System.out.println(bank.getAccountsTotal());
    }
}
