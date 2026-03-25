
package Unit11;
import java.sql.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class UpdateOperation {
    UpdateOperation()
    {
     try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Company1","root","");
            String sql="update employee set Ename=?,Salary=?,Department=? where EID=?";
            PreparedStatement ptst=conn.prepareStatement(sql);
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter id to Update record:");
            int id=sc.nextInt();
            System.out.print("Name:");
            String Ename=sc.next();
            System.out.print("Salary:");
            int Salary=sc.nextInt();
            System.out.print("Department:");
            String Department=sc.next();
            ptst.setString(1,Ename);
            ptst.setInt(2, Salary);
            ptst.setString(3, Department);
            ptst.setInt(4, id);
           
            ptst.executeUpdate();
            conn.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
            
        }
    public static void main(String[] args) {
        new UpdateOperation();
    }
    }
