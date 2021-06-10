package starter.steps;

import net.thucydides.core.annotations.Step;
import starter.core.groupPage.GroupProfilePage;
import static com.codeborne.selenide.Selenide.*;

public class LeaveGroup {

    private String groupUrl = "https://ok.ru/technopolis";

    GroupProfilePage groupProfilePage;

    @Step("Выход  из группы")
    public void leaveGroup() {
        open(groupUrl);
        new GroupProfilePage().leaveGroup();
    }

}
