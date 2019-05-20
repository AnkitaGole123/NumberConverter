package main.java.strings.Convertor;

import java.util.ArrayList;
import java.util.List;
public class DotProduct{
    public static List<Integer> getProducts(List<Integer> numbers1, List<Integer> numbers2) {
        List<Integer> seriesOfProduct = new ArrayList<>();
        int Product=0,i=0;
        while(i<numbers1.size()){
            Product=numbers1.get(i)*numbers2.get(i);
            seriesOfProduct.add(Product);
            i++;
        }
        return seriesOfProduct;
    }
}