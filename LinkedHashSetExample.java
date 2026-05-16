import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(100);
        set.add(50);
        set.add(200);

        System.out.println("LinkedHashSet: " + set);
    }
}