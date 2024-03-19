public class Java {
    public static void main(String[] args) {
        try {
            // Creating an array
            int[] originalArray = {1, 2, 3, 4, 5};

            // Passing an incorrect array to the method
            processArray(originalArray, 8); // 8 is an incorrect array length

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
            e.printStackTrace();
        }
    }

    // Method to process the array
    private static void processArray(int[] array, int length) {
        // Attempting to access an element beyond the specified array length
        for (int i = 0; i <= length; i++) {
            System.out.println("Element at index " + i + ": " + array[i]);
        }
    }
}
