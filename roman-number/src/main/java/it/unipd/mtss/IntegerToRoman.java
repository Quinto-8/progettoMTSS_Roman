////////////////////////////////////////////////////////////////////
// ANDREA MAGGIO 2145610
// ALEX BUOSO 2148614
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number < 1 || number > 20) {
            throw new IllegalArgumentException("Numero fuori range (1-20)");
        }

        String[] symbols = {"X", "IX", "V", "IV", "I"};
        int[] values = {10, 9, 5, 4, 1};

        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                roman.append(symbols[i]);
                number -= values[i];
            }
        }
        return roman.toString();
    }
}