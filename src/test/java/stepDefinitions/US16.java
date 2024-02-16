package stepDefinitions;

import io.cucumber.java.en.And;
import pages.AdminPage;
import utilities.ConfigReader;

public class US16 {
    AdminPage adminPage = new AdminPage();
    @And("Items&Titles sekmesine tikla")
    public void itemsTitlesSekmesineTikla() {
        adminPage.itemTitles.click();
    }

    @And("Room secenegine tikla")
    public void roomSecenegineTikla() {
        adminPage.room.click();

    }

    @And("Create a new Room butonuna tikla")
    public void createANewRoomButonunaTikla() {
        adminPage.createNewRoom.click();
    }

    @And("Room number kutusuna {string} gir")
    public void roomNumberKutusunaGir(String arg0) {
        adminPage.roomNumberBox.sendKeys(ConfigReader.getProperty(arg0));
    }

    @And("Price kutusuna {string} gir")
    public void priceKutusunaGir(String arg0) {
        adminPage.roomPriceBox.sendKeys(ConfigReader.getProperty(arg0));
    }

    @And("Description kutusuna {string} gir")
    public void descriptionKutusunaGir(String arg0) {
        adminPage.roomDescriptionBox.sendKeys(ConfigReader.getProperty(arg0));
    }
}
