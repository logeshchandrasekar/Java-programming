class NonIntegerValueException extends Exception {
    public NonIntegerValueException() {
        super("Non-integer value entered.");
    }
}

public class Java{
    public static void main(String[] args) {
        try {
            int userInput = getUserInput();
            System.out.println("User input: " + userInput);
        } catch (NonIntegerValueException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int getUserInput() throws NonIntegerValueException {
        double inputValue = -5.5; // Example user input (non-integer value)
        if (inputValue != (int)inputValue) {
            throw new NonIntegerValueException();
        }
        return (int)inputValue;
    }
}
