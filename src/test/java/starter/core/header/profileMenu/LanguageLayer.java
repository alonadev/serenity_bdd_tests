package starter.core.header.profileMenu;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import starter.BasePage;

public class LanguageLayer extends BasePage {

    private static final By languageListLocator = By.xpath(".//*[@class='sel-lang_list']/*");
    private static final By currentLanguageLocator = By.xpath(".//*[contains(@class,'sel-lang_i lstp-t')]");

    @Override
    protected void check() {
        visible(languageListLocator);
        visible(currentLanguageLocator);
    }

    public void changeLanguage(String language) {
        getElements(languageListLocator).stream()
                .filter(webElement -> webElement.getText().equals(language))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Язык " + language + " не найден"))
                .click();
    }

    public String getCurrentLanguage() {
        return getText(currentLanguageLocator);
    }
}
