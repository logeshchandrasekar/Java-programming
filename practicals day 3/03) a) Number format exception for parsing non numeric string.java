public class Java {
    public static void main(String[] args) {
        String nonNumericString = "hello";

        try {
            // Trying to parse a non-numeric string
            int parsedNumber = Integer.parseInt(nonNumericString);
            System.out.println("Parsed number: " + parsedNumber);
        } catch (NumberFormatException e) {
            System.out.println("Error: Cannot parse a non-numeric string.");
        }
    }
}
