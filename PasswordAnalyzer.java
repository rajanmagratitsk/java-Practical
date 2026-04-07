import java.util.*;

public class PasswordAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        int length = password.length();
        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSymbol = false;

        // Analyze password
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else hasSymbol = true;
        }

        int score = 0;

        if (length >= 8) score++;
        if (length >= 12) score++;
        if (hasUpper) score++;
        if (hasLower) score++;
        if (hasDigit) score++;
        if (hasSymbol) score++;

        // Strength evaluation
        String strength;
        if (score <= 2) strength = "Weak 😡";
        else if (score <= 4) strength = "Medium 😐";
        else strength = "Strong 💪";

        // Estimate crack time (very rough logic)
        double combinations = 1;

        if (hasLower) combinations *= 26;
        if (hasUpper) combinations *= 26;
        if (hasDigit) combinations *= 10;
        if (hasSymbol) combinations *= 32;

        double totalPossibilities = Math.pow(combinations, length);

        // Assume attacker tries 1 billion guesses per second
        double seconds = totalPossibilities / 1_000_000_000;

        String timeEstimate;
        if (seconds < 60) timeEstimate = "Seconds";
        else if (seconds < 3600) timeEstimate = "Minutes";
        else if (seconds < 86400) timeEstimate = "Hours";
        else if (seconds < 31536000) timeEstimate = "Days";
        else timeEstimate = "Years";

        // Output
        System.out.println("\n--- Password Analysis ---");
        System.out.println("Length: " + length);
        System.out.println("Uppercase: " + hasUpper);
        System.out.println("Lowercase: " + hasLower);
        System.out.println("Digits: " + hasDigit);
        System.out.println("Symbols: " + hasSymbol);
        System.out.println("Strength: " + strength);
        System.out.println("Estimated Crack Time: " + (long)seconds + " " + timeEstimate);

        sc.close();
    }
}