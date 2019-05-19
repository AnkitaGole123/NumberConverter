package main.java.strings.Convertor;

import java.util.List;

public class SumOfProduct {
    public static int sumOfProduct(List<Integer> products) {
        int sum = 0;
        for (int i = 0; i <products.size(); i++){
            sum= sum+products.get(i);
        }
    return sum;
    }
}
