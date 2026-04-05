import java.util.*;

public class ChatBot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println("ChatBot: Hello! Type 'bye' to exit.");

        while(true) {
            System.out.print("You: ");
            input = sc.nextLine().toLowerCase();

            if(input.contains("hello"))
                System.out.println("ChatBot: Hi there!");
            else if(input.contains("how are you"))
                System.out.println("ChatBot: I'm just code, but I'm fine 😄");
            else if(input.contains("name"))
                System.out.println("ChatBot: I am your Java Bot!");
            else if(input.contains("bye")) {
                System.out.println("ChatBot: Goodbye!");
                break;
            }
            else
                System.out.println("ChatBot: I don't understand...");
        }
    }
}