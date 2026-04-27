public class BinarySearchExample {

    // Binary Search method
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;  // find middle index

            if (arr[mid] == key) {
                return mid;  // key found, return index
            } else if (arr[mid] < key) {
                low = mid + 1;  // search in right half
            } else {
                high = mid - 1; // search in left half
            }
        }
        return -1; // key not found
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70}; // sorted array
        int key = 40;

        int result = binarySearch(numbers, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found!");
        }
    }
}
