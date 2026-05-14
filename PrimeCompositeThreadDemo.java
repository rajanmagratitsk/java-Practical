class PrimeThread extends Thread {
    public void run() {
        System.out.println("Prime Numbers:");

        for (int i = 100; i <= 200; i++) {
            if (isPrime(i)) {
                System.out.println("Prime: " + i);

                try {
                    Thread.sleep(50); // delay
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }

    boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}

class CompositeThread extends Thread {
    public void run() {
        System.out.println("Composite Numbers:");

        for (int i = 100; i <= 200; i++) {
            if (i > 1 && !isPrime(i)) {
                System.out.println("Composite: " + i);

                try {
                    Thread.sleep(50); // same delay
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }

    boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}

public class PrimeCompositeThreadDemo {
    public static void main(String[] args) {

        PrimeThread t1 = new PrimeThread();
        CompositeThread t2 = new CompositeThread();

        t1.start();
        t2.start();
    }
}