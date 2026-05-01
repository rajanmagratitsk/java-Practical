// Demonstrating Thread Synchronization in Java
class Counter {
    private int count = 0;

    // synchronized method ensures only one thread at a time can access it
    public synchronized void increment(String threadName) {
        count++;
        System.out.println(threadName + " incremented count to: " + count);
    }

    public int getCount() {
        return count;
    }
}

class WorkerThread extends Thread {
    private Counter counter;
    private String threadName;

    WorkerThread(Counter counter, String name) {
        this.counter = counter;
        this.threadName = name;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.increment(threadName);
            try {
                Thread.sleep(300); // simulate work
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }
    }
}

public class SyncDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();

        WorkerThread t1 = new WorkerThread(counter, "Thread A");
        WorkerThread t2 = new WorkerThread(counter, "Thread B");

        t1.start();
        t2.start();

        try {
            t1.join(); // wait for t1 to finish
            t2.join(); // wait for t2 to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Final count: " + counter.getCount());
    }
}
