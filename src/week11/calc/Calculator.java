package week11.calc;

import java.util.Scanner;

public class Calculator {
    public int addition(int x, int y){
        int result = x + y;
        return result;
    }

    public int multiplication(int x, int y){
        return x * y;
    }

    public int subtraction(int x, int y){
        return x - y;
    }

    public int modulo(int x, int y){
        //code here
        return x % y;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x value.");
        int x = scanner.nextInt();
        System.out.println("Enter y value.");
        int y = scanner.nextInt();
        System.out.println("Enter your name");
        String name = scanner.next();

        System.out.println("Thank you " + name + " your results are:");
        System.out.println(calc.addition(x, y));
        System.out.println(calc.multiplication(x, y));
        System.out.println(calc.subtraction(x, y));
        System.out.println(calc.modulo(x, y));
    }
}