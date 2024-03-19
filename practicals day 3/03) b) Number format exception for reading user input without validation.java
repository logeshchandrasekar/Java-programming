import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        String userInput = scanner.nextLine();
        
        try {
            // Trying to parse user input without validation
            int parsedNumber = Integer.parseInt(userInput);
            System.out.println("Parsed number: " + parsedNumber);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter a valid number.");
        }
        
        scanner.close();
    }
}
