package starter.test;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import starter.steps.Language;
import starter.steps.TestLoginPage;

@RunWith(SerenityRunner.class)
public class ChangeLanguage extends TestBase{

    private static String newLanguage = "English";
    private static String language = "Русский";

    @Steps
    TestLoginPage loginSteps;
    @Steps
    Language languageSteps;

    @Before
    public void login() {
        loginSteps.doLogin();
    }

    @Test
    public void changeLanguage() {
        languageSteps.changeLanguage(newLanguage);
        languageSteps.check(newLanguage);
    }

    @After
    public void returnLanguage() {
        languageSteps.changeLanguage(language);
    }
}
