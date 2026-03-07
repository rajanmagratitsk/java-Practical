import java.util.Scanner;
class EvenorOdd {

    void check(int n) {

        if(n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       EvenorOdd obj = new EvenorOdd();
       System.out.println("enter n:");
       int n=sc.nextInt();
        obj.check(n);

    }
}