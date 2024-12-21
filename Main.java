import utils.IntToRoman;
import utils.RomanToInt;

public class Main {
    public static void main(String[] args) {

        // initialize a Roman numeral
        String roman = "MMXXIV";
        int number = 2024;

        // Method call
        int result = RomanToInt.convert(roman);
        String result2 = IntToRoman.convert(number);

        // Answer
        System.out.println(result);
        System.out.println(result2);
    }
}