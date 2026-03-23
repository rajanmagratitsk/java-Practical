/*Write a java program to connect database company and insert n employee record(EID, Ename, Salary,Department
)in Employee table and display the employee record who's Department is "Sales"*/
package Unit11;

import java.sql.*;
import java.util.Scanner;
import javax.swing.*;
public class EmployeeOperation {
    EmployeeOperation()
    {
         try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/Company1","root","");
            Scanner sc=new Scanner(System.in);
            int n;
            System.out.print("No of Employee:");
            n=sc.nextInt();
            for(int i=1;i<=n;i++)
            {
                String sql="insert into employee(EID,Ename,Salary,Department)values(?,?,?,?)";
                PreparedStatement ptst=conn.prepareStatement(sql);
                System.out.print("ID:");
                int id=sc.nextInt();
                System.out.print("Name:");
                String Ename=sc.next();
                System.out.print("Salary:");
                int Salary=sc.nextInt();
                System.out.print("Department:");
                String Department=sc.next();
                ptst.setInt(1, id);
                ptst.setString(2, Ename);
                ptst.setInt(3, Salary);
                ptst.setString(4, Department);
                ptst.executeUpdate();
            }
            String sql="Select * from employee where Department ='sales'";
            PreparedStatement stmt=conn.prepareStatement(sql);
            ResultSet rs=stmt.executeQuery(sql);
            System.out.println("EID\tEname\tSalary\tDepartment");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+
                        "\t"+rs.getInt(3)+"\t"+rs.getString(4));
                
            }
            conn.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public static void main(String[] args) {
        new EmployeeOperation();
        
    }
    }
                 

