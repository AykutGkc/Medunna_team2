package stepDefinitions;

import io.cucumber.java.en.And;
import pages.AdminPage;

public class US16 {
    AdminPage adminPage = new AdminPage();
    @And("Items&Titles sekmesine tikla")
    public void itemsTitlesSekmesineTikla() {
        adminPage.itemTitles.click();
    }
}
