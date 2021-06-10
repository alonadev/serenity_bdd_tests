package starter.core.settingsPage.general;

import org.openqa.selenium.By;
import starter.BasePage;

public class GeneralContent extends BasePage {

    private static final By personalInformationLocator = By.xpath(".//*[contains(@hrefattrs,'EditProfile')]");

    @Override
    protected void check() {

    }

    public PersonalInformationLayer getPersonalInformationLayer() {
        click(personalInformationLocator);
        return new PersonalInformationLayer();
    }
}
