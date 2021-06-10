package starter.test;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import starter.steps.JoinGroup;
import starter.steps.LeaveGroup;
import starter.steps.LeftColumnContent;
import starter.steps.TestLoginPage;

@RunWith(SerenityRunner.class)
public class JoinToGroup extends TestBase {

    private String groupName = "Технополис OK (Mail.ru) и Политеха";
    private String joinStatus = "Вы в группе!";

    @Steps
    TestLoginPage loginSteps;
    @Steps
    LeaveGroup leaveStep;
    @Steps
    LeftColumnContent leftColumnStep;
    @Steps
    JoinGroup joinSteps;

    @Before
    public void login() {
        loginSteps.doLogin();
    }

    @Test
    public void joinToGroup() {
        leftColumnStep.goToGroups();
        joinSteps.join(groupName);
        joinSteps.check(joinStatus);

    }


    @After
    public void quitFromGroup() {
        leaveStep.leaveGroup();
    }
}
