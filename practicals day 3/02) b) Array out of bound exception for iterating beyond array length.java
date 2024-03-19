public class Java {
    public static void main(String[] args) {
        // Creating an array of size 5
        int[] array = {1, 2, 3, 4, 5};

        try {
            // Attempting to access an element beyond the array length
            for (int i = 0; i <= array.length; i++) {
                System.out.println("Element at index " + i + ": " + array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
            e.printStackTrace();
        }
    }
}
