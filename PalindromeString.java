
import java.util.Scanner;

public class PalindromeString {
    



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reverse = "";

        // Reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        // Check palindrome
        if (str.equals(reverse)) {
            System.out.println("The string is Palindrome");
        } else {
            System.out.println("The string is not Palindrome");
        }
    }
}

