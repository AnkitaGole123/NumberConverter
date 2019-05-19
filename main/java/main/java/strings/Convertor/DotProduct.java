package main.java.strings.Convertor;

import java.util.List;
public class DotProduct{
    public static int getProducts(List<Integer> numbers1, List<Integer> numbers2) {
        int Product=0,i=0;
        while(i<numbers1.size()){
            Product+=numbers1.get(i)*numbers2.get(i);
            i++;
        }
        return Product;
    }
}