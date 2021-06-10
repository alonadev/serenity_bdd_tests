package starter.test;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import starter.steps.TestLoginPage;

@RunWith(SerenityRunner.class)
public class Login extends TestBase {

    private String name = "technopolisbot7 technopolisbot7";

    @Steps
    TestLoginPage loginSteps;

    @Test
    public void login() {
        loginSteps.doLogin();
        loginSteps.check(name);
    }
}
