import java.util.*;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = (int)(Math.random() * 100) + 1;
        int guess;

        do {
            System.out.print("Guess number (1-100): ");
            guess = sc.nextInt();

            if(guess > number)
                System.out.println("Too high!");
            else if(guess < number)
                System.out.println("Too low!");
            else
                System.out.println("Correct 🎯");

        } while(guess != number);
    }
}