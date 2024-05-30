/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package jswig_for_poe;

import java.awt.event.ActionEvent;
import org.junit.Test;

/**
 *
 * @author Reyaan
 */
public class AnotherRegistrationFormTest {

    public AnotherRegistrationFormTest() {
    }

    @Test
    public void checkUsernameFormat() {
        AnotherRegistrationForm form = new AnotherRegistrationForm();
        boolean correct = form.checkUserName("user");
        assert (!correct);

        correct = form.checkUserName("Kyle!!!!!!");
        assert (!correct);

        correct = form.checkUserName("kyl_1");
        assert (correct);

        correct = form.checkUserName("_us");
        assert (correct);
    }

    @Test
    public void checkPasswordFormat() {
        AnotherRegistrationForm form = new AnotherRegistrationForm();
        boolean correct = form.checkPasswordComplexity("asd");
        assert (!correct);

        correct = form.checkPasswordComplexity("asdfddfg");
        assert (!correct);

        correct = form.checkPasswordComplexity("CH&&sec@ke99!");
        assert (correct);

        correct = form.checkPasswordComplexity("password");
        assert (!correct);

        correct = form.checkPasswordComplexity("123128sdjh3kh_ASD");
        assert (correct);
    }
}
