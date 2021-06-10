package starter.core.homePage.main;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import starter.BasePage;

import java.util.List;

public class MainContent extends BasePage {

    private static final By feedLocator = By.xpath(".//*[@class='feed-w']");

    @Override
    protected void check() {
    }

    public Post getLastPost() {
        List<WebElement> elements = getElements(feedLocator);
        return new Post(elements.get(0));
    }
}
