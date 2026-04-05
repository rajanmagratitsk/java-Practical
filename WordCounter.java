import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String str = sc.nextLine();

        int words = str.split(" ").length;
        int vowels = 0, consonants = 0;

        for(char c : str.toLowerCase().toCharArray()) {
            if(Character.isLetter(c)) {
                if("aeiou".indexOf(c) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Words: " + words);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}