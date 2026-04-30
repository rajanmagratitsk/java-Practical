import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap with Integer keys and String values
        Map<Integer, String> students = new HashMap<>();

        // Add elements
        students.put(101, "Rajan");
        students.put(102, "Sita");
        students.put(103, "Ram");

        // Display the HashMap
        System.out.println("Students HashMap: " + students);

        // Access by key
        System.out.println("Student with ID 102: " + students.get(102));

        // Remove an entry
        students.remove(103);
        System.out.println("After removing ID 103: " + students);

        // Iterate through HashMap
        System.out.println("Iterating through HashMap:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
