package starter.core.homePage.notes;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import starter.BasePage;

public class NoteLayer extends BasePage {

    private static final By enterTextLocator = By.xpath(".//div[contains(@class,'posting_itx emoji-tx h-mod js-ok-e js-posting-itx ok-posting-handler')]");
    private static final By postLocator = By.xpath(".//*[contains(@data-l,'button.submit')]");

    @Override
    protected void check() {
        clickable(enterTextLocator);
        visible(postLocator);
    }

    @Step("Добавление текста к посту")
    public NoteLayer enterText(String text) {
        setValue(enterTextLocator, text);
        return this;
    }

    @Step("Опубликование поста")
    public void post() {
        click(postLocator);
    }
}
