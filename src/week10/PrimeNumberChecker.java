package week10;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        PrimeNumberChecker pnc = new PrimeNumberChecker();
        for(int i = 0; i < 100; i++){
            if(pnc.calculatePrime(i)){
                System.out.println(i);
            }
            //System.out.println(i + " is " + pnc.calculatePrime(i));
        }
    }

    private boolean calculatePrime(int value){
        if(value <= 1){
            return false;
        }else if (value == 2){
            return true;
        }else if (value % 2 == 0){
            return false;
        }else{
            for(int i = 2; i < value; i++){
               if(value % i == 0){
                   return false;
               }
            }
        }
        return true;
    }
}