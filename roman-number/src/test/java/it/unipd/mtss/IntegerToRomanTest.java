////////////////////////////////////////////////////////////////////
// ANDREA MAGGIO 2145610
// ALEX BUOSO 2148614
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void shouldConvert1ToI() {
        
        int number = 1;
        String expected = "I";

        String result = IntegerToRoman.convert(number);

        assertEquals(expected, result);
    }

    @Test
    public void shouldConvert2ToII() {

        int number = 2;
        String expected = "II";

        String result = IntegerToRoman.convert(number);

        assertEquals(expected, result);
    }

    @Test
    public void shouldConvert3ToIII() {

        int number = 3;
        String expected = "III";

        String result = IntegerToRoman.convert(number);

        assertEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInputNegativo() {
        IntegerToRoman.convert(-1);
    }
    
}
