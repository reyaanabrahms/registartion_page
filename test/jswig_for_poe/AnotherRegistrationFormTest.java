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
public class AnotherRegistrationFormTest {
    
    public AnotherRegistrationFormTest() {
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
     * Test of actionPerformed method, of class AnotherRegistrationForm.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        AnotherRegistrationForm instance = new AnotherRegistrationForm();
        instance.actionPerformed(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class AnotherRegistrationForm.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        AnotherRegistrationForm.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void checkUsernameFormat(){
        AnotherRegistrationForm form = new AnotherRegistrationForm();
        boolean correct = form.checkUserName("user");
        assert(!correct);
        
        correct = form.checkUserName("username_");
        assert(!correct);
        
        correct = form.checkUserName("us_er");
        assert(correct);
        
        correct = form.checkUserName("_us");
        assert(correct);
    }
    
    @Test
    public void checkPasswordFormat(){
        AnotherRegistrationForm form = new AnotherRegistrationForm();
        boolean correct = form.checkPasswordComplexity("asd");
        assert(!correct);
        
        correct = form.checkPasswordComplexity("asdfddfg");
        assert(!correct);
        
        correct = form.checkPasswordComplexity("asdasd1232");
        assert(!correct);
        
        correct = form.checkPasswordComplexity("123128sdjh3kh_");
        assert(!correct);
        
        correct = form.checkPasswordComplexity("123128sdjh3kh_ASD");
        assert(correct);
    }
}
