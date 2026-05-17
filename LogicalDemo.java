public class LogicalDemo {
    public static void main(String[] args) {
        int age = 20;

        System.out.println(age > 18 && age < 30); // true
        System.out.println(age > 18 || age < 10); // true
        System.out.println(!(age > 18));          // false
    }
}