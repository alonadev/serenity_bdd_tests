package starter.core.groupPage;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import starter.BasePage;

import java.util.List;
import java.util.stream.Collectors;

public class GroupPage extends BasePage {

    private static final By searchField = By.id("query_userAltGroupSearch");
    private static final By listOfGroups = By.xpath(".//*[@class='ucard-v __s __h __rounded group-big-card']");

    public GroupPage() {
        super();
    }

    @Override
    protected void check() {
        clickable(searchField);
    }

    public GroupCardList search(final String groupName) {
        setValue(searchField, groupName + Keys.ENTER);
        final List<GroupCard> collect = getElements(listOfGroups).stream().map(GroupCard::new).collect(Collectors.toList());
        return new GroupCardList(collect);

    }


}
