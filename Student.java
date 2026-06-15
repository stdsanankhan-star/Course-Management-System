import java.util.concurrent.Semaphore;

class Student extends Thread {
    private int id;
    private Semaphore semaphore;

    Student(int id, Semaphore semaphore) {
        this.id = id;
        this.semaphore = semaphore;
    }

    public void run() {
        try {
            System.out.println("Student " + id + " waiting for printer...");
            semaphore.acquire(); 
            System.out.println("Student " + id + " got printer and is printing...");
            Thread.sleep(2000);
            System.out.println("Student " + id + " finished printing.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
            System.out.println("Student " + id + " printer. ");
        }
    }
}

public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);

        for (int i = 1; i <= 5; i++) {
            new Student(i, semaphore).start();
        }
    }
}

