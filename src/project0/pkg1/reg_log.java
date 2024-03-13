
package project0.pkg1;

import java.util.Scanner;

public class reg_log {

    public static void main(String[]args){
    
            Scanner read = new Scanner(System.in);
            System.out.println("-Registration Form-");
            System.out.println("*fill out what is ask.......");
            System.out.println("");

            //User enters there name
            System.out.println("Enter your name: ");
            String username = read.nextLine();

            //User enters there Address
            System.out.println("Enter your Address: ");
            String address = read.nextLine();

            //Users enter there Phone number
            System.out.println("Enter your Phone Number: ");
            String pn = read.nextLine();

            //User puts in there email address
            System.out.println("Enter your Email: ");
            String email = read.nextLine();

            //User puts in there Password
            System.out.println("Enter your Password: ");
            String pass = read.nextLine();
            
            System.out.println("registration was Successful!");
            System.out.println("");
            
            System.out.println("<-Try To Login now!->");
            System.out.println("");
            
            boolean status = false;
            
            do{//this do is a while lopp and will focus on if password and email is correct
                
                System.out.println(" ***Login FORM***");
                
                //checking if email is correct
                System.out.println( "Enter Your Username");
                String correct_Username = read.nextLine();
                
                //checking if Password is correct
                 System.out.println( "Enter Your Password");
                String correct_Password = read.nextLine();
                
                //this is for the use od underscores and characters for usernames
                String regex_username = "^[^_]{1,5}$";
                 String regex_password = "^[^_]{1,8}$";
                
                    if(correct_Username.equals(username) && correct_Password.equals(pass))
                   {
                        System.out.println("Welcome your email and password is Correct!");
                        status = true;
                        
                    }else{//if either the password was incorrect
                            System.out.println("error your Username or password is Incorrect!");
                            System.out.println("Try again!");
                            
                        
                    }//end of else 
                 if (correct_Username.matches(regex_username)){
                 }else{
                 System.out.println("invalid username!!");
                 }
                 
                 if (correct_Username.matches(regex_password)){
                 }else{
                 System.out.println("invalid username!!");
                 }
                        }//the end of do
                        while(status==false);
            
            
            
    }//end of main 
    
}//end of class
