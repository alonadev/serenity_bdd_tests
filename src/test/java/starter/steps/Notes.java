package starter.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import starter.core.homePage.HomePage;
import static com.codeborne.selenide.Selenide.*;

public class Notes {

    private String feedUrl = "https://ok.ru/feed";

    @Step("Создание заметки")
    public void createNote(String note) {
        new HomePage()
                .getNoteContainer()
                .getNoteLayer()
                .enterText(note)
                .post();
        open(feedUrl);
    }

    @Step("Удаление заметки")
    public void deleteNote() {
        new HomePage()
                .getMainContent()
                .getLastPost()
                .deletePost();
    }

    @Step("Проверка")
    public void check(String note)  {
        String actualNote = new HomePage()
                .getMainContent()
                .getLastPost()
                .getText();
        Assert.assertEquals(note, actualNote);
    }
}
