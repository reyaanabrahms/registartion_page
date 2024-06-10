/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package jswig_for_poe;

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
        boolean correct = AnotherRegistrationForm.checkUserName("user");
        assert (!correct);

        correct = AnotherRegistrationForm.checkUserName("Kyle!!!!!!");
        assert (!correct);

        correct = AnotherRegistrationForm.checkUserName("kyl_1");
        assert (correct);

        correct = AnotherRegistrationForm.checkUserName("_us");
        assert (correct);
    }

    @Test
    public void checkPasswordFormat() {
        boolean correct = AnotherRegistrationForm.checkPasswordComplexity("asd");
        assert (!correct);

        correct = AnotherRegistrationForm.checkPasswordComplexity("asdfddfg");
        assert (!correct);

        correct = AnotherRegistrationForm.checkPasswordComplexity("CH&&sec@ke99!");
        assert (correct);

        correct = AnotherRegistrationForm.checkPasswordComplexity("password");
        assert (!correct);

        correct = AnotherRegistrationForm.checkPasswordComplexity("123128sdjh3kh_ASD");
        assert (correct);
    }
}
