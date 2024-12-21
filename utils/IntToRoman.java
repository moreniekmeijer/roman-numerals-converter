package utils;

import java.util.HashMap;

public class IntToRoman {
    public static String convert(int number) {
        HashMap<Integer, String> firstValues = new HashMap<>();
        firstValues.put(1, "I");
        firstValues.put(2, "II");
        firstValues.put(3, "III");
        firstValues.put(4, "IV");
        firstValues.put(5, "V");
        firstValues.put(6, "VI");
        firstValues.put(7, "VII");
        firstValues.put(8, "VIII");
        firstValues.put(9, "IX");

        HashMap<Integer, String> secondValues = new HashMap<>();
        secondValues.put(1, "X");
        secondValues.put(2, "XX");
        secondValues.put(3, "XXX");
        secondValues.put(4, "XL");
        secondValues.put(5, "L");
        secondValues.put(6, "LX");
        secondValues.put(7, "LXX");
        secondValues.put(8, "LXXX");
        secondValues.put(9, "XC");

        HashMap<Integer, String> thirdValues = new HashMap<>();
        thirdValues.put(1, "C");
        thirdValues.put(2, "CC");
        thirdValues.put(3, "CCC");
        thirdValues.put(4, "CD");
        thirdValues.put(5, "D");
        thirdValues.put(6, "DC");
        thirdValues.put(7, "DCC");
        thirdValues.put(8, "DCCC");
        thirdValues.put(9, "CM");

        if (number < 1 || number > 9999) {
            throw new IllegalArgumentException("Nummer moet tussen 1 en 9999 liggen.");
        }

        StringBuilder romanNumber = new StringBuilder();

        int millenia = number / 1000;
        if (millenia > 0) {
            romanNumber.append("M".repeat(millenia));
        }

        int cents = (number % 1000) / 100;
        if (cents > 0) {
            romanNumber.append(thirdValues.get(cents));
        }

        int tens = (number % 100) / 10;
        if (tens > 0) {
            romanNumber.append(secondValues.get(tens));
        }


        int ones = number % 10;
        if (ones > 0) {
            romanNumber.append(firstValues.get(ones));
        }

        return romanNumber.toString();
    }
}
