/*Write a program to display whether given number is prime or composite. */

import java.util.Scanner;
public class FindPrimeorComposite {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n,factor=0,i;
        System.out.print("Enter a number: ");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
                factor++;
        }    
        if(factor==2)
            System.out.println(n+" is prime number");
        else
            System.out.println(n+" is Composite number");
    }
}
