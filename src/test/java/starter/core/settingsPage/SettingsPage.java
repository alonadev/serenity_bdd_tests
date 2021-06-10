package starter.core.settingsPage;

import starter.BasePage;
import starter.core.settingsPage.general.GeneralContent;

public class SettingsPage extends BasePage {

    @Override
    protected void check() {

    }

    public GeneralContent getGeneralContent() {
        return new GeneralContent();
    }
}
