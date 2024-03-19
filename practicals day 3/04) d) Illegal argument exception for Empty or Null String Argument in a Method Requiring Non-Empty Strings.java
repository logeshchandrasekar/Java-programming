public class Java {
    
        public static void processNonEmptyString(String input) {
        
            if (input == null || input.isEmpty()) {
                throw new IllegalArgumentException("Invalid string. Must be non-empty and non-null.");
            }

            
            System.out.println("Processing string: " + input);
           
        }

        public static void main(String[] args) {
            try {
                
                processNonEmptyString("Hello, World!");

                processNonEmptyString(""); 

                
                processNonEmptyString(null); 
            } catch (IllegalArgumentException e) {
                System.out.println("Caught Exception: " + e.getMessage());
              
            }
        }
    }
