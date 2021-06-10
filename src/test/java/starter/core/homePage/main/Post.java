package starter.core.homePage.main;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import starter.BasePage;

import static com.codeborne.selenide.Selenide.open;

public class Post extends BasePage {

    private static final By textLocator = By.xpath("//*[@class='media-text_cnt_tx emoji-tx textWrap']");
    private static final By arrowLocator = By.xpath(".//*[@data-l='t,feed-actions-menu']");
    private static final By deletePostLocator = By.xpath("//*[@id='hook_Block_ShortcutMenu']/div/ul/li[2]");
    private static final By acceptDeletePostLocator = By.xpath(".//*[text()='Удалить заметку']");
    private static final String url = "https://ok.ru/profile/591210761488";

    public Post(WebElement webElement) {
        super(webElement);
    }

    @Override
    protected void check() {
        visible(textLocator);
    }

    public String getText() {
        return getText(textLocator);
    }

    public void deletePost() {
        open(url);
        click(arrowLocator);
        clickable(deletePostLocator);
        click(deletePostLocator);
        clickable(acceptDeletePostLocator);
        click(acceptDeletePostLocator);
    }
}
