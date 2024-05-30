/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package jswig_for_poe;

import java.awt.event.ActionEvent;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Reyaan
 */
public class LoginFormTest {

    public LoginFormTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of actionPerformed method, of class LoginForm.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        LoginForm instance = new LoginForm();
        instance.actionPerformed(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class LoginForm.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        LoginForm.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void checkUsernameFormatSuccess() {
        //registerUser register = new registerUser();
        //result = loginUser.
    }

    @Test
    public void checkUsernameFormatFail() {

    }

    @Test
    public void checkPasswordFormatSuccess() {

    }

    @Test
    public void checkPasswordFormatFail() {

    }

}//end of test username class
