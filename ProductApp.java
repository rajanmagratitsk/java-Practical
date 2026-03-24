import java.sql.*;
import javax.swing.*;

public class ProductApp {
    ProductApp() {

        JFrame f = new JFrame("Product System");

        JLabel l1 = new JLabel("Product ID:");
        l1.setBounds(20, 20, 100, 20);
        f.add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(120, 20, 150, 20);
        f.add(t1);

        JLabel l2 = new JLabel("Product Name:");
        l2.setBounds(20, 60, 100, 20);
        f.add(l2);

        JTextField t2 = new JTextField();
        t2.setBounds(120, 60, 150, 20);
        f.add(t2);

        JLabel l3 = new JLabel("Price:");
        l3.setBounds(20, 100, 100, 20);
        f.add(l3);

        JTextField t3 = new JTextField();
        t3.setBounds(120, 100, 150, 20);
        f.add(t3);

        JButton insert = new JButton("Insert");
        insert.setBounds(40, 150, 80, 30);
        f.add(insert);

        JButton search = new JButton("Search");
        search.setBounds(150, 150, 80, 30);
        f.add(search);

        // INSERT
        insert.addActionListener(e -> {
            try {
                Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/shopdb", "root", ""
                );

                String sql = "INSERT INTO product VALUES (?, ?, ?)";
                PreparedStatement ps = conn.prepareStatement(sql);

                ps.setInt(1, Integer.parseInt(t1.getText()));
                ps.setString(2, t2.getText());
                ps.setDouble(3, Double.parseDouble(t3.getText()));

                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Product Added!");

                conn.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        });

        // SEARCH
        search.addActionListener(e -> {
            try {
                Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/shopdb", "root", ""
                );

                String sql = "SELECT * FROM product WHERE pid=?";
                PreparedStatement ps = conn.prepareStatement(sql);

                ps.setInt(1, Integer.parseInt(t1.getText()));
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    t2.setText(rs.getString("pname"));
                    t3.setText(String.valueOf(rs.getDouble("price")));
                } else {
                    JOptionPane.showMessageDialog(null, "Not Found");
                }

                conn.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        });

        f.setSize(320, 250);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ProductApp();
    }
}