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
    final private JLabel title, name, sname, gender, dob, add, res, uName;
    final private JTextField tName, tSname;
    final private JRadioButton male, female;
    final private ButtonGroup gengp;
    final private JComboBox date, month, year;
    final private JTextArea tadd;
    final private JCheckBox term;
    final private JPasswordField password;
    final private JButton sub;
    final private JButton reset;
    final private JTextArea tout, resadd;

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
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        container1 = getContentPane();
        container1.setLayout(null);

        title = new JLabel("Registration Form");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        container1.add(title);

        name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        container1.add(name);

        password = new JPasswordField();
        password.setFont(new Font("Arial", Font.PLAIN, 15));
        password.setSize(190, 20);
        password.setLocation(200, 450);
        container1.add(password);

        uName = new JLabel("Enter your registration");
        uName.setFont(new Font("Arial", Font.PLAIN, 20));
        uName.setSize(100, 20);
        uName.setLocation(100, 100);
        container1.add(uName);

        //Reistration text field
        tName = new JTextField();
        tName.setFont(new Font("Arial", Font.PLAIN, 15));
        tName.setSize(190, 20);
        tName.setLocation(200, 100);
        container1.add(tName);

        //mobile number
        sname = new JLabel("Mobile");
        sname.setFont(new Font("Arial", Font.PLAIN, 20));
        sname.setSize(100, 20);
        sname.setLocation(100, 150);
        container1.add(sname);

        //text field for mobile number
        tSname = new JTextField();
        tSname.setFont(new Font("Arial", Font.PLAIN, 15));
        tSname.setSize(150, 20);
        tSname.setLocation(200, 150);
        container1.add(tSname);

        //gender field
        gender = new JLabel("Gender");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(100, 200);
        container1.add(gender);

        //labels for gender 
        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(200, 200);
        container1.add(male);

        //A radio button for pre-made options
        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(275, 200);
        container1.add(female);

        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);

        //Label for date of birth
        dob = new JLabel("DOB");
        dob.setFont(new Font("Arial", Font.PLAIN, 20));
        dob.setSize(100, 20);
        dob.setLocation(100, 250);
        container1.add(dob);

        //combobox for the date of bith
        date = new JComboBox(dates.toArray());
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(100, 20);
        date.setLocation(200, 250);
        container1.add(date);

        month = new JComboBox(months.toArray());
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(100, 20);
        month.setLocation(300, 250);
        container1.add(month);

        year = new JComboBox(years.toArray());
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(100, 20);
        year.setLocation(400, 250);
        container1.add(year);

        //a label to enter you address
        add = new JLabel("Address");
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setSize(100, 20);
        add.setLocation(100, 300);
        container1.add(add);

        tadd = new JTextArea();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(200, 75);
        tadd.setLocation(200, 300);
        tadd.setLineWrap(true);
        container1.add(tadd);

        //a check box for th eterms and conditions 
        term = new JCheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(150, 400);
        container1.add(term);

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 450);
        sub.addActionListener(this);
        container1.add(sub);

        //a button to clear all the text in each text box
        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 450);
        reset.addActionListener(this);
        container1.add(reset);

        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        container1.add(tout);

        res = createJLabel("", 20, 100, 500, 500, 25);
        container1.add(res);

        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        resadd.setLineWrap(true);
        container1.add(resadd);

        setVisible(true);
    }

    private JLabel createJLabel(String text, int font_size, int x, int y, int w, int h) {
        JLabel tmp = new JLabel(text);
        tmp.setFont(new Font("Arial", Font.BOLD, font_size));
        tmp.setSize(w, h);
        tmp.setLocation(x, y);

        return tmp;
    }

    private boolean check_password(String pass) {
        // Is password longer than 8
        if (pass.length() < 8) {
            res.setText("Password needs to be longer.");
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
        if (!test) {
            res.setText("Password needs to contain a capital.");
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
        if (!test) {
            res.setText("Password needs to contain a special character.");
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
        if (!test) {
            res.setText("Password needs to contain a number.");
            return false;
        }
        return true;
    }

//Action performed for buttons when clicked they will do something
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sub) {
            String pass = password.getText();

            if (!check_password(pass)) {
                return;
            }

            if (term.isSelected()) {
                String data = String.format("Name: %s\nSurname: %s\n", tName.getText(), tSname.getText());
                String data1 = String.format("Gender: %s\n", ((male.isSelected()) ? "Male" : "Female"));
                String data2 = String.format("DOB: %s/%s/%s\n", (String) date.getSelectedItem(), (String) month.getSelectedItem(), (String) year.getSelectedItem());

                String data3 = "Address : " + tadd.getText();
                tout.setText(data + data1 + data2 + data3);
                tout.setEditable(false);

                System.out.println(data + data1 + data2 + data3);

                res.setText("Registration Successfully..");

                CredentialStorage.username = tName.getText();
                CredentialStorage.password = pass;

                // Spawn the new login page.
                SwingUtilities.invokeLater(() -> {
                    new LoginForm();
                });

                // Hide the window.
                this.dispose();
            } else {
                tout.setText("");
                resadd.setText("");
                res.setText("Please accept the terms & conditions..");
            }
        } else if (e.getSource() == reset) {
            String def = "";
            tName.setText(def);
            tadd.setText(def);
            tSname.setText(def);
            res.setText(def);
            tout.setText(def);
            term.setSelected(false);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            resadd.setText(def);
        }//end of if
    }//end of action performed class

    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(() -> {
            new AnotherRegistrationForm();
        });
    }//end of main
}//end of jframe class
