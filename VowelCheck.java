import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str;
        char ch;

        System.out.print("Enter word: ");
        str = sc.next();

        if(str.length() > 1) {
            System.out.println("Error");
        }
        else {
            ch = str.charAt(0);

            if(Character.isLetter(ch)) {

                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
                   ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {

                    System.out.println(ch + " is vowel");
                }
                else {
                    System.out.println(ch + " is consonant");
                }

            } else {
                System.out.println("Not an alphabet");
            }
        }
    }
}