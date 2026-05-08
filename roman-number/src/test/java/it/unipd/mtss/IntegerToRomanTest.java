////////////////////////////////////////////////////////////////////
// ANDREA MAGGIO 2145610
// ALEX BUOSO 2148614
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test(expected = IllegalArgumentException.class)
    public void testInputNegativo() {
        IntegerToRoman.convert(-1);
    }

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

    @Test
    public void shouldConvert4ToIV() {
        int number = 4;
        String expected = "IV";

        String result = IntegerToRoman.convert(number);

        assertEquals(expected, result);
    }
    
    @Test
    public void shouldConvert6ToVI() {
        int number = 6;
        String expected = "VI";

        String result = IntegerToRoman.convert(number);

        assertEquals(expected, result);
    }

    @Test
    public void shouldConvert8ToVIII() {
        int number = 8;
        String expected = "VIII";

        String result = IntegerToRoman.convert(number);

        assertEquals(expected, result);
    }

    @Test
    public void shouldConvert9ToIX() {
        int number = 9;
        String expected = "IX";

        String result = IntegerToRoman.convert(number);

        assertEquals(expected, result);
    }

    @Test
    public void shouldConvert10ToX() {
        int number = 10;
        String expected = "X";

        String result = IntegerToRoman.convert(number);

        assertEquals(expected, result);
    }
    
    @Test
    public void shouldConvert14ToXIV() {
        int number = 14;
        String expected = "XIV";

        String result = IntegerToRoman.convert(number);

        assertEquals(expected, result);
    }

    @Test
    public void shouldConvert19ToXIX() {
        int number = 19;
        String expected = "XIX";

        String result = IntegerToRoman.convert(number);

        assertEquals(expected, result);
    }

    @Test
    public void shouldConvert20ToXX() {
        int number = 20;
        String expected = "XX";

        String result = IntegerToRoman.convert(number);

        assertEquals(expected, result);
    }

    @Test
    public void shouldConvert40ToXL() {
        int number = 40;
        String expected = "XL";

        String result = IntegerToRoman.convert(number);

        assertEquals(expected, result);
    }

    @Test
    public void shouldConvert44ToXLIV() {
        int number = 44;
        String expected = "XLIV";

        String result = IntegerToRoman.convert(number);

        assertEquals(expected, result);
    }

    @Test
    public void shouldConvert50ToL() {
        int number = 50;
        String expected = "L";

        String result = IntegerToRoman.convert(number);

        assertEquals(expected, result);
    }
}

