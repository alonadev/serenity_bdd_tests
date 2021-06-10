package starter.test;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import starter.steps.Notes;
import starter.steps.TestLoginPage;

@RunWith(SerenityRunner.class)
public class CreateNote extends TestBase{

    private static String note = RandomStringUtils.randomAlphabetic(150);

    @Steps
    TestLoginPage loginSteps;
    @Steps
    Notes noteSteps;

    @Before
    public void login() {
        loginSteps.doLogin();
    }

    @Test
    public void createNote() {
        noteSteps.createNote(note);
        noteSteps.check(note);
    }

    @After
    public void deleteNote() {
        noteSteps.deleteNote();
    }
}
