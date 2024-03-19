class MyThread extends Thread {
    private String threadName;
    private long startTime;
    private long endTime;

    public MyThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        synchronized (this) {
            startTime = System.currentTimeMillis();

            // Perform some task or computation
            for (int i = 0; i < 5; i++) {
                System.out.println(threadName + ": Performing task " + i);
                try {
                    // Simulate some work
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            endTime = System.currentTimeMillis();

            System.out.println(threadName + ": Finished. Total time: " + (endTime - startTime) + " ms");
        }
    }

    public long getExecutionTime() {
        return endTime - startTime;
    }
}

public class Java {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");

        thread1.start();
        thread2.start();

        try {
            // Wait for both threads to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Get execution times
        long executionTimeThread1 = thread1.getExecutionTime();
        long executionTimeThread2 = thread2.getExecutionTime();

        System.out.println("Execution Time - Thread 1: " + executionTimeThread1 + " ms");
        System.out.println("Execution Time - Thread 2: " + executionTimeThread2 + " ms");

        // Compare execution times to determine waiting and sleeping times
        if (executionTimeThread1 > executionTimeThread2) {
            System.out.println("Thread 1 had longer waiting and sleeping time.");
        } else if (executionTimeThread1 < executionTimeThread2) {
            System.out.println("Thread 2 had longer waiting and sleeping time.");
        } else {
            System.out.println("Both threads had the same waiting and sleeping time.");
        }
    }
}


