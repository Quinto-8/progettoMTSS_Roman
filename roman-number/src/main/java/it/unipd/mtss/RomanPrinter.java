////////////////////////////////////////////////////////////////////
// ANDREA MAGGIO 2145610
// ALEX BUOSO 2148614
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        String result = "";
        for (int row = 0; row < 6; row++) {
            for (int i = 0; i < romanNumber.length(); i++) {
                result += getLine(romanNumber.charAt(i), row);
            }
            result += "\n";
        }
        return result.toString();
    }
 
    private static String getLine(char letter, int row) {
        if (letter == 'I') {
                String[] iArt={
                    " _____ ",
                    "|_   _|",
                    "  | |  ",
                    "  | |  ",
                    " _| |_ ",
                    "|_____|"
                };
                return iArt[row];
        }
        if (letter == 'V'){
                String[] vArt={
                    "__      __",
                    "\\ \\    / /",
                    " \\ \\  / / ",
                    "  \\ \\/ /  ",
                    "   \\  /   ",
                    "    \\/    "
                };
                return vArt[row];
        }
        if (letter == 'X'){
                String[] xArt={
                    "__   __",
                    "\\ \\ / /",
                    " \\ V / ",
                    "  > <  ",
                    " / ^ \\ ",
                    "/_/ \\_\\"
                };
                return xArt[row];
        }

        if (letter == 'L') {
                String[] lArt={
                    " _      ",
                    "| |     ",
                    "| |     ",
                    "| |     ",
                    "| |____ ",
                    "|______|"
                };
                return lArt[row];
        }
        return "";

    }
}