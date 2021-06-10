package starter.core.settingsPage.general;

import org.openqa.selenium.By;
import starter.BasePage;

public class PersonalInformationLayer extends BasePage {

    private static final By nameLocator = By.xpath(".//*[contains(@name,'fr.name')]");
    private static final By surnameLocator = By.xpath(".//*[contains(@name,'fr.surname')]");
    private static final By saveLocator = By.xpath(".//*[@data-l='t,confirm']");

    @Override
    protected void check() {

    }

    public PersonalInformationLayer changeName(String name) {
        clear(nameLocator);
        setValue(nameLocator, name);
        return this;
    }

    public PersonalInformationLayer changeSurname(String surname) {
        clear(surnameLocator);
        setValue(surnameLocator, surname);
        return this;
    }

    public GeneralContent save() {
        click(saveLocator);
        return new GeneralContent();
    }
}
