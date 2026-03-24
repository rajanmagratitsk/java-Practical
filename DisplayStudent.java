
package Unit11;
import java.sql.*;

public class DisplayStudent {
   DisplayStudent() {

        try {
        
            Class.forName("com.mysql.cj.jdbc.Driver");

          
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college1", "root", ""
            );

            
            Statement st = conn.createStatement();

          
            ResultSet rs = st.executeQuery("SELECT rollno, name, address FROM student");
            System.out.println("Displaying Records of student table:");

          
            System.out.println("RollNo\tName\tAddress");

            while(rs.next())
            {
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+
                        "\t"+rs.getString(3));
                
            }

           
            conn.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        new DisplayStudent();
    }
}
