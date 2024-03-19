public class Java {
    // Original method with two parameters
    int sum(int a, int b) {
        return a + b;
    }

    // Overloaded method with three parameters
    int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with one parameter
    int sum(int a) {
        return a;
    }

    public static void main(String[] args) {
        Java java = new Java();

        System.out.println("Sum of 2 and 3: " + java.sum(2, 3));  // This will call the original method
        System.out.println("Sum of 2, 3 and 4: " + java.sum(2, 3, 4));  // This will call the overloaded method with three parameters
        System.out.println("Sum of 2: " + java.sum(2));  // This will call the overloaded method with one parameter
    }
}
