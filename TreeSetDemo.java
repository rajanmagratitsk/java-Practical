import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        // Create TreeSet
        TreeSet<Integer> set = new TreeSet<>();

        // 1. Add elements
        set.add(50);
        set.add(20);
        set.add(40);
        set.add(10);
        set.add(30);

        System.out.println("Initial TreeSet (sorted): " + set);

        // 2. Remove element
        set.remove(20);
        System.out.println("After removing 20: " + set);

        // 3. Check element
        System.out.println("Contains 30? " + set.contains(30));

        // 4. First and Last element
        System.out.println("First element: " + set.first());
        System.out.println("Last element: " + set.last());

        // 5. Higher and Lower
        System.out.println("Higher than 30: " + set.higher(30));
        System.out.println("Lower than 30: " + set.lower(30));

        // 6. Ceiling and Floor
        System.out.println("Ceiling of 25: " + set.ceiling(25));
        System.out.println("Floor of 25: " + set.floor(25));

        // 7. Size
        System.out.println("Size: " + set.size());

        // 8. Iterate
        System.out.print("Elements using loop: ");
        for (Integer num : set) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 9. Poll (remove first and last)
        System.out.println("Poll First: " + set.pollFirst());
        System.out.println("Poll Last: " + set.pollLast());
        System.out.println("After polling: " + set);

        // 10. Clear
        set.clear();
        System.out.println("After clearing: " + set);
    }
}