import java.util.TreeSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {10, 20, 10, 30, 20, 40};

        TreeSet<Integer> set = new TreeSet<>();

        for (int i : arr) {
            set.add(i);
        }

        System.out.println("Unique Sorted Elements: " + set);
    }
}