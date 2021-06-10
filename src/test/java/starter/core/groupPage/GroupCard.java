package starter.core.groupPage;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import starter.BasePage;


public class GroupCard extends BasePage {

    private final WebElement webElement;
    private static final By joinButton = By.xpath(".//*[@data-l='t,join']");
    private static final By joinStatus = By.xpath(".//*[contains(@class, 'join-group-result')]");
    private static final By title = By.xpath(".//*[@data-l='t,visit' and @class='o']");

    public GroupCard(WebElement webElement) {
        super(webElement);
        this.webElement = webElement;
    }

    @Override
    protected void check() {
        clickable(joinButton);
    }

    public String getTitle() {
        return getText(title);
    }

    public String getHref() {
        return getAttribute(title, "href");
    }

    public String join() {
        click(joinButton);
        return getText(joinStatus);
    }
}
