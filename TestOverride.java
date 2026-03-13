class Shape {
    void area() {
        System.out.println("Calculating area...");
    }
}

class Rectangle extends Shape {
    void area() {   // overriding parent method
        int l = 5;
        int b = 4;
        System.out.println("Area of Rectangle: " + (l * b));
    }
}

class Circle extends Shape {
    void area() {   // overriding parent method
        double r = 3;
        System.out.println("Area of Circle: " + (3.14 * r * r));
    }
}

public class TestOverride {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle();
        rect.area();

        Circle cir = new Circle();
        cir.area();
    }
}