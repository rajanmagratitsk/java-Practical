package Unit11;

import java.sql.*;
import java.util.Scanner;

public class GoogleEmployeeDB {
    public static void main(String[] args) {
        try {
            // 1. Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Connect to database
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/google_company", "root", ""
            );

            Scanner sc = new Scanner(System.in);

            // 3. Insert employee records
            System.out.print("Enter number of employees: ");
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.print("Enter Employee ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Salary: ");
                double salary = sc.nextDouble();
                sc.nextLine();

                System.out.print("Enter Department: ");
                String dept = sc.nextLine();

                String sql = "INSERT INTO employee VALUES (?, ?, ?, ?)";
                PreparedStatement pst = conn.prepareStatement(sql);

                pst.setInt(1, id);
                pst.setString(2, name);
                pst.setDouble(3, salary);
                pst.setString(4, dept);

                pst.executeUpdate();
                System.out.println("Employee added successfully!\n");
            }

            // 4. Display all employees
            System.out.println("\n--- Google Employee Records ---");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("eid") + " | " +
                    rs.getString("ename") + " | " +
                    rs.getDouble("salary") + " | " +
                    rs.getString("department")
                );
            }

            // 5. Close connection
            conn.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}