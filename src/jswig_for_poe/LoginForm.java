
package jswig_for_poe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame implements ActionListener {
    // Components
    final private Container container1;
    private final JTextField usernameField;
    private final JPasswordField passwordField;
    private final JButton loginButton;
    private final JLabel username_text, password_text,title;
    public LoginForm() {
        
        // Frame setup
        setTitle("Login Form");
        setSize(700, 425);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     // setLocationRelativeTo(null);
        container1 = getContentPane();
        container1.setLayout(null);
        
        title = new JLabel("Login Form");
        title.setFont(new Font("Arial", Font.PLAIN , 30));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setBounds(100, 30, 500, 50);
        container1.add(title);


        // Labels and fields
        username_text = new JLabel("Username:");
        username_text.setBounds(100, 100, 250, 50);
        container1.add(username_text);
        
        usernameField = new JTextField();
        usernameField.setBounds(350, 100, 250, 50);
        container1.add(usernameField);

        password_text = new JLabel("Password:");
        password_text.setBounds(100, 150, 250, 50);
        container1.add(password_text);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(350, 150, 250, 50);
        container1.add(passwordField);

        // Login button
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        loginButton.setBounds(100,225,500,50);
        
       container1.add(loginButton);  

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            // Get values from fields
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            // this checks the username and password to see if it is the same as the one entered in the registration form"
            if (username.equals(username) && password.equals(password)) {
                JOptionPane.showMessageDialog(this, "Welcome to EasyKanban");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password!");
            }

            // Clear fields after login attempt
            usernameField.setText("");
            passwordField.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginForm();
            }
        });
    }
 
}
