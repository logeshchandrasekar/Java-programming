import java.util.concurrent.CountDownLatch;

class MatrixGenerator extends Thread {
    private String threadName;
    private int[][] matrix;

    public MatrixGenerator(String threadName) {
        this.threadName = threadName;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    @Override
    public void run() {
        System.out.println(threadName + ": Generating matrix.");
        matrix = generateMatrix();
        System.out.println(threadName + ": Matrix generated.");
    }

    private int[][] generateMatrix() {
        // Implement your logic to generate a 3x3 matrix here
        // For simplicity, using a dummy matrix
        int[][] dummyMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        return dummyMatrix;
    }
}

class MatrixCounter extends Thread {
    private MatrixGenerator t1, t2;
    private CountDownLatch countDownLatch;

    public MatrixCounter(MatrixGenerator t1, MatrixGenerator t2, CountDownLatch countDownLatch) {
        this.t1 = t1;
        this.t2 = t2;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("MatrixCounter: Counting elements in matrices.");
        int totalElements = countElements(t1.getMatrix()) + countElements(t2.getMatrix());
        System.out.println("MatrixCounter: Total elements counted: " + totalElements);
        countDownLatch.countDown(); // Signal that counting is complete
    }

    private int countElements(int[][] matrix) {
        // Implement your logic to count elements in a matrix here
        // For simplicity, using a dummy count
        return 9;
    }
}

class MatrixAdder extends Thread {
    private MatrixGenerator t1, t2;
    private CountDownLatch countDownLatch;

    public MatrixAdder(MatrixGenerator t1, MatrixGenerator t2, CountDownLatch countDownLatch) {
        this.t1 = t1;
        this.t2 = t2;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            // Wait for MatrixCounter to complete counting
            countDownLatch.await();
            System.out.println("MatrixAdder: Acquiring matrices and performing addition.");
            int[][] result = addMatrices(t1.getMatrix(), t2.getMatrix());
            printMatrix("Result Matrix:", result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        // Implement your logic to add matrices here
        // For simplicity, using a dummy addition
        int[][] sum = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sum;
    }

    private void printMatrix(String message, int[][] matrix) {
        System.out.println(message);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Java {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(1);

        MatrixGenerator t1 = new MatrixGenerator("T1");
        MatrixGenerator t2 = new MatrixGenerator("T2");
        MatrixCounter t4 = new MatrixCounter(t1, t2, countDownLatch);
        MatrixAdder t3 = new MatrixAdder(t1, t2, countDownLatch);

        t1.start();
        t2.start();
        t4.start();
        t3.start();

        try {
            // Wait for all threads to finish
            t1.join();
            t2.join();
            t4.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished.");
    }
}
