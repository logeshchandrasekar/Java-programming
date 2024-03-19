import java.text.DecimalFormat;
import java.text.ParseException;

public class Java {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#,###.##");
        
        String numberString = "1,234.567"; // Formatted string with comma as decimal separator
        
        try {
            // Trying to parse the formatted string
            double parsedNumber = decimalFormat.parse(numberString).doubleValue();
            System.out.println("Parsed number: " + parsedNumber);
        } catch (ParseException e) {
            System.out.println("Error: Parsing failed. Ensure proper formatting.");
        }
    }
}
