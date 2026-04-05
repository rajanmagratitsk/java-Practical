import java.util.*;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 1000;
        int choice;

        do {
            System.out.println("\n1.Deposit  2.Withdraw  3.Check Balance  4.Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    balance += sc.nextDouble();
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    double amt = sc.nextDouble();
                    if(amt <= balance)
                        balance -= amt;
                    else
                        System.out.println("Insufficient balance!");
                    break;

                case 3:
                    System.out.println("Balance: " + balance);
                    break;
            }
        } while(choice != 4);
    }
}