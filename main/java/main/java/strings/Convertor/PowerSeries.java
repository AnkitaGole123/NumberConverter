package main.java.strings.Convertor;

import java.util.ArrayList;
import java.util.List;
public class PowerSeries{
    public static List<Integer> getPowerSeries(int numberOfTerms, int baseNumber) {
        List<Integer> powerSeries = new ArrayList<Integer>();
        for (int i = 0; i < numberOfTerms; i++) {
            int power = (int) (Math.pow(baseNumber, i));
            powerSeries.add(power);
        }
        return powerSeries;
    }
}