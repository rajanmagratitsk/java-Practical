import java.util.*;

public class StudyRoutineGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] days = {
            "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday", "Sunday"
        };

        String[] routine = new String[7];

        System.out.println("Enter 4 subjects:");
        String sub1 = sc.nextLine(); // Programming
        String sub2 = sc.nextLine(); // Math
        String sub3 = sc.nextLine(); // Computer
        String sub4 = sc.nextLine(); // English

        // Assign routine logically
        routine[0] = sub1 + " + " + sub2; // Monday
        routine[1] = sub3 + " + " + sub1; // Tuesday
        routine[2] = sub2 + " + " + sub4; // Wednesday
        routine[3] = sub1 + " + " + sub3; // Thursday
        routine[4] = "Weak Subject + Revision"; // Friday
        routine[5] = "Test + All Subjects Revision"; // Saturday
        routine[6] = sub4 + " (Light Study)"; // Sunday

        // Output
        System.out.println("\n--- Your Weekly Study Routine ---");
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i] + " : " + routine[i]);
        }

        sc.close();
    }
}