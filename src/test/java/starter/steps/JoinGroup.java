package starter.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import starter.core.groupPage.GroupCard;
import starter.core.groupPage.GroupPage;

public class JoinGroup {

    String title;

    @Step("Вступление в группу")
    public void join(String groupName)  {
        title = new GroupPage().search(groupName).getCardByTitle(groupName).join();
    }

    @Step("Проверка")
    public void check(String joinStatus)  {
        Assert.assertEquals(joinStatus, title);
    }
}
