import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        // 1. Create HashSet
        HashSet<Integer> set = new HashSet<>();

        // 2. Add elements
        set.add(50);
        set.add(20);
        set.add(40);
        set.add(10);
        set.add(30);
        set.add(30); // duplicate (ignored)

        System.out.println("HashSet elements: " + set);

        // 3. Remove element
        set.remove(20);
        System.out.println("After removing 20: " + set);

        // 4. Check element
        System.out.println("Contains 30? " + set.contains(30));

        // 5. Size
        System.out.println("Size: " + set.size());

        // 6. Check empty
        System.out.println("Is empty? " + set.isEmpty());

        // 7. Iterate
        System.out.print("Elements using loop: ");
        for (Integer num : set) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 8. Clear
        set.clear();
        System.out.println("After clearing: " + set);
    }
}