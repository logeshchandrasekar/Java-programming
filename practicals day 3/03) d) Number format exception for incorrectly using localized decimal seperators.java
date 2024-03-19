import java.text.NumberFormat;
import java.text.ParseException;


public class Java {
    public static void main(String[] args) {
        // Creating a NumberFormat instance for the user's default locale
        NumberFormat numberFormat = NumberFormat.getNumberInstance();

        // Parsing a string with a localized decimal separator
        String numberString = "1.234,567"; // Using dot as thousand separator and comma as decimal separator (Localized)

        try {
            // Trying to parse the string
            double parsedNumber = numberFormat.parse(numberString).doubleValue();
            System.out.println("Parsed number: " + parsedNumber);
        } catch (ParseException e) {
            System.out.println("Error: Parsing failed. Ensure correct usage of decimal separators.");
        }
    }
}
