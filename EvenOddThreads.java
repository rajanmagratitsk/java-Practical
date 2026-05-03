// Thread program to print even and odd numbers between 10 and 20
class EvenThread extends Thread {
    public void run() {
        for (int i = 10; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Even Thread: " + i);
                try {
                    Thread.sleep(500); // pause for visibility
                } catch (InterruptedException e) {
                    System.out.println("Even Thread interrupted.");
                }
            }
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 10; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd Thread: " + i);
                try {
                    Thread.sleep(500); // pause for visibility
                } catch (InterruptedException e) {
                    System.out.println("Odd Thread interrupted.");
                }
            }
        }
    }
}

public class EvenOddThreads {
    public static void main(String[] args) {
        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();

        even.start(); // start even thread
        odd.start();  // start odd thread
    }
}
