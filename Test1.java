public class Test1 {
    public static void main(String[] args) {
        try {
            int arr[]={2,3,4,2};
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException yoso) {
            System.out.println("invalid and not found");
        }
    }
    
}
