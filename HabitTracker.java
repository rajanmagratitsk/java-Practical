import java.util.*;

public class HabitTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int streak = 0;
        String choice;

        while(true) {
            System.out.print("Did you complete your habit today? (yes/no/exit): ");
            choice = sc.nextLine().toLowerCase();

            if(choice.equals("yes")) {
                streak++;
                System.out.println("🔥 Streak: " + streak);
            } 
            else if(choice.equals("no")) {
                streak = 0;
                System.out.println("Streak reset 😢");
            } 
            else if(choice.equals("exit")) {
                break;
            }
        }
    }
}