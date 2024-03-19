class InvalidDecimalNumberException extends Exception {
    public InvalidDecimalNumberException() {
        super("Invalid decimal number entered.");
    }
}

public class Java {
    public static void main(String[] args) {
        try {
            double userInput = getUserInput();
            if (!isValidDecimal(userInput)) {
                throw new InvalidDecimalNumberException();
            }
            System.out.println("User input: " + userInput);
        } catch (InvalidDecimalNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static double getUserInput() {
        
        return -5.5; 
    }

    public static boolean isValidDecimal(double number) {
        
        return Double.isFinite(number);
    }
}
