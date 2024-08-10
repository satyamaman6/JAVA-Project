package office.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

    JButton login, cancel;
    JTextField ifusername, pwd;

    public Login() {
        // Create a panel to hold the background image
        BackgroundPanel backgroundPanel = new BackgroundPanel();
        backgroundPanel.setLayout(null);

        // Create the label for username
        JLabel lblusername = new JLabel("User Name/ Email_ID/ Emp. NO :");
        lblusername.setBounds(40, 70, 200, 30);
        lblusername.setForeground(Color.BLACK);  // Change text color to match your design
        backgroundPanel.add(lblusername);

        // Create the label for Password
        JLabel pswd = new JLabel("Password:");
        pswd.setBounds(40, 120, 200, 30);
        pswd.setForeground(Color.BLACK);  // Change text color to match your design
        backgroundPanel.add(pswd);

        // Creating input field for username
        ifusername = new JTextField();
        ifusername.setBounds(250, 70, 180, 30);
        ifusername.setHorizontalAlignment(SwingConstants.CENTER);
        backgroundPanel.add(ifusername);

        // Input field for Password
        pwd = new JPasswordField();
        pwd.setBounds(250, 120, 180, 30);
        pwd.setHorizontalAlignment(SwingConstants.CENTER);
        backgroundPanel.add(pwd);

        // Login button
        login = new JButton("Login");
        login.setBounds(220, 180, 100, 30);
        login.addActionListener(this);
        backgroundPanel.add(login);

        // Cancel button
        cancel = new JButton("Cancel");
        cancel.setBounds(350, 180, 100, 30);
        cancel.addActionListener(this);
        backgroundPanel.add(cancel);

        // Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icn/login.JFIF"));
        Image i2 = i1.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(480, 50, 150, 150);
        backgroundPanel.add(image);

        // Set up the JFrame
        getContentPane().add(backgroundPanel);
        setSize(700, 350);
        setLocationRelativeTo(null); // Center the window on the screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit when the window is closed
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == login) {
            String username = ifusername.getText();
            String password = pwd.getText();

            String query = "select * from Userlogin where username='" + username + "' and password='" + password + "'";
           
            try {
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                
                if (rs.next()){
                    setVisible(false);
                    new Project();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or Password");
                    setVisible(false);
                }   
                c.s.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if(ae.getSource() == cancel) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Login();
    }

    // Inner class for the background panel
    class BackgroundPanel extends JPanel {
        private Image backgroundImage;

        public BackgroundPanel() {
            try {
                backgroundImage = new ImageIcon(ClassLoader.getSystemResource("icn/login_1.JPG")).getImage();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (backgroundImage != null) {
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        }
    }
}
