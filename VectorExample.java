import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector of Strings
        Vector<String> languages = new Vector<>();

        // Add elements
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");

        // Display the Vector
        System.out.println("Languages Vector: " + languages);

        // Access elements
        System.out.println("First language: " + languages.firstElement());
        System.out.println("Last language: " + languages.lastElement());

        // Remove an element
        languages.remove("C++");
        System.out.println("After removing C++: " + languages);

        // Iterate through Vector
        System.out.println("Iterating through Vector:");
        for (String lang : languages) {
            System.out.println(lang);
        }
    }
}
