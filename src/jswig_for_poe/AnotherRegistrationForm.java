/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jswig_for_poe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class AnotherRegistrationForm extends JFrame implements ActionListener {

    //All componants that will be used for the registration form
    final private Container container1;
    final private JLabel title, name, sname, gender, dob, add, res, uName, pass;
    final private JTextField tName, tSname, userText;
    final private JRadioButton male, female;
    final private ButtonGroup gengp;
    final private JComboBox date, month, year;
    final private JTextArea tadd;
    final private JCheckBox term;
    final private JPasswordField password;
    final private JButton sub;
    final private JButton reset;

    //Theses Strings are for pre-inputed value
    final private ArrayList<String> dates;
    final private ArrayList<String> years;
    final private ArrayList<String> months;

    // constructor, to initialize the components
    // with default values.
    public AnotherRegistrationForm() //This is a jframe on how big the form will be
    {
        dates = new ArrayList<>();
        for (int i = 1; i <= 31; i++) {
            dates.add("" + i);
        }

        months = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            months.add("" + i);
        }

        years = new ArrayList<>();
        for (int jasda = 1995; jasda <= 2019; jasda++) {
            years.add("" + jasda);
        }
        setTitle("Registration Form");
        setBounds(300, 90, 705, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        container1 = getContentPane();
        container1.setLayout(null);

        // Title
        title = new JLabel("Registration Form");
        title.setFont(new Font("Arial", Font.PLAIN , 30));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setBounds(100, 30, 505, 50);
        container1.add(title);

        // Name
        name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setBounds(100, 100, 100, 20);
        container1.add(name);

        tName = new JTextField();
        tName.setFont(new Font("Arial", Font.PLAIN, 20));
        tName.setBounds(325, 100, 280, 30);
        container1.add(tName);

        // Surname
        sname = new JLabel("Surname");
        sname.setFont(new Font("Arial", Font.PLAIN, 20));
        sname.setBounds(100, 150, 100, 20);
        container1.add(sname);

        tSname = new JTextField();
        tSname.setFont(new Font("Arial", Font.PLAIN, 20));
        tSname.setBounds(325, 150, 280, 30);
        container1.add(tSname);

        // Password label
        pass = new JLabel("Password");
        pass.setFont(new Font("Arial", Font.PLAIN, 20));
        pass.setBounds(100, 200, 100, 20);
        container1.add(pass);

        //password field
        password = new JPasswordField();
        password.setFont(new Font("Arial", Font.PLAIN, 15));
        password.setBounds(325, 200, 280, 30);
        container1.add(password);

        // Username label
        uName = new JLabel("Enter your username");
        uName.setFont(new Font("Arial", Font.PLAIN, 20));
        uName.setBounds(100, 250, 200, 20);
        container1.add(uName);

        //username text field
        userText = new JTextField();
        userText.setFont(new Font("Arial", Font.PLAIN, 15));
        userText.setBounds(325, 250, 280, 30);
        container1.add(userText);

        // Gender
        gender = new JLabel("Gender");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setBounds(100, 300, 100, 20);
        container1.add(gender);

        //labels for gender 
        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setBounds(325, 300, 80, 30);
        container1.add(male);

        //A radio button for pre-made options
        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setBounds(400, 300, 100, 30);
        container1.add(female);

        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);

        // Date of Birth
        dob = new JLabel("DOB");
        dob.setFont(new Font("Arial", Font.PLAIN, 20));
        dob.setBounds(100, 350, 100, 20);
        container1.add(dob);

        //combo box for day
        date = new JComboBox(dates.toArray());
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setBounds(325, 350, 80, 30);
        container1.add(date);

        //combo box for month
        month = new JComboBox(months.toArray());
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setBounds(405, 350, 100, 30);
        container1.add(month);

        //combo box for the years
        year = new JComboBox(years.toArray());
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setBounds(505, 350, 100, 30);
        container1.add(year);

        // Address label
        add = new JLabel("Address");
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setBounds(100, 400, 100, 20);
        container1.add(add);

        //text box for the your address
        tadd = new JTextArea();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setBounds(100, 450, 505, 100);
        tadd.setLineWrap(true);
        container1.add(tadd);

        // Terms and Conditions
        term = new JCheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setBounds(100, 570, 250, 20);
        container1.add(term);

        // Buttons for the submit
        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setBounds(100, 600, 100, 30);
        sub.addActionListener(this);
        container1.add(sub);

        //button for the reset button
        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setBounds(505, 600, 100, 30);
        reset.addActionListener(this);
        container1.add(reset);

        res = createJLabel("", 20, 100, 500, 500, 25);
        container1.add(res);

        setVisible(true);
    }

    //this function is to give font family to all the box Jlabels
    private JLabel createJLabel(String text, int font_size, int x, int y, int w, int h) {
        JLabel tmp = new JLabel(text);
        tmp.setFont(new Font("Arial", Font.BOLD, font_size));
        tmp.setSize(w, h);
        tmp.setLocation(x, y);

        return tmp;
    }

    //function to check if the conditions of the username is met
    public static boolean checkUserName(String username) {
        if (username.length() > 5) {
            return false;
        }
        return username.contains("_");
    }
    
    public void verifyUserName(String username){
        if(!checkUserName(username)){
            res.setText("Username needs to contain an '_' or be shorter.");
        }
    }

    public void verifyPasswordComplexity(String pass){
        if(!checkPasswordComplexity(pass)){
            res.setText("Password needs to be at least 8 chars long, contain a capital letter, number and a special character.");
        }
    }
    
    //fuction to check the password conditions are met
    public static boolean checkPasswordComplexity(String pass) {
        // Is password longer than 8
        if (pass.length() < 8) {
            return false;
        }

        // Does password contain at least one capital letter
        boolean test = false;
        for (int i = 0; i < pass.length(); i++) {
            if (pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z') {
                test = true;
                break;
            }
        }
        //this runs the if statment called test
        if (!test) {
            return false;
        }

        // Does password contain at least one special character
        test = false;
        for (int i = 0; i < pass.length(); i++) {
            if (!(pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z') && !(pass.charAt(i) >= 'a' && pass.charAt(i) <= 'z')) {
                test = true;
                break;
            }
        }
        //this runs the if statment of special characters 
        if (!test) {
            return false;
        }

        // Does password contain at least one nubmer
        test = false;
        for (int i = 0; i < pass.length(); i++) {
            if (pass.charAt(i) >= '0' && pass.charAt(i) <= '9') {
                test = true;
                break;
            }
        }
        //this runs a the function that requires the password to have a number
        return test;
    }

//Action performed for buttons when clicked they will do something
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sub) {
            String passw = password.getText();
            String username = userText.getText();

            //username check function
            if (!checkUserName(username)) {
                return;
            }

            //call check function
            if (!checkPasswordComplexity(passw)) {
                return;
            }

            //functions for date and gender  
            if (term.isSelected()) {
                String data = String.format("Name: %s\nSurname: %s\n", tName.getText(), tSname.getText());
                String data1 = String.format("Gender: %s\n", ((male.isSelected()) ? "Male" : "Female"));
                String data2 = String.format("DOB: %s/%s/%s\n", (String) date.getSelectedItem(), (String) month.getSelectedItem(), (String) year.getSelectedItem());

                String data3 = "Address : " + tadd.getText();

                System.out.println(data + data1 + data2 + data3);

                res.setText("Registration Successfully..");

                CredentialStorage.username = username;
                CredentialStorage.password = passw;

                System.out.println("Username: \"" + CredentialStorage.username + "\"");
                System.out.println("Password: \"" + CredentialStorage.password + "\"");

                // Spawn the new login page.
                SwingUtilities.invokeLater(() -> {
                    new LoginForm();
                });

                // Hide the window.
                this.dispose();
            } else {
                res.setText("Please accept the terms & conditions..");
            }
        } else if (e.getSource() == reset) {
            String def = "";
            tName.setText(def);
            tadd.setText(def);
            tSname.setText(def);
            res.setText(def);
            term.setSelected(false);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
        }//end of if
    }//end of action performed class

    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(() -> {
            new AnotherRegistrationForm();
        });
    }//end of main
}//end of jframe class
