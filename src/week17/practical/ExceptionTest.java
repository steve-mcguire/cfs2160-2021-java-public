package week17.practical;

public class ExceptionTest {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("Steve", 100);
        System.out.println(ba1);
        try{
            ba1.deposit(10);
            System.out.println(ba1);
            ba1.deposit(-10);
            System.out.println(ba1);
        }catch(Exception e){
            System.out.println(e.getMessage());
            //popup.show(e.getMessage());
        }
    }
}
