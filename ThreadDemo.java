// Demonstrating Threads in Java
class WorkerThread extends Thread {
    private String taskName;

    WorkerThread(String name) {
        this.taskName = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " - step " + i);
            try {
                Thread.sleep(500); // pause for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println(taskName + " interrupted.");
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        WorkerThread t1 = new WorkerThread("Thread A");
        WorkerThread t2 = new WorkerThread("Thread B");

        t1.start(); // start first thread
        t2.start(); // start second thread

        // Main thread also does work
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread - step " + i);
            try {
                Thread.sleep(700); // pause for 0.7 seconds
            } catch (InterruptedException e) {
                System.out.println("Main Thread interrupted.");
            }
        }
    }
}
