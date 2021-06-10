package starter;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public abstract class BasePage {

    private static final Condition clickable = Condition.and("can be clicked", Condition.visible, Condition.enabled);
    private static final Duration defaultTimeout = Duration.ofSeconds(10);
    private final WebElement root;

    public BasePage() {
        root = null;
        check();
    }

    public BasePage(WebElement root) {
        this.root = root;
        check();
    }

    protected abstract void check();

    protected void clickable(By locator) {
        clickable(locator, defaultTimeout);
    }

    protected void visible(By locator) {
        visible(locator, defaultTimeout);
    }

    protected void enable(By locator) {
        enable(locator, defaultTimeout);
    }

    protected void clickable(By locator, Duration timeout) {
        find(locator).shouldBe(clickable, timeout);
    }

    protected void visible(By locator, Duration timeout) {
        find(locator).shouldBe(Condition.visible, timeout);
    }

    protected void enable(By locator, Duration timeout) {
        find(locator).shouldBe(Condition.enabled, timeout);
    }

    protected SelenideElement getElement(By locator) {
        return find(locator);
    }

    protected String getText(By locator) {
        return getText(locator, defaultTimeout);
    }

    protected String getText(By locator, Duration timeout) {
        return find(locator).shouldBe(Condition.visible, timeout).getText();
    }

    protected String getAttribute(By locator, String attributeName) {
        return getAttribute(locator, attributeName, defaultTimeout);
    }

    protected String getAttribute(By locator, String attributeName, Duration timeout) {
        return find(locator).getAttribute(attributeName);
    }

    protected void clickableAll(By locator) {

        clickableAll(locator, defaultTimeout);
    }

    protected void clickableAll(By locator, Duration timeout) {
        findAll(locator).shouldBe(
                CollectionCondition.allMatch(
                        "all clickable",
                        webElement -> webElement.isDisplayed() && webElement.isEnabled()
                ),
                timeout);
    }

    protected void setValue(By locator, String value) {
        find(locator).setValue(value);
    }

    protected void clear(By locator) {
        find(locator).clear();
    }

    protected void click(By locator) {
        find(locator).click();
    }

    protected List<WebElement> getElements(By locator) {
        return getElements(locator, defaultTimeout);
    }

    protected List<WebElement> getElements(By locator, Duration timeout) {
        return new ArrayList<>($$(locator).shouldBe(CollectionCondition.allMatch("all enable", webElement -> webElement.isEnabled()), timeout));
    }

    private SelenideElement find(By locator) {
        if (root == null) {
            return $(locator);
        } else {
            WebElement element = root.findElement(locator);
            return $(element);
        }
    }

    private ElementsCollection findAll(By locator) {
        if (root == null) {
            return $$(locator);
        } else {
            return $(root).findAll(locator);
        }
    }
}
