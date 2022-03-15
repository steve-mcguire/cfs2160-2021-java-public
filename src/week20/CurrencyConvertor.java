package week20;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyConvertor {
    public static void main(String[] args) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("Enter a value in euros");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        try{
            double euro = Double.valueOf(input);
            double gbp = euro * 0.84;
            System.out.println(formatter.format(gbp));
        }catch(Exception e){
            System.out.println("Cannot do that");
        }
    }
}
