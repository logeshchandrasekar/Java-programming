public class LogarithmExample {
    public static void main(String[] args) {
        try {
            double num = -10;
            if (num <= 0) {
                throw new ArithmeticException("Logarithm of negative or zero is undefined");
            }
            double result = Math.log(num);
            System.out.println("Result of logarithm: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
