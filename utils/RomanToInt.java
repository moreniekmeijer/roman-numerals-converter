package utils;

import java.util.HashMap;

public class RomanToInt {
    public static int convert(String romanNumber) {

        // HashMap om de Romeinse karakters te linken aan een numerieke waarde (Integer):
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        // Initialisatie van de totale waarde en de 'vorige' waarde.
        int totalValue = 0;
        int previousValue = 0;

        // Omgekeerde for-loop zodat ik de Romeinse karakters ook eventueel kan aftrekken van het karakter dat erna komt.
        // De loop begint dus bij het laatste Romeinse karakter en loopt dan terug.
        for (int i = romanNumber.length() - 1; i >= 0; i--) {

            // initialiseert characters op basis van de index uit de loop, daarna linkt deze de correcte Integer uit de HashMap.
            char currentChar = romanNumber.toUpperCase().charAt(i);
            int currentValue = romanValues.get(currentChar);

            // Deze if-else checkt of het nieuwe karakter uit de index groter of kleiner is dan de vorige,
            // zodat het opgeteld of (else) afgetrokken kan worden van de totale waarde.
            if (currentValue >= previousValue) {
                totalValue += currentValue;
                previousValue = currentValue;
            } else {
                totalValue -= currentValue;
                previousValue = currentValue;
            }
        }
        return totalValue;
    }
}
