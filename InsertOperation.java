
package Unit11;

import java.sql.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class InsertOperation {
    InsertOperation(){
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Company1","root","");
            String sql="insert into employee(EID,Ename,Salary,Department)values(?,?,?,?)";
            PreparedStatement ptst=conn.prepareStatement(sql);
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter id :");
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
            conn.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
            
        }
    public static void main(String[] args) {
        new InsertOperation();
    }
    }