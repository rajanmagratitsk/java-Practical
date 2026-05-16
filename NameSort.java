import java.util.TreeSet;

public class NameSort {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();

        names.add("Rajan");
        names.add("Anish");
        names.add("Sita");
        names.add("Bibek");

        System.out.println("Sorted Names: " + names);
    }
}