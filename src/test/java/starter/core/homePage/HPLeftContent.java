package starter.core.homePage;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import starter.BasePage;
import starter.core.groupPage.GroupPage;

public class HPLeftContent extends BasePage {

    private static final By navigationBarLocator = By.xpath(".//*[contains(@data-l,'t,navigation')]/div[contains(@class, 'nav-side')]/*");

    @Override
    protected void check() {
        clickableAll(navigationBarLocator);
    }

    public GroupPage clickGroups() {
        new LeftContentBarItemsWrapper(LeftContentBarItemsWrapper.Items.Groups)
                .click();
        return new GroupPage();
    }

    public LeftContentBarItemsWrapper getWrappedItem(LeftContentBarItemsWrapper.Items item) {
        return new LeftContentBarItemsWrapper(item);
    }

}

