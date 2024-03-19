public class Java {
    // Original method with int parameters
    int sum(int a, int b) {
        return a + b;
    }
    // Overloaded method with double parameters
    double sum(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        Java java = new Java();
        System.out.println("Sum of 2 and 3: " + java.sum(2, 3));  // This will call the original method
        System.out.println("Sum of 2.5 and 3.5: " + java.sum(2.5, 3.5));  // This will call the overloaded method with double parameters
    }
}
