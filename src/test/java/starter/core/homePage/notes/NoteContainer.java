package starter.core.homePage.notes;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import starter.BasePage;

public class NoteContainer extends BasePage {

    private static final By createNoteLocator = By.xpath(".//*[text()='Напишите заметку']");

    @Override
    protected void check() {

    }

    @Step("Переход к окну заметок")
    public NoteLayer getNoteLayer() {
        click(createNoteLocator);
        return new NoteLayer();
    }
}
