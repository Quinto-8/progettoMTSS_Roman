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
        return result;
    }
    private static String getLine(char letter, int row) {
        if (letter == 'I') {
            String[] iArt = {
                " _____ ",
                "|_   _|",
                "  | |  ",
                "  | |  ",
                " _| |_ ",
                "|_____|"
            };
            return iArt[row];
        }
        return "";
    }
}
