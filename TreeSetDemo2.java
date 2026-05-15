import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {

        // Creating TreeSet
        TreeSet<Integer> set = new TreeSet<>();

        // 1. Add elements
        set.add(50);
        set.add(20);
        set.add(40);
        set.add(10);
        set.add(30);

        System.out.println("Initial TreeSet: " + set);

        // 2. Remove element
        set.remove(20);
        System.out.println("After removing 20: " + set);

        // 3. Check if element exists
        System.out.println("Contains 30? " + set.contains(30));

        // 4. Size of set
        System.out.println("Size: " + set.size());

        // 5. First and Last element
        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());

        // 6. Higher and Lower
        System.out.println("Higher than 30: " + set.higher(30));
        System.out.println("Lower than 30: " + set.lower(30));

        // 7. Ceiling and Floor
        System.out.println("Ceiling of 35: " + set.ceiling(35));
        System.out.println("Floor of 35: " + set.floor(35));

        // 8. Poll First and Last
        System.out.println("Poll First: " + set.pollFirst());
        System.out.println("Poll Last: " + set.pollLast());
        System.out.println("After polling: " + set);

        // 9. Iteration
        System.out.print("Elements using loop: ");
        for (Integer i : set) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 10. Descending order
        System.out.println("Descending: " + set.descendingSet());

        // 11. Subset
        System.out.println("Subset (10 to 40): " + set.subSet(10, 40));

        // 12. HeadSet and TailSet
        System.out.println("HeadSet (<40): " + set.headSet(40));
        System.out.println("TailSet (>=30): " + set.tailSet(30));

        // 13. Clear all elements
        set.clear();
        System.out.println("After clear: " + set);
    }
}