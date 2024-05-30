package jswig_for_poe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame implements ActionListener {

    // Components
    final private JTextField usernameField;
    final private JPasswordField passwordField;
    final private JButton loginButton;

    public LoginForm() {
        // Frame setup
        setTitle("Login Form");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 2));

        // Labels and fields
        add(new JLabel("Username:"));
        usernameField = new JTextField();
        add(usernameField);

        add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        add(passwordField);

        // Login button
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        add(loginButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            // Get values from fields
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if (username.equals(CredentialStorage.username) && password.equals(CredentialStorage.password)) {
                JOptionPane.showMessageDialog(this, "Login successful!");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password!");
            }

            // Clear fields after login attempt
            usernameField.setText("");
            passwordField.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LoginForm();
        });
    }
}
