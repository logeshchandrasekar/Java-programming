public class Java {
    public static void main(String[] args) {
        try {
            // Creating an array of size 5
            int[] arr = new int[5];

            
            int element = arr[10];

         
            System.out.println("Array element: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
