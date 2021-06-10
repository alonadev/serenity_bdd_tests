package starter.core.groupPage;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import starter.BasePage;


public class GroupProfilePage extends BasePage {

    private static final By participantBtnLocator = By.xpath(".//span[text()='В группе']");
    private static final By leaveGroupBtnLocator = By.xpath(".//div[text()='Выйти из группы']");

    public GroupProfilePage() {

    }

    @Override
    protected void check() {
        clickable(participantBtnLocator);
    }

    public void leaveGroup() {
        click(participantBtnLocator);
        click(leaveGroupBtnLocator);
    }
}
