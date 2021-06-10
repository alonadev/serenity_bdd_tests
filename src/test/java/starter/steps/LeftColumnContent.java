package starter.steps;

import net.thucydides.core.annotations.Step;
import starter.core.homePage.HPLeftContent;

public class LeftColumnContent {

    HPLeftContent leftColumnContent;

    @Step("Перейти к группам")
    public void goToGroups() {
        leftColumnContent = new HPLeftContent();
        leftColumnContent.clickGroups();
    }
}
