import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList of Integers
        List<Integer> numbers = new LinkedList<>();

        // Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Display the LinkedList
        System.out.println("Numbers LinkedList: " + numbers);

        // Access elements
        System.out.println("First element: " + numbers.get(0));
        System.out.println("Last element: " + numbers.get(numbers.size() - 1));

        // Remove an element
        numbers.remove(2); // removes element at index 2
        System.out.println("After removing index 2: " + numbers);

        // Iterate through LinkedList
        System.out.println("Iterating through LinkedList:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
