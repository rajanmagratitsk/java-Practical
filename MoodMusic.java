import java.util.*;

public class MoodMusic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your mood (happy/sad/angry/chill): ");
        String mood = sc.nextLine().toLowerCase();

        switch(mood) {
            case "happy":
                System.out.println("Play: Happy - Pharrell Williams");
                break;
            case "sad":
                System.out.println("Play: Let Her Go - Passenger");
                break;
            case "angry":
                System.out.println("Play: Believer - Imagine Dragons");
                break;
            case "chill":
                System.out.println("Play: Sunset Lover - Petit Biscuit");
                break;
            default:
                System.out.println("Mood not recognized 😅");
        }
    }
}