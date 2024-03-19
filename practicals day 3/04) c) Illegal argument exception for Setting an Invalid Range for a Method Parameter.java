public class Java{
   
    public static void processNumberInRange(int number) {
        int lowerBound = 1;
        int upperBound = 100;

        
        if (number < lowerBound || number > upperBound) {
            throw new IllegalArgumentException("Invalid number. Must be between " + lowerBound + " and " + upperBound + ".");
        }

       
        System.out.println("Processing number: " + number);
       
    }

    public static void main(String[] args) {
        try {
           
            processNumberInRange(42);

            
            processNumberInRange(150); 
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
            
        }
    }
}

