// Program: Demonstration of finally block

class FinallyExample {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int c = a / b;   // Exception occurs
            System.out.println("Result = " + c);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception handled: Division by zero");
        }
        finally {
            System.out.println("Finally block always executes");
        }

        System.out.println("Program ended");
    }
}