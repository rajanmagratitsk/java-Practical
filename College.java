

import java.sql.*;
import java.util.Scanner;
import javax.swing.*;


public class College {
    College()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/College","root","");
            Scanner sc=new Scanner(System.in);
            int n;
            System.out.print("No of students:");
            n=sc.nextInt();
            for(int i=1;i<=n;i++)
            {
                String sql="insert into Student1(Roll,Name,Address,Program)values(?,?,?,?)";
                PreparedStatement ptst=conn.prepareStatement(sql);
                System.out.print("Roll:");
                int roll=sc.nextInt();
                System.out.print("Name:");
                String Sname=sc.next();
                System.out.print("Address:");
                String address=sc.next();
                System.out.print("Program:");
                String program=sc.next();
                ptst.setInt(1, roll);
                ptst.setString(2, Sname);
                ptst.setString(3, address);
                ptst.setString(4, program);
                ptst.executeUpdate();
            }
            String sql="Select * from Student1";
            PreparedStatement stmt=conn.prepareStatement(sql);
            ResultSet rs=stmt.executeQuery(sql);
            System.out.println("Roll\tName\tAddress\tProgram");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+
                        "\t"+rs.getString(3)+"\t"+rs.getString(4));
                
            }
            conn.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public static void main(String[] args) {
        new College();
    
        
    }
}
      
                
                
        
                
            
        
        
            
        
    

