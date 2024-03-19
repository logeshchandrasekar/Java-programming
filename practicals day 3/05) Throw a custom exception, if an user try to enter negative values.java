class NegativeValueException extends Exception {
    public NegativeValueException() {
        super("Negative values are not allowed.");
    }
}

public class Java {
    public static void main(String[] args) {
        try {
            int userInput = getUserInput();
            if (userInput < 0) {
                throw new NegativeValueException();
            }
            System.out.println("User input: " + userInput);
        } catch (NegativeValueException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int getUserInput() {

        return -5; 
}
} 