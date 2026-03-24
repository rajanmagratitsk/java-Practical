package Unit11;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class BankSystem1 extends JFrame implements ActionListener {

    JTextField accField, nameField, balField, amountField;
    JButton createBtn, depositBtn, withdrawBtn, balanceBtn;

    Connection conn;

    public BankSystem1() {
        setTitle("Bank System");
        setSize(400, 300);
        setLayout(new GridLayout(6, 2));

        // Labels + Fields
        add(new JLabel("Account No:"));
        accField = new JTextField();
        add(accField);

        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Balance / Amount:"));
        balField = new JTextField();
        add(balField);

        // Buttons
        createBtn = new JButton("Create Account");
        depositBtn = new JButton("Deposit");
        withdrawBtn = new JButton("Withdraw");
        balanceBtn = new JButton("Check Balance");

        add(createBtn);
        add(depositBtn);
        add(withdrawBtn);
        add(balanceBtn);

        createBtn.addActionListener(this);
        depositBtn.addActionListener(this);
        withdrawBtn.addActionListener(this);
        balanceBtn.addActionListener(this);

        try {
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bankdb", "root", ""
            );
        } catch (Exception e) {
            System.out.println(e);
        }

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        try {
            int acc = Integer.parseInt(accField.getText());

            if (e.getSource() == createBtn) {

                String name = nameField.getText();
                double bal = Double.parseDouble(balField.getText());

                PreparedStatement ps = conn.prepareStatement(
                    "INSERT INTO account VALUES (?, ?, ?)"
                );
                ps.setInt(1, acc);
                ps.setString(2, name);
                ps.setDouble(3, bal);

                ps.executeUpdate();

                JOptionPane.showMessageDialog(this, "Account Created!");

            } else if (e.getSource() == depositBtn) {

                double dep = Double.parseDouble(balField.getText());

                PreparedStatement ps = conn.prepareStatement(
                    "UPDATE account SET balance = balance + ? WHERE accno=?"
                );
                ps.setDouble(1, dep);
                ps.setInt(2, acc);

                if (ps.executeUpdate() > 0)
                    JOptionPane.showMessageDialog(this, "Deposited!");
                else
                    JOptionPane.showMessageDialog(this, "Account not found");

            } else if (e.getSource() == withdrawBtn) {

                double wd = Double.parseDouble(balField.getText());

                PreparedStatement ps = conn.prepareStatement(
                    "SELECT balance FROM account WHERE accno=?"
                );
                ps.setInt(1, acc);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    double current = rs.getDouble("balance");

                    if (current >= wd) {
                        PreparedStatement ps2 = conn.prepareStatement(
                            "UPDATE account SET balance = balance - ? WHERE accno=?"
                        );
                        ps2.setDouble(1, wd);
                        ps2.setInt(2, acc);
                        ps2.executeUpdate();

                        JOptionPane.showMessageDialog(this, "Withdraw Successful!");
                    } else {
                        JOptionPane.showMessageDialog(this, "Insufficient Balance!");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Account not found");
                }

            } else if (e.getSource() == balanceBtn) {

                PreparedStatement ps = conn.prepareStatement(
                    "SELECT * FROM account WHERE accno=?"
                );
                ps.setInt(1, acc);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    JOptionPane.showMessageDialog(this,
                        "Name: " + rs.getString("name") +
                        "\nBalance: " + rs.getDouble("balance")
                    );
                } else {
                    JOptionPane.showMessageDialog(this, "Account not found");
                }
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }

    public static void main(String[] args) {
        new BankSystem1();
    }
}