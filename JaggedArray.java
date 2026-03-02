import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a jagged array with 3 rows
        int[][] jagged = new int[3][];

        // Input sizes for each row
        for (int i = 0; i < jagged.length; i++) {
            System.out.print("Enter number of elements for row " + i + ": ");
            int size = sc.nextInt();
            jagged[i] = new int[size];
        }

        // Input elements for each row
        for (int i = 0; i < jagged.length; i++) {
            System.out.println("Enter elements for row " + i + ":");
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = sc.nextInt();
            }
        }

        // Display jagged array and sum of each row
        System.out.println("\nJagged Array with Row Sums:");
        for (int i = 0; i < jagged.length; i++) {
            int sum = 0;
            System.out.print("Row " + i + ": ");
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
                sum += jagged[i][j];
            }
            System.out.println(" | Sum = " + sum);
        }

        sc.close();
    }
}