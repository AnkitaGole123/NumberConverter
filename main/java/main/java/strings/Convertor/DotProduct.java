package main.java.strings.Convertor;

import java.util.List;
public class DotProduct{
    public static int getDotProducts(List<Integer> numbers1, List<Integer> numbers2) {
        int dotProduct=0,i=0;
        while(i<numbers1.size()){
            dotProduct+=numbers1.get(i)*numbers2.get(i);
            i++;
        }
        return dotProduct;
    }
}