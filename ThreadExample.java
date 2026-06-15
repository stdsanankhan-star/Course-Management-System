class Worker extends Thread {
    private long sum = 0;

    @Override
    public void run() {
        for (long i = 0; i < 1_000_000_000L; i++) {
            sum += i;
        }
        System.out.println("Thread completed. Sum: " + sum);
    }
}

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {
        // Record the start time to calculate the elapsed time
        long start = System.currentTimeMillis();

        // Create two worker threads
        Worker t1 = new Worker();
        Worker t2 = new Worker();

        // Start the threads
        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        // Record the end time
        long end = System.currentTimeMillis();

        // Print the elapsed time
        System.out.println("Elapsed time: " + (end - start) + " milliseconds");
    }
}
