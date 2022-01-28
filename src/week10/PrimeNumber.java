package week10;

public class PrimeNumber {
    public static void main(String[] args) {
       for(int num = 2; num <= 100; num++){
           if(num == 2){
               System.out.println(num + " is Prime");
           }else{
               boolean prime = false;
               for(int i = 0; i < num; i++){
                   if(num % i == 0){
                       prime = false;
                   }else{
                       prime = true;
                   }
               }
               if(prime){
                   System.out.println(num + " is prime");
               }else{
                   System.out.println(num + " is not prime");
               }

           }
       }

    }
}
