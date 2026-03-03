import java.util.Scanner;
public class ArraySortReverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n:");
        int n=sc.nextInt();
        sc.nextLine();
        String []names=new String[n];
        for(int i=0;i<names.length;i++){
            System.out.println("enter name:");
            names[i]=sc.nextLine();
        }
        System.out.println("names displayed in reverse:");
        for(int i=names.length-1;i>=0;i--){
            System.out.println(names[i]);
            

        }
    }
}
