package starter.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import starter.core.homePage.HPLeftContent;
import starter.core.homePage.LeftContentBarItemsWrapper;
import starter.core.loginPage.LoginPage;
import starter.model.TestBot;
import static com.codeborne.selenide.Selenide.*;

public class TestLoginPage {

    LoginPage testLoginPage;
    private TestBot bot = new TestBot("technopolisBot72", "technopolis16");

    @Step("Вход в профиль")
    public void doLogin() {
        open("https://ok.ru");
        testLoginPage = new LoginPage();
        testLoginPage.doLogin(bot);
    }

    @Step("Проверка")
    public void check(String name)  {
        String actualName = new HPLeftContent().getWrappedItem(LeftContentBarItemsWrapper.Items.UserInfo)
                .getText();
        Assert.assertEquals(name, actualName);
    }
}


