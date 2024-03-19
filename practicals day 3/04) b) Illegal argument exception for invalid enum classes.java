enum Color {
    RED, GREEN, BLUE
}

public class Java {

    
    public static void processColor(Color color) {
        
        if (color == null) {
            throw new IllegalArgumentException("Invalid enum constant. Color cannot be null.");
        }

       
        System.out.println("Processing color: " + color);
       
    }

    public static void main(String[] args) {
        try {
         
            processColor(Color.RED);

            processColor(null); 
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
           
        }
    }
}

