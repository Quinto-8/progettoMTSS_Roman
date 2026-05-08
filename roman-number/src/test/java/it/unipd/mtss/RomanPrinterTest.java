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

    @Test
    public void shouldReturnAsciiArtForNumber8() {
        int number = 8;
        String expected = 
            "__      __ _____  _____  _____ \n" +
            "\\ \\    / /|_   _||_   _||_   _|\n" +
            " \\ \\  / /   | |    | |    | |  \n" +
            "  \\ \\/ /    | |    | |    | |  \n" +
            "   \\  /    _| |_  _| |_  _| |_ \n" +
            "    \\/    |_____||_____||_____|\n";

        String result = RomanPrinter.print(number);

        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnAsciiArtForNumber9() {
        int number = 9;
        String expected = 
            " _____ __   __\n" +
            "|_   _|\\ \\ / /\n" +
            "  | |   \\ V / \n" +
            "  | |    > <  \n" +
            " _| |_  / ^ \\ \n" +
            "|_____|/_/ \\_\\\n";

        String result = RomanPrinter.print(number);

        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnAsciiArtForNumber10() {
        int number = 10;
        String expected = 
            "__   __\n" +
            "\\ \\ / /\n" +
            " \\ V / \n" +
            "  > <  \n" +
            " / ^ \\ \n" +
            "/_/ \\_\\\n";
   
        String result = RomanPrinter.print(number);

        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintAsciiArtForNumber14() {
        int number = 14;
        String expected = 
            "__   __ _____ __      __\n" +
            "\\ \\ / /|_   _|\\ \\    / /\n" +
            " \\ V /   | |   \\ \\  / / \n" +
            "  > <    | |    \\ \\/ /  \n" +
            " / ^ \\  _| |_    \\  /   \n" +
            "/_/ \\_\\|_____|    \\/    \n";

        String result = RomanPrinter.print(number);

        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintAsciiArtForNumber19() {
        int number = 19;
        String expected = 
            "__   __ _____ __   __\n" +
            "\\ \\ / /|_   _|\\ \\ / /\n" +
            " \\ V /   | |   \\ V / \n" +
            "  > <    | |    > <  \n" +
            " / ^ \\  _| |_  / ^ \\ \n" +
            "/_/ \\_\\|_____|/_/ \\_\\\n";

        String result = RomanPrinter.print(number);
        
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintAsciiArtForNumber20() {
        int number = 20;
        String expected = 
            "__   ____   __\n" +
            "\\ \\ / /\\ \\ / /\n" +
            " \\ V /  \\ V / \n" +
            "  > <    > <  \n" +
            " / ^ \\  / ^ \\ \n" +
            "/_/ \\_\\/_/ \\_\\\n";

        String result = RomanPrinter.print(number);

        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintAsciiArtForNumber40() {
        int number = 40;
        String expected = 
            "__   __ _      \n" +
            "\\ \\ / /| |     \n" +
            " \\ V / | |     \n" +
            "  > <  | |     \n" +
            " / ^ \\ | |____ \n" +
            "/_/ \\_\\|______|\n";

        String result = RomanPrinter.print(number);

        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintAsciiArtForNumber50() {
        int number = 50;
        String expected = 
            " _      \n" +
            "| |     \n" +
            "| |     \n" +
            "| |     \n" +
            "| |____ \n" +
            "|______|\n";
        String result = RomanPrinter.print(number);

        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintAsciiArtForNumber44() {
    int number = 44; 
    String expected = 
        "__   __ _       _____ __      __\n" +
        "\\ \\ / /| |     |_   _|\\ \\    / /\n" +
        " \\ V / | |       | |   \\ \\  / / \n" +
        "  > <  | |       | |    \\ \\/ /  \n" +
        " / ^ \\ | |____  _| |_    \\  /   \n" +
        "/_/ \\_\\|______||_____|    \\/    \n";

    String result = RomanPrinter.print(number);

    assertEquals(expected, result);
}
}