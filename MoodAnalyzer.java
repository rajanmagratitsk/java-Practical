import java.util.*;

public class MoodAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Type a sentence and press Enter:");
        
        long startTime = System.currentTimeMillis();
        String input = sc.nextLine();
        long endTime = System.currentTimeMillis();

        long timeTaken = endTime - startTime; // milliseconds
        int length = input.length();

        // Count punctuation
        int exclam = 0, question = 0;
        for (char c : input.toCharArray()) {
            if (c == '!') exclam++;
            if (c == '?') question++;
        }

        // Calculate typing speed (chars per second)
        double speed = (length / (timeTaken / 1000.0));

        // Analyze mood
        String mood;

        if (speed > 20 && exclam > 0) {
            mood = "🔥 Excited / Energetic";
        } else if (question > 1) {
            mood = "🤔 Curious / Confused";
        } else if (speed < 10) {
            mood = "😴 Calm / Slow / Thoughtful";
        } else {
            mood = "🙂 Neutral";
        }

        // Output
        System.out.println("\n--- Analysis Result ---");
        System.out.println("Typing Speed: " + String.format("%.2f", speed) + " chars/sec");
        System.out.println("Exclamation Marks: " + exclam);
        System.out.println("Question Marks: " + question);
        System.out.println("Predicted Mood: " + mood);

        sc.close();
    }
}