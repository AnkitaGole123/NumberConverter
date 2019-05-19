package strings.numberConvertor;

import main.java.strings.Convertor.Digit;
import main.java.strings.Convertor.PowerSeries;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class ConvertorTest {
    @Test public void gettingNumberOfDigit() {
        List<Integer> expect =  Arrays.asList(5,8,9);
        assertEquals(expect, Digit.getDigits("985"));
    }
    @Test public void gettingPowerOfSeries() {
        List<Integer> expect =  Arrays.asList(1,8,64);
        assertEquals(expect, PowerSeries.getPowerSeries(3,8));
    }
}

