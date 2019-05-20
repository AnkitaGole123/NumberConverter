package main.java.strings.Convertor;

import java.util.List;

import static main.java.strings.Convertor.Digit.getDigits;
import static main.java.strings.Convertor.DotProduct.getProducts;
import static main.java.strings.Convertor.PowerSeries.getPowerSeries;

public class NumberConvertor {
    public static void main(String s, String[] args) {
        ParseResult parsing = new ParseResult(args);
        int base = parsing.fromBase;
        String number = parsing.number;
        int numberOfTerms = number.length();

        if (isNotValid(getDigits(number), base)) {
            System.out.println("your input is not an number number");
            return;
        }

        List<Integer> decimal= getProducts(getDigits(number),getPowerSeries(base, numberOfTerms));
        System.out.println("The decimal number of the number you have given is " + SumOfProduct.sumOfProduct(decimal));
        }
    private static boolean isNotValid(List<Integer>digits, int base) {
        for (int i = 0; i< digits.size(); i++){
            if (digits.get(i) > base){
                return true;
            }
        }
        return false;
    }
}