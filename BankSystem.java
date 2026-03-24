

import java.sql.*;
import java.util.Scanner;

public class BankSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bankdb", "root", ""
            );

            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Account No: ");
                    int acc = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Initial Balance: ");
                    double bal = sc.nextDouble();

                    PreparedStatement ps1 = conn.prepareStatement(
                        "INSERT INTO account VALUES (?, ?, ?)"
                    );
                    ps1.setInt(1, acc);
                    ps1.setString(2, name);
                    ps1.setDouble(3, bal);
                    ps1.executeUpdate();

                    System.out.println("Account Created!");
                    break;

                case 2:
                    System.out.print("Account No: ");
                    acc = sc.nextInt();

                    System.out.print("Deposit Amount: ");
                    double dep = sc.nextDouble();

                    PreparedStatement ps2 = conn.prepareStatement(
                        "UPDATE account SET balance = balance + ? WHERE accno=?"
                    );
                    ps2.setDouble(1, dep);
                    ps2.setInt(2, acc);

                    if (ps2.executeUpdate() > 0)
                        System.out.println("Deposited!");
                    else
                        System.out.println("Account not found");
                    break;

                case 3:
                    System.out.print("Account No: ");
                    acc = sc.nextInt();

                    System.out.print("Withdraw Amount: ");
                    double wd = sc.nextDouble();

                    // Check balance first
                    PreparedStatement ps3 = conn.prepareStatement(
                        "SELECT balance FROM account WHERE accno=?"
                    );
                    ps3.setInt(1, acc);
                    ResultSet rs = ps3.executeQuery();

                    if (rs.next()) {
                        double current = rs.getDouble("balance");

                        if (current >= wd) {
                            PreparedStatement ps4 = conn.prepareStatement(
                                "UPDATE account SET balance = balance - ? WHERE accno=?"
                            );
                            ps4.setDouble(1, wd);
                            ps4.setInt(2, acc);
                            ps4.executeUpdate();

                            System.out.println("Withdraw Successful!");
                        } else {
                            System.out.println("Insufficient Balance!");
                        }
                    } else {
                        System.out.println("Account not found");
                    }
                    break;

                case 4:
                    System.out.print("Account No: ");
                    acc = sc.nextInt();

                    PreparedStatement ps5 = conn.prepareStatement(
                        "SELECT * FROM account WHERE accno=?"
                    );
                    ps5.setInt(1, acc);
                    ResultSet rs2 = ps5.executeQuery();

                    if (rs2.next()) {
                        System.out.println("Name: " + rs2.getString("name"));
                        System.out.println("Balance: " + rs2.getDouble("balance"));
                    } else {
                        System.out.println("Account not found");
                    }
                    break;

                default:
                    System.out.println("Invalid choice");
            }

            conn.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}