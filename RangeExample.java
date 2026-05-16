import java.util.TreeSet;

public class RangeExample {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println("Elements between 20 and 50: " + set.subSet(20, 50));
    }
}