public class Java {

    public static void main(String[] args) {
        try {
          
            processNonNegativeValue(-5);

        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught!");
            e.printStackTrace();
        }
    }

    private static void processNonNegativeValue(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be non-negative");
        }

        System.out.println("Processing non-negative value: " + value);
    }
}
