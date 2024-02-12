package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.*;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class US_02 {

    HomePage homepage = new HomePage();
    LoginPage loginpage = new LoginPage();
    AdminPage adminPage = new AdminPage();
    AccountRegisterPage accountPage = new AccountRegisterPage();
    StaffPage staffPage = new StaffPage();

    @Given("kullanıcı_iki_bir, {string} sayfasına gider")
    public void kullanıcı_iki_birSayfasınaGider(String arg0) {
        Driver.getDriver().get(arg0);
        ReusableMethods.bekle(1);
    }

    @And("kulanıcı_iki_bir user ikonuna tikla")
    public void kulanıcı_iki_birUserIkonunaTikla() {
        homepage.userIcon.click();
    }

    @And("kullanıcı_iki_bir Register'i tıklar.")
    public void kullanıcı_iki_birRegisterITıklar() {
        homepage.register.click();
    }

    @And("kullanıcı_iki_bir SSN input'a {string} girer")
    public void kullanıcı_iki_birSSNInputAGirer(String arg0) {
        accountPage.registerSsn.sendKeys(arg0);
    }

    @And("kullanıcı_iki_bir First Name inputa {string} girer")
    public void kullanıcı_iki_birFirstNameInputaGirer(String arg0) {
        accountPage.registerFirstName.sendKeys(arg0);

    }

    @And("kullanıcı_iki_bir Last Name inputa {string} girer")
    public void kullanıcı_iki_birLastNameInputaGirer(String arg0) {
        accountPage.registerLastName.sendKeys(arg0);
    }

    @And("kullancı_iki_bir Usurname inputa {string} girer")
    public void kullancı_iki_birUsurnameInputaGirer(String arg0) {
        accountPage.registerUserName.sendKeys(arg0);
    }

    @And("kullanıcı_iki_bir Email inputa {string} girer")
    public void kullanıcı_iki_birEmailInputaGirer(String arg0) {
        accountPage.registerEmail.sendKeys(arg0);

    }

    @And("kullanıcı_iki_bir New Password inputa {string} girer")
    public void kullanıcı_iki_birNewPasswordInputaGirer(String arg0) {
        accountPage.registerFirstPassword.sendKeys(arg0);

    }

    @And("kullanıcı_iki_bir Confirm the new password inputa {string} girer")
    public void kullanıcı_iki_birConfirmTheNewPasswordInputaGirer(String arg0) {
        accountPage.registerSecondPassword.sendKeys(arg0);
    }

    @And("kullanıcı_iki_bir Register buttona tıklar")
    public void kullanıcı_iki_birRegisterButtonaTıklar() {
        accountPage.registerSubmitButton.click();
    }

    @Then("kullanıcı_iki_bir Kayıdın kabul edildiği onaylanır.")
    public void kullanıcı_iki_birKayıdınKabulEdildiğiOnaylanır() {
        ReusableMethods.bekle(1);
        assertTrue(accountPage.alertRegistrationSaved.isDisplayed());
    }


    // ============ TC_02 ============================

    @Given("kullanıcı_iki_iki, {string} sayfasına gider")
    public void kullanıcı_iki_ikiSayfasınaGider(String arg0) {
        Driver.getDriver().get(arg0);
        ReusableMethods.bekle(1);
    }

    @And("kulanıcı_iki_iki user ikonuna tikla")
    public void kulanıcı_iki_ikiUserIkonunaTikla() {
        homepage.userIcon.click();
    }

    @And("kullanıcı_iki_iki Register'i tıklar.")
    public void kullanıcı_iki_ikiRegisterITıklar() {
        homepage.register.click();
    }

    @And("kullanıcı_iki_iki Username inputa tıklar ve bir şey yazmaz")
    public void kullanıcı_iki_ikiUsernameInputaTıklarVeBirŞeyYazmaz() {
        accountPage.registerUserName.click();
    }

    @And("Kullanıcı_iki_iki Email inpua tıklar")
    public void kullanıcı_iki_ikiEmailInpuaTıklar() {
        accountPage.registerEmail.click();
    }

    @Then("Kullanıcı_iki_iki Username inputu altında Your username is required görüldüğünü onaylar.")
    public void kullanıcı_iki_ikiUsernameInputuAltındaYourSSNIsRequiredGörüldüğünüOnaylar() {
        assertTrue(staffPage.invalidUserName.isDisplayed());
    }

    // ================== TC_03 ================

    @Given("kullanıcı_iki_uc, {string} sayfasına gider")
    public void kullanıcı_iki_ucSayfasınaGider(String arg0) {
        Driver.getDriver().get(arg0);
        ReusableMethods.bekle(1);
    }

    @And("kulanıcı_iki_uc user ikonuna tikla")
    public void kulanıcı_iki_ucUserIkonunaTikla() {
        homepage.userIcon.click();
    }

    @And("kullanıcı_iki_uc Register'i tıklar.")
    public void kullanıcı_iki_ucRegisterITıklar() {
        homepage.register.click();
    }

    @And("Kullanıcı_iki_uc Email inpua tıklar ve {string} adresini girer")
    public void kullanıcı_iki_ucEmailInpuaTıklarVeAdresiniGirer(String arg0) {
        accountPage.registerEmail.sendKeys(arg0);
    }

    @And("kullanıcı_iki_uc Username inputa tıklar ve bir şey yazmaz")
    public void kullanıcı_iki_ucUsernameInputaTıklarVeBirŞeyYazmaz() {
        accountPage.registerUserName.click();
    }

    @Then("Kullanıcı_iki_uc Email inputu altında Your email is required uyarısın görmez.")
    public void kullanıcı_iki_ucEmailInputuAltındaYourEmailIsRequiredUyarısınGörmez() {
       // assertTrue(staffPage.invalidEmail.isDisplayed());
        assertFalse(staffPage.invalidEmail.isDisplayed());

    }

    //==================== TC_04 ==============================

    @Given("kullanıcı_iki_dört, {string} sayfasına gider")
    public void kullanıcı_iki_dörtSayfasınaGider(String arg0) {
        Driver.getDriver().get(arg0);
        ReusableMethods.bekle(1);
    }

    @And("kulanıcı_iki_dört user ikonuna tikla")
    public void kulanıcı_iki_dörtUserIkonunaTikla() {
        homepage.userIcon.click();
    }

    @And("kullanıcı_iki_dört Register'i tıklar.")
    public void kullanıcı_iki_dörtRegisterITıklar() {
        homepage.register.click();
    }

    @And("Kullanıcı_iki_dört Email inpua tıklar ve {string} adresini girer")
    public void kullanıcı_iki_dörtEmailInpuaTıklarVeAdresiniGirer(String arg0) {
        accountPage.registerEmail.sendKeys(arg0);
    }

    @And("kullanıcı_iki_dört Username inputa tıklar ve bir şey yazmaz")
    public void kullanıcı_iki_dörtUsernameInputaTıklarVeBirŞeyYazmaz() {
        accountPage.registerUserName.click();
    }


    @Then("Kullanıcı_iki_dört Email inputu altında Your email is required uyarısın görüldüğünü onaylar")
    public void kullanıcı_iki_dörtEmailInputuAltındaYourEmailIsRequiredUyarısınGörüldüğünüOnaylar() {
        assertTrue(staffPage.invalidEmail.isDisplayed());
    }

    // ================ TC_05 =========================

    @Given("kullanıcı_iki_beş, {string} sayfasına gider")
    public void kullanıcı_iki_beşSayfasınaGider(String arg0) {
        Driver.getDriver().get(arg0);
        ReusableMethods.bekle(1);
    }

    @And("kulanıcı_iki_beş user ikonuna tikla")
    public void kulanıcı_iki_beşUserIkonunaTikla() {
        homepage.userIcon.click();
    }

    @And("kullanıcı_iki_beş Register'i tıklar.")
    public void kullanıcı_iki_beşRegisterITıklar() {
        homepage.register.click();
    }

    @And("kullanıcı_iki_beş Email inputa tıklar ve bir şey yazmaz")
    public void kullanıcı_iki_beşEmailInputaTıklarVeBirŞeyYazmaz() {
        accountPage.registerEmail.click();
    }

    @And("Kullanıcı_iki_beş User name inpua tıklar")
    public void kullanıcı_iki_beşUserNameInpuaTıklar() {
        accountPage.registerUserName.click();
    }

    @Then("Kullanıcı_iki_beş Email inputu altında Your email is required görüldüğünü onaylar.")
    public void kullanıcı_iki_beşEmailInputuAltındaYourEmailIsRequiredGörüldüğünüOnaylar() {
        assertTrue(staffPage.invalidEmail.isDisplayed());
    }


}
