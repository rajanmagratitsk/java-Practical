class Outer {
    private String message = "Hello from Outer class!";

    // Nested Inner Class
    class Inner {
        void display() {
            System.out.println("Accessing outer message: " + message);
        }
    }

    void showInner() {
        Inner inner = new Inner();  // create object of inner class
        inner.display();
    }
}

public class NestedClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.showInner();   // calls inner class method
    }
}
