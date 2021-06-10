package starter.test;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;

import org.junit.After;
import org.junit.Before;
import starter.core.homePage.HomePage;

public class TestBase {
    private static final String baseUrl = "https://ok.ru";

    @Before
    public void init() {
        closeWebDriver();
        Configuration.baseUrl = baseUrl;
        open("/");
    }

    protected HomePage goToHomePage() {
        open("/");
        return new HomePage();
    }

    protected void goToUrl(String url) {
        open(url);
    }

    @After
    public void stop() {

    }
}
