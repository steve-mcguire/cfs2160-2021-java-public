package week21;

import java.util.Scanner;

public class NameMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.nextLine();


        HelloName hn = new HelloName();
        try{
            String result = hn.sayHello(name);
            System.out.println(result);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
