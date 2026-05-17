public class ConditionalOperatorDemo {
    public static void main(String[] args) {
        int num = 7;

        // Using conditional operator
        String result = (num % 2 == 0) ? "Even Number" : "Odd Number";

        System.out.println("Number: " + num);
        System.out.println("Result: " + result);
    }
}