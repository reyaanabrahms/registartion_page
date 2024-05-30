/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jswig_for_poe;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RForm extends JFrame implements ActionListener {

        //All componants that will be used for the registration form
	private Container container1;
	private JLabel title,name,sname,gender,dob,add,res,uName;
	private JTextField tName,tSname,tUname;
	private JRadioButton male,female;
	private ButtonGroup gengp;
	private JComboBox date,month,year;
	private JTextArea tadd;
	private JCheckBox term;
        private JPasswordField password;
	private JButton sub;
	private JButton reset;
	private JTextArea tout,resadd;
        
        //Theses Strings are for pre-inputed value
	private String dates[]
		= { "1", "2", "3", "4", "5",
                    "6", "7", "8", "9", "10",
                    "11", "12", "13", "14", "15",
                    "16", "17", "18", "19", "20",
                    "21", "22", "23", "24", "25",
                    "26", "27", "28", "29", "30",
                    "31" };
	private String months[]
		= { "Jan", "feb", "Mar", "Apr",
                    "May", "Jun", "July", "Aug",
                    "Sup", "Oct", "Nov", "Dec" };
	private String years[]
		= { "1995", "1996", "1997", "1998",
                    "1999", "2000", "2001", "2002",
			"2003", "2004", "2005", "2006",
			"2007", "2008", "2009", "2010",
			"2011", "2012", "2013", "2014",
			"2015", "2016", "2017", "2018",
			"2019" };

	// constructor, to initialize the components
	// with default values.
	public RForm()
                //This is a jframe on how big the form will be
	{
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

		tName = new JPasswordField();
		tName.setFont(new Font("Arial", Font.PLAIN, 15));
		tName.setSize(190, 20);
		tName.setLocation(200, 100);
		container1.add(password);
                
                name = new JLabel("Enter your registration");
                
		name.setFont(new Font("Arial", Font.PLAIN, 20));
		name.setSize(100, 20);
		name.setLocation(100, 100);
		container1.add(password);
                
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
		date = new JComboBox(dates);
		date.setFont(new Font("Arial", Font.PLAIN, 15));
		date.setSize(50, 20);
		date.setLocation(200, 250);
		container1.add(date);

		month = new JComboBox(months);
		month.setFont(new Font("Arial", Font.PLAIN, 15));
		month.setSize(60, 20);
		month.setLocation(250, 250);
		container1.add(month);

		year = new JComboBox(years);
		year.setFont(new Font("Arial", Font.PLAIN, 15));
		year.setSize(60, 20);
		year.setLocation(320, 250);
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

		res = new JLabel("");
		res.setFont(new Font("Arial", Font.PLAIN, 20));
		res.setSize(500, 25);
		res.setLocation(100, 500);
		container1.add(res);

		resadd = new JTextArea();
		resadd.setFont(new Font("Arial", Font.PLAIN, 15));
		resadd.setSize(200, 75);
		resadd.setLocation(580, 175);
		resadd.setLineWrap(true);
		container1.add(resadd);

		setVisible(true);
	}
        
//Action performed for buttons when clicked they will do something
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == sub) {
			if (term.isSelected()) {
				String data1;
				String data
					= "Name : "
					+ tName.getText() + "\n"
					+ "Surname : "
					+ tSname.getText() + "\n";
				if (male.isSelected())
					data1 = "Gender : Male"
							+ "\n";
				else
					data1 = "Gender : Female"
							+ "\n";
				String data2
					= "DOB : "
					+ (String)date.getSelectedItem()
					+ "/" + (String)month.getSelectedItem()
					+ "/" + (String)year.getSelectedItem()
					+ "\n";

				String data3 = "Address : " + tadd.getText();
				tout.setText(data + data1 + data2 + data3);
				tout.setEditable(false);
				res.setText("Registration Successfully..");
			}
			else {
				tout.setText("");
				resadd.setText("");
				res.setText("Please accept the"
							+ " terms & conditions..");
			}
		}

		else if (e.getSource() == reset) {
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
       
}//end of jframe class

class Registration {

	public static void main(String[] args) throws Exception
	{
		RForm f = new RForm();
	}//end of main
}//end of registration class

