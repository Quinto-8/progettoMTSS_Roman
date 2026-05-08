////////////////////////////////////////////////////////////////////
// ANDREA MAGGIO 2145610
// ALEX BUOSO 2148614
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanPrinterTest {

    @Test
    public void shouldPrintAsciiArtForNumber1() {
        
        int number = 1;
        String expected = 
              " _____ \n" +
              "|_   _|\n" +
              "  | |  \n" +
              "  | |  \n" +
              " _| |_ \n" +
              "|_____|\n";

        String result = RomanPrinter.print(number);

        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintAsciiArtForNumber3() {
        
        int number = 3;
        String expected = 
              " _____  _____  _____ \n" +
              "|_   _||_   _||_   _|\n" +
              "  | |    | |    | |  \n" +
              "  | |    | |    | |  \n" +
              " _| |_  _| |_  _| |_ \n" +
              "|_____||_____||_____|\n";

        String result = RomanPrinter.print(number);

        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintAsciiArtForNumber6() {
        int number = 6;
        String expected = 
            "__      __ _____ \n" + 
            "\\ \\    / /|_   _|\n" +
            " \\ \\  / /   | |  \n" +
            "  \\ \\/ /    | |  \n" +
            "   \\  /    _| |_ \n" +
            "    \\/    |_____|\n";

        String result = RomanPrinter.print(number);

        assertEquals(expected, result);
    }   
}