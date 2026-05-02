interface Greeting {
    void sayHello();
}

public class AnonymousClassDemo {
    public static void main(String[] args) {
        
        // Anonymous class implementing Greeting interface
        Greeting greet = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from Anonymous Class!");
            }
        };
        
        greet.sayHello();  // call the method
    }
}
