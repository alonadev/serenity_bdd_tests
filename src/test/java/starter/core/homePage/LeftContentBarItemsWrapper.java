package starter.core.homePage;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import starter.BasePage;

public class LeftContentBarItemsWrapper extends BasePage {
    private final Items item;

    public LeftContentBarItemsWrapper(Items item) {
        this.item = item;
    }

    @Override
    protected void check() {
    }

    public String getText() {
        return getText(item.locator);
    }

    public void click() {
        click(item.locator);
    }

    public enum Items {
        UserInfo(By.xpath(".//*[@data-l='t,userPage']")),
        Groups(By.xpath(".//*[@data-l='t,userAltGroup']"));

        private final By locator;

        Items(By locator) {
            this.locator = locator;
        }

        public By getLocator() {
            return locator;
        }
    }
}

