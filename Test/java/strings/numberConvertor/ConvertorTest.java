package strings.numberConvertor;

import main.java.strings.Convertor.Digit;
import main.java.strings.Convertor.PowerSeries;
import main.java.strings.Convertor.SumOfProduct;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class ConvertorTest {
    @Test public void gettingNumberOfDigit() {
        List<Integer> expected =  Arrays.asList(5,8,9);
        assertEquals(expected, Digit.getDigits("985"));
    }
    @Test public void gettingPowerOfSeries() {
        List<Integer> expected =  Arrays.asList(1,8,64);
        assertEquals(expected, PowerSeries.getPowerSeries(3,8));
    }
    @Test
    public void gettingSumProduct() {
        List<Integer> expected = Arrays.asList(2,10,12);
        assertEquals(24, SumOfProduct.sumOfProduct(expected));
    }
}

