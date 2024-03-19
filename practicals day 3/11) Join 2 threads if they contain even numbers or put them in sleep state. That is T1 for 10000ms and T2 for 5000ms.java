import java.util.concurrent.Semaphore;

class MyThread extends Thread {
    private String threadName;
    private int[] numbers;
    private Semaphore semaphore;

    public MyThread(String threadName, int[] numbers, Semaphore semaphore) {
        this.threadName = threadName;
        this.numbers = numbers;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        if (containsEven(numbers)) {
            // If the array contains even numbers, acquire the semaphore
            System.out.println(threadName + ": Acquiring semaphore.");
            try {
                semaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadName + ": Joining the thread.");
        } else {
            // If the array does not contain even numbers, sleep for a specific time
            int sleepTime = threadName.equals("T1") ? 10000 : 5000;
            System.out.println(threadName + ": Sleeping for " + sleepTime + "ms.");
            try {
                sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(threadName + ": Finished.");
    }

    private boolean containsEven(int[] numbers) {
        for (int number : numbers) {
            if (number % 2 == 0) {
                return true;
            }
        }
        return false;
    }
}

public class Java {
    public static void main(String[] args) {
        int[] numbers1 = {1, 3, 5, 7, 9};
        int[] numbers2 = {2, 4, 6, 8, 10};

        Semaphore semaphore = new Semaphore(1);

        MyThread t1 = new MyThread("T1", numbers1, semaphore);
        MyThread t2 = new MyThread("T2", numbers2, semaphore);

        t1.start();
        t2.start();

        try {
            // Allow T1 to acquire the semaphore before T2
            semaphore.release();
            
            // Wait for both threads to finish
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished.");
    }
}
