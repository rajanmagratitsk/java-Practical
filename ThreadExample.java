// Program: Demonstration of Thread in Java

class MyThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);

            try {
                Thread.sleep(1000); // pause for 1 second
            } 
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class ThreadExample {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        t1.start();   // starts child thread

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);

            try {
                Thread.sleep(1000);
            } 
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}