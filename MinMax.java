import java.util.TreeSet;

public class MinMax {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(15);
        set.add(5);
        set.add(25);
        set.add(10);

        System.out.println("Smallest: " + set.first());
        System.out.println("Largest: " + set.last());
    }
}