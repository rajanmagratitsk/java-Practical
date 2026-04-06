import java.util.*;

public class ExpenseSplitter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total expense: ");
        double total = sc.nextDouble();

        System.out.print("Enter number of people: ");
        int n = sc.nextInt();

        double share = total / n;

        System.out.println("Each person should pay: " + share);
    }
}