public class Linearsearch {

    // Linear Search method
    public static int linearSearching(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // key found, return index
            }
        }
        return -1; // key not found
    }

    public static void main(String[] args) {
        int[] numbers = {10, 25, 30, 45, 50, 60}; // unsorted array works too
        int key = 45;

        int result = linearSearching(numbers, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found!");
        }
    }
}
