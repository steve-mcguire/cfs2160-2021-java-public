package EXAMPLES.PrintingCurrency;

import java.text.NumberFormat;
import java.util.Locale;

public class PrintCurrencyTest {
    public static void main(String[] args) {
        //create a formatter and set Its location to UK
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.UK);

        //money double, format and print
        double someMoney = 12.34567879;
        System.out.println(formatter.format(someMoney));
    }
}
