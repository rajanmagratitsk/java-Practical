/*Write a java program to display first N prime numbers.*/

import java.util.Scanner;
public class FindNprimenos {
     public static void main(String args[]) {
        Scanner rajan=new Scanner(System.in);
        int N,count=0,factor=0,i,n;
        System.out.print("Enter the value of N: ");
        N=rajan.nextInt();
        for(n=1;count!=N;n++)
        {
            for(i=1;i<=n;i++)
            {
                if(n%i==0)
                    factor++;
            }    
            if(factor==2)
            {
                count++;
                System.out.println(n);
            }    
            factor=0;
        }
    }
}
