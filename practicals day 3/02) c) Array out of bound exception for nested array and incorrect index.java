public class Java{

    public static void main(String[] args) {
        int[][] nestedArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Try to access an element at an incorrect index
        try {
            int element = nestedArray[3][0];
            System.out.println(element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        }
    }
}
