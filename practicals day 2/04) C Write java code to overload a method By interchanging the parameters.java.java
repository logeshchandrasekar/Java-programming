public class Java {
    // Original method
    public int sum(int a, int b) {
        return a + b;
    }

    // Overloaded method with different types of parameters
    public int sum(double a, double b) {
        return (int)(a + b);
    }

    public static void main(String[] args) {
        Java java = new Java();

        // Using the first sum method
        int sum1 = java.sum(1, 2);
        System.out.println("Sum of two integers: " + sum1);

        // Using the overloaded sum method
        int sum2 = java.sum(1.5, 2.5);
        System.out.println("Sum of two doubles: " + sum2);
    }
}
