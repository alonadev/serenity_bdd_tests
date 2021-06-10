package starter.core.homePage;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.BasePage;
import starter.core.header.Header;
import starter.core.homePage.main.MainContent;
import starter.core.homePage.notes.NoteContainer;

public class HomePage extends BasePage {

    private final HPLeftContent leftContent;
    private final Header header;
    private final NoteContainer noteContainer;
    private final MainContent mainContent;

    public HomePage() {
        leftContent = new HPLeftContent();
        header = new Header();
        noteContainer = new NoteContainer();
        mainContent = new MainContent();
    }

    @Override
    protected void check() {
    }

    public Header getHeader() {
        return header;
    }

    public HPLeftContent getLeftColumnContent() {
        return leftContent;
    }

    public NoteContainer getNoteContainer() {return noteContainer;}

    public MainContent getMainContent() {return mainContent;}
}
