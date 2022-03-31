package EXAMPLES;

import java.math.BigDecimal;

import static java.math.RoundingMode.*;

public class RoundTest {

    public double round(double aNumber){
        return new BigDecimal(aNumber).setScale(2, HALF_EVEN).doubleValue();
    }

    public static void main(String[] args) {
        double number = 7.9199999;

        RoundTest rt = new RoundTest();
        System.out.println(rt.round(number));

        System.out.println(rt.round(3454));
    }
}
