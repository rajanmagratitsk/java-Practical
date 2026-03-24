
import java.sql.*;
import java.util.Scanner;

public class StudentDB {
  StudentDB(){
        Scanner sc = new Scanner(System.in);

        try {
         
            Class.forName("com.mysql.cj.jdbc.Driver");

       
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college1", "root", ""
            );

           
            String query = "INSERT INTO student(Rollno,Name,Address) VALUES (?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(query);
            int n;
            System.out.print("no of students:");
            n=sc.nextInt();
            for(int i=1;i<=n;i++){
        
            System.out.print("Enter Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Address: ");
            String address = sc.nextLine();
            
           
            pst.setInt(1, roll);
            pst.setString(2, name);
            pst.setString(3, address);

          
            pst.executeUpdate();
            }

            System.out.println("Record Inserted Successfully!");

        
            conn.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new StudentDB();
    }
}