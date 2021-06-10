package starter.core.header.profileMenu;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import starter.BasePage;
import starter.core.settingsPage.SettingsPage;

public class ProfileMenu extends BasePage {

    private static final By settingsLocator = By.xpath(".//*[@data-l='t,settings']/div/span");
    private static final By languageLocator = By.xpath(".//*[contains(@hrefattrs,'ChooseNewLanguage')]");

    @Override
    protected void check() {
        clickable(settingsLocator);
        clickable(languageLocator);
    }

    public SettingsPage getSettingsPage() {
        click(settingsLocator);
        return new SettingsPage();
    }

    public LanguageLayer getLanguageLayer() {
        click(languageLocator);
        return new LanguageLayer();
    }
}
