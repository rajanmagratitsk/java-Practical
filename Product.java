import java.util.Scanner;
public class Product {
     void connect(int a, int b){
        int result=a*b;
        System.out.println("product is:"+result);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two num:");
        int c=sc.nextInt();
        int d=sc.nextInt();
        Product obj=new Product();
        obj.connect(c, d);
    }
    }