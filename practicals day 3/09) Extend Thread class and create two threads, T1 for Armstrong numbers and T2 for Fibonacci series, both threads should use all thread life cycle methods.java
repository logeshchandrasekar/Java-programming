
public class Java {
    public static void main(String[] args) throws InterruptedException {

            // Create two threads, T1 for Armstrong numbers and T2 for Fibonacci series
            Thread T1 = new ArmstrongThread();
            Thread T2 = new FibonacciThread();

            // Start the threads
            T1.start();
            T2.start();

            // Wait for the threads to finish
            T1.join();
            T2.join();

            System.out.println("Both threads have finished executing.");
        }
    }

    class ArmstrongThread extends Thread {

        @Override
        public void run() {
            // Check if a number is an Armstrong number
            for (int i = 1; i < 1000; i++) {
                int n = i;
                int sum = 0;
                while (n > 0) {
                    int digit = n % 10;
                    sum += digit * digit * digit;
                    n /= 10;
                }
                if (sum == i) {
                    System.out.println(i + " is an Armstrong number.");
                }
            }
        }
    }

    class FibonacciThread extends Thread {

        @Override
        public void run() {
            // Calculate the Fibonacci series
            int n1 = 0, n2 = 1, n3;
            System.out.println("Fibonacci Series:");
            System.out.println(n1);
            System.out.println(n2);
            for (int i = 2; i < 10; i++) {
                n3 = n1 + n2;
                System.out.println(n3);
                n1 = n2;
                n2 = n3;
            }
        }
    }
