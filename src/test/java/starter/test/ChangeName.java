package starter.test;

import net.serenitybdd.junit.runners.SerenityRunner;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import starter.core.homePage.HomePage;
import starter.core.homePage.LeftContentBarItemsWrapper;
import starter.core.loginPage.LoginPage;
import starter.model.TestBot;

@RunWith(SerenityRunner.class)
public class ChangeName extends TestBase{

    private static HomePage homePage;
    private static TestBot bot = new TestBot("technopolisBot72", "technopolis16");
    private static String newName = RandomStringUtils.randomAlphabetic(7);
    private static String newSurname = RandomStringUtils.randomAlphabetic(10);
    private static String name = "technopolisbot7";
    private static String surname = "technopolisbot7";
    private static String url = "https://ok.ru/feed";


    @Before
    public void login() {
        homePage = new LoginPage().doLogin(bot);
    }

    @Test
    public void changeName() {
        homePage
                .getHeader()
                .getProfileMenu()
                .getSettingsPage()
                .getGeneralContent()
                .getPersonalInformationLayer()
                .changeName(newName)
                .changeSurname(newSurname)
                .save();
        goToUrl(url);
        String currentName = homePage
                .getLeftColumnContent()
                .getWrappedItem(LeftContentBarItemsWrapper.Items.UserInfo)
                .getText();
        Assert.assertEquals(newName + " " + newSurname, currentName);
    }

    @After
    public void returnName() {
        homePage
                .getHeader()
                .getProfileMenu()
                .getSettingsPage()
                .getGeneralContent()
                .getPersonalInformationLayer()
                .changeName(name)
                .changeSurname(surname)
                .save();
    }
}