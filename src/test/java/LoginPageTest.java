import org.example.LoginPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPageTest {

    @Test
    public void passwordWithAtLeastEightCharactersIsValid() {
        LoginPage test = new LoginPage("standard_user", "secret123");
        boolean passwordValid = test.isPasswordValid();
        assertTrue(passwordValid, "Пароль длиннее 8 символов должен быть валидным");
    }

    @Test
    public void passwordShorterThanEightCharactersIsInvalid() {
        LoginPage test = new LoginPage("standard_user", "abc");
        boolean passwordValid = test.isPasswordValid();
        assertFalse(passwordValid, "Пароль короче 8 символов должен быть невалидным");
    }

    @Test
    public void nullPasswordIsInvalid() {
        LoginPage test = new LoginPage("standard_user", null);
        assertFalse(test.isPasswordValid());
    }

    @Test
    public void passwordWithExactlyEightCharactersIsValid() {
        LoginPage test = new LoginPage("user", "12345678");
        boolean passwordValid = test.isPasswordValid();
        assertTrue(passwordValid, "Пароль длинною в 8 символов должен быть валидным");
    }

    @Test
    public void passwordWithSevenCharactersIsInvalid() {
        LoginPage test = new LoginPage("user", "1234567");
        boolean passwordValid = test.isPasswordValid();
        assertFalse(passwordValid, "Пароль длинною в 7 символов должен быть невалидным");
    }
}
