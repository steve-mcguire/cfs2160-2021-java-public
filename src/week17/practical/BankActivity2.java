package week17.practical;

public class BankActivity2 {
    public static void main(String[] args){
        //do some testing with the new account types
        YoungSaversAccount amaara = new YoungSaversAccount("Amaara", 50);
        StudentAccount steve = new StudentAccount("Steve", 200);
        DepositAccount rabia = new DepositAccount("Rabia", 1000);
        System.out.println(amaara);
        System.out.println(steve);
        System.out.println(rabia);
        amaara.deposit(30);
        amaara.deposit(40);

        try{
            steve.withdraw(400);
            rabia.withdraw(500);
        }catch(Exception e){
            //we would normally show a popup message
            System.out.println(e.getMessage());

            //popup.show(e.getMessage());
        }

        System.out.println(rabia);
        rabia.payInterest();
        System.out.println(amaara);
        System.out.println(steve);
        System.out.println(rabia);
        try{
            steve.withdraw(400);
            rabia.withdraw(700);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(rabia);
        rabia.payInterest();
        System.out.println(amaara);
        System.out.println(steve);
        System.out.println(rabia);
    }
}
