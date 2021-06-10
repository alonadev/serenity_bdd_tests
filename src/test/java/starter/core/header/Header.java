package starter.core.header;


import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import starter.BasePage;
import starter.core.header.profileMenu.ProfileMenu;

public class Header extends BasePage {

    private static final By iconMenuLocator = By.xpath(".//*[contains(@class,'js-toolbar-menu')]");

    public Header() {

    }

    @Override
    protected void check() {
        clickable(iconMenuLocator);
    }

    public ProfileMenu getProfileMenu() {
        click(iconMenuLocator);
        return new ProfileMenu();
    }
}
