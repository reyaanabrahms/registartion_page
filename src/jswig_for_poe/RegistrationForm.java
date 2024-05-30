package jswig_for_poe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends JFrame implements ActionListener {
    
    private JTextField firstNameField, lastNameField, phoneNumberField, usernameField;
    private JPasswordField passwordField;
    private JButton registerButton;

    public RegistrationForm() {
      
        //JPanel
        setTitle("Registration Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 2));

       
        add(new JLabel("First Name:"));
        firstNameField = new JTextField();
        add(firstNameField);

        add(new JLabel("Last Name:"));
        lastNameField = new JTextField();
        add(lastNameField);

        add(new JLabel("Phone Number:"));
        phoneNumberField = new JTextField();
        add(phoneNumberField);

        add(new JLabel("Username:"));
        usernameField = new JTextField();
        add(usernameField);

        add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        add(passwordField);

        // Register button
        registerButton = new JButton("Register");
        registerButton.addActionListener(this);
        add(registerButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton) {
            // Get values from fields
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            String phoneNumber = phoneNumberField.getText();
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            // You can perform validation or registration logic here
            // For simplicity, just printing the values
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
            System.out.println("Phone Number: " + phoneNumber);
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);

            // Clear fields after registration
            firstNameField.setText("");
            lastNameField.setText("");
            phoneNumberField.setText("");
            usernameField.setText("");
            passwordField.setText("");
            
        }//end of if statment
    }//action event end

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new RegistrationForm();
            }//end of void 
        });
    }//end of main
}//end of class


    

