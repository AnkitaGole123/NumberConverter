package main.java.strings.Convertor;

import java.util.Collections;
import java.util.List;
public class NumberConvertor {
    public static void main(String s, String[] args) {
        main.java.strings.Convertor.ParseResult parsing = new main.java.strings.Convertor.ParseResult(args);
        String number = parsing.number;
        int numberOfTerms = number.length();

        if (isNotValid(main.java.strings.Convertor.Digit.getDigits(number), parsing.fromBase)) {
            System.out.println("your input is not an number number");
            return;
        }

        List<Integer> decimal= Collections.singletonList(DotProduct.getProducts(Digit.getDigits(number), PowerSeries.getPowerSeries(numberOfTerms, parsing.fromBase)));
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