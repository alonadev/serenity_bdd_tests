package starter.core.loginPage;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import starter.BasePage;
import starter.core.homePage.HomePage;
import starter.model.TestBot;


public class LoginPage extends BasePage {

    private static final By loginField = By.name("st.email");
    private static final By passwordField = By.name("st.password");
    private static final By signInButton = By.xpath(".//*[@data-l='t,sign_in']");

    public LoginPage() {
        super();
    }

    @Override
    protected void check() {
        clickable(loginField);
        clickable(passwordField);
        clickable(signInButton);
    }

    public HomePage doLogin(final TestBot bot) {
        setValue(loginField, bot.getLogin());
        setValue(passwordField, bot.getPassword());
        click(signInButton);
        return new HomePage();
    }
}
