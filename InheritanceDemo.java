class Parent {
    void display() {
        System.out.println("Parent class method");
    }
}
class Child extends Parent {
    void show() {
        System.out.println("Child class method");
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Child c = new Child();
        c.display(); // inherited
        c.show();    // own method
    }
}
