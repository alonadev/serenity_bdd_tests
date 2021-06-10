package starter.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import starter.core.homePage.HomePage;

import static com.codeborne.selenide.Selenide.open;

public class Language {

    @Step("Смена языка")
    public void changeLanguage(String language)  {
        new HomePage()
                .getHeader()
                .getProfileMenu()
                .getLanguageLayer()
                .changeLanguage(language);
    }

    @Step("Проверка")
    public void check(String language)  {
        String currentLanguage = new HomePage()
                .getHeader()
                .getProfileMenu()
                .getLanguageLayer()
                .getCurrentLanguage();
        Assert.assertEquals(language, currentLanguage);
        open("https://ok.ru/feed");
    }
}
