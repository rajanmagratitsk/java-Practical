import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter message: ");
        String msg = sc.nextLine();
        System.out.print("Enter shift: ");
        int shift = sc.nextInt();
        String cipher = "";

        for(char c : msg.toCharArray()){
            if(Character.isLetter(c)){
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                cipher += (char)((c - base + shift) % 26 + base);
            } else {
                cipher += c;
            }
        }
        System.out.println("Encrypted: " + cipher);
    }
}