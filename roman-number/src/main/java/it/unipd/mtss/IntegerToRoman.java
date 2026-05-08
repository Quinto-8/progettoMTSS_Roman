////////////////////////////////////////////////////////////////////
// ANDREA MAGGIO 2145610
// ALEX BUOSO 2148614
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

    public static String convert(int number) {
        if (number < 1 || number > 3) {
            throw new IllegalArgumentException("Numero fuori range");
        }
        
        String result = "";
        for (int i = 0; i < number; i++) {
            result += "I";
        }
        return result;
    }
}
