class Shared {
    int data;
    boolean hasData = false;

    
    synchronized void produce(int value) {
        while (hasData) {
            try {
                wait(); // wait if data not consumed
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        data = value;
        hasData = true;
        System.out.println("Produced: " + data);

        notify(); // notify consumer
    }

  
    synchronized void consume() {
        while (!hasData) {
            try {
                wait(); // wait if no data
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("Consumed: " + data);
        hasData = false;

        notify(); // notify producer
    }
}

class Producer extends Thread {
    Shared s;

    Producer(Shared s) {
        this.s = s;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            s.produce(i);

            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }
}

class Consumer extends Thread {
    Shared s;

    Consumer(Shared s) {
        this.s = s;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            s.consume();

            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }
}

public class InterThreadDemo {
    public static void main(String[] args) {

        Shared s = new Shared();

        Producer p = new Producer(s);
        Consumer c = new Consumer(s);

        p.start();
        c.start();
    }
}