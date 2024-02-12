package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.*;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class US_01 {

    HomePage homepage = new HomePage();
    LoginPage loginpage = new LoginPage();
    AdminPage adminPage = new AdminPage();
    AccountRegisterPage accountPage = new AccountRegisterPage();
    StaffPage staffPage = new StaffPage();

    @Given("kullanıcı, {string} sayfasına gider")
    public void kullanıcıSayfasınaGider(String arg0) {
        Driver.getDriver().get(arg0);
        ReusableMethods.bekle(1);
    }

    @And("kulanıcı user ikonuna tikla")
    public void kulanıcıUserIkonunaTikla() {
        homepage.userIcon.click();
    }

    @And("kullanıcı Register'i tıklar.")
    public void kullanıcıRegisterITıklar() {
        homepage.register.click();
    }

    @And("kullanıcı SSN input'a {string} girer")
    public void kullanıcıSSNInputAGirer(String arg0) {
        accountPage.registerSsn.sendKeys(arg0);

    }

    @And("kullanıcı First Name inputa {string} girer")
    public void kullanıcıFirstNameInputaGirer(String arg0) {
        accountPage.registerFirstName.sendKeys(arg0);
    }

    @And("kullanıcı Last Name inputa {string} girer")
    public void kullanıcıLastNameInputaGirer(String arg0) {
        accountPage.registerLastName.sendKeys(arg0);
    }

    @And("kullancı Usurname inputa {string} girer")
    public void kullancıUsurnameInputaGirer(String arg0) {
        accountPage.registerUserName.sendKeys(arg0);
    }

    @And("kullanıcı Email inputa {string} girer")
    public void kullanıcıEmailInputaGirer(String arg0) {
        accountPage.registerEmail.sendKeys(arg0);
    }

    @And("kullanıcı New Password inputa {string} girer")
    public void kullanıcıNewPasswordInputaGirer(String arg0) {
        accountPage.registerFirstPassword.sendKeys(arg0);
    }

    @And("kullanıcı Confirm the new password inputa {string} girer")
    public void kullanıcıConfirmTheNewPasswordInputaGirer(String arg0) {
        accountPage.registerSecondPassword.sendKeys(arg0);
    }

    @And("kullanıcı Register buttona tıklar")
    public void kullanıcıRegisterButtonaTıklar() {
        ReusableMethods.scroll(accountPage.registerSubmitButton);
        accountPage.registerSubmitButton.click();
    }

    @And("Kayıdın kabul edildiği onaylanır.")
    public void kayıdınKabulEdildiğiOnaylanır() {
        ReusableMethods.bekle(1);
        assertTrue(accountPage.alertRegistrationSaved.isDisplayed());
    }




    //===================== TC 02 ============

    @Given("kullanıcı_iki, {string} sayfasına gider")
    public void kullanıcı_ikiSayfasınaGider(String arg0) {
        Driver.getDriver().get(arg0);
        ReusableMethods.bekle(1);
    }

    @And("kulanıcı_iki user ikonuna tikla")
    public void kulanıcı_ikiUserIkonunaTikla() {
        homepage.userIcon.click();
    }

    @And("kullanıcı_iki Register'i tıklar.")
    public void kullanıcı_ikiRegisterITıklar() {
        homepage.register.click();
    }

    @And("kullanıcı SSN inputa tıklar ve bir şey yazmaz")
    public void kullanıcıSSNInputaTıklarVeBirŞeyYazmaz() {
        accountPage.registerSsn.click();
    }

    @And("Kullanıcı Firstname inpua tıklar")
    public void kullanıcıFirstnameInpuaTıklar() {
        accountPage.registerFirstName.click();
    }

    @Then("SSN inputu altında {string} görüldüğünü onaylar.")
    public void ssnInputuAltındaGörüldüğünüOnaylar(String arg0) {
        assertTrue(staffPage.requiredSSN.isDisplayed());
    }


    //===================== TC 03 ============

    @Given("kullanıcı_uc, {string} sayfasına gider")
    public void kullanıcı_ucSayfasınaGider(String arg0) {
        Driver.getDriver().get(arg0);
        ReusableMethods.bekle(1);

    }

    @And("kulanıcı_uc user ikonuna tikla")
    public void kulanıcı_ucUserIkonunaTikla() {
        homepage.userIcon.click();
    }

    @And("kullanıcı_uc Register'i tıklar.")
    public void kullanıcı_ucRegisterITıklar() {
        homepage.register.click();
    }

    @And("kullanıcı SSN inputa tıklayarak {string} rakamlarını girer")
    public void kullanıcıSSNInputaTıklayarakRakamlarınıGirer(String arg0) {
        accountPage.registerSsn.sendKeys(arg0);
    }

    @And("Kullanıcı_uc sonraki input Firstname'ye tiklar tıklar")
    public void kullanıcı_ucSonrakiInputFirstnameYeTiklarTıklar() {
        accountPage.registerFirstName.click();
    }

    @And("Kullanıcı sonraki input Firstname'ye tiklar tıklar")
    public void kullanıcıSonrakiInputFirstnameYeTiklarTıklar() {
        assertTrue(staffPage.invalidSSN.isDisplayed());
    }
    //===================== TC 04 ============

    @Given("kullanıcı_dört, {string} sayfasına gider")
    public void kullanıcı_dörtSayfasınaGider(String arg0) {
        Driver.getDriver().get(arg0);
        ReusableMethods.bekle(1);
    }

    @And("kulanıcı_dört user ikonuna tikla")
    public void kulanıcı_dörtUserIkonunaTikla() {
        homepage.userIcon.click();
    }

    @And("kullanıcı_dört Register'i tıklar.")
    public void kullanıcı_dörtRegisterITıklar() {
        homepage.register.click();
    }

    @And("kullanıcı_dört SSN inputa tıklayarak {string} {int} rakam girer")
    public void kullanıcı_dörtSSNInputaTıklayarakRakamGirer(String arg0, int arg1) {
        accountPage.registerSsn.sendKeys(arg0);
    }
    @And("Kullanıcı_dört sonraki input Firstname'ye tiklar tıklar")
    public void kullanıcı_dörtSonrakiInputFirstnameYeTiklarTıklar() {
        accountPage.registerFirstName.click();
    }

    @Then("Kullanıcı_dört SSN inputu altında {string} görüldüğünü onaylar.")
    public void kullanıcı_dörtSSNInputuAltındaGörüldüğünüOnaylar(String arg0) {
        assertTrue(staffPage.invalidSSN.isDisplayed());
    }

    //===================== TC 05 ============

    @Given("kullanıcı_bes, {string} sayfasına gider")
    public void kullanıcı_besSayfasınaGider(String arg0) {
        Driver.getDriver().get(arg0);
        ReusableMethods.bekle(1);
    }

    @And("kulanıc_bes user ikonuna tikla")
    public void kulanıc_besUserIkonunaTikla() {
        homepage.userIcon.click();
    }

    @And("kullanıc_bes Register'i tıklar.")
    public void kullanıc_besRegisterITıklar() {
        homepage.register.click();
    }

    @And("kullanıcı_bes SSN inputa tıklayarak {string} {int} rakam girer")
    public void kullanıcı_besSSNInputaTıklayarakRakamGirer(String arg0, int arg1) {
        accountPage.registerSsn.sendKeys(arg0);
    }

    @And("Kullanıcı_bes sonraki input Firstname'ye tiklar tıklar")
    public void kullanıcı_besSonrakiInputFirstnameYeTiklarTıklar() {
        accountPage.registerFirstName.click();

    }

    @Then("Kullanıcı_bes SSN inputu altında {string} görüldüğünü onaylar.")
    public void kullanıcı_besSSNInputuAltındaGörüldüğünüOnaylar(String arg0) {
        ReusableMethods.bekle(1);
        assertTrue(staffPage.invalidSSN.isDisplayed());
    }


    //===================== TC 06 ============

    @Given("kullanıcı_alti, {string} sayfasına gider")
    public void kullanıcı_altiSayfasınaGider(String arg0) {
        Driver.getDriver().get(arg0);
        ReusableMethods.bekle(1);
    }

    @And("kulanıcı_alti user ikonuna tikla")
    public void kulanıcı_altiUserIkonunaTikla() {
        homepage.userIcon.click();
    }

    @And("kullanıcı_alti Register'i tıklar.")
    public void kullanıcı_altiRegisterITıklar() {
        homepage.register.click();
    }

    @And("First Name inputu boş bırakır.")
    public void firstNameInputuBoşBırakır() {
        accountPage.registerFirstName.click();
    }
    @And("Last Name inputu boş bırakır.")
    public void lastNameInputuBoşBırakır() {
        accountPage.registerLastName.click();
    }
    @And("Usurname inputu boş bırakır.")
    public void usurnameInputuBoşBırakır() {
        accountPage.registerUserName.click();
    }
    @And("Email inputu boş bırakır.")
    public void emailInputuBoşBırakır() {
        accountPage.registerEmail.click();
    }
    @And("kullanıcı password inputu tiklar.")
    public void kullanıcıPasswordInputuTiklar() {
        accountPage.registerUserName.click();
    }

    @And("Your FirstName is required mesajını görüldüğünü onaylar")
    public void yourFirstNameIsRequiredMesajınıGörüldüğünüOnaylar() {
        assertTrue(staffPage.invalidFirstName.isDisplayed());
    }

    @And("Your LastName is required mesajını görüldüğünü onaylar")
    public void yourLastNameIsRequiredMesajınıGörüldüğünüOnaylar() {
        assertTrue(staffPage.invalidLastName.isDisplayed());
    }

    @And("Your UsurName is required mesajını görüldüğünü onaylar")
    public void yourUsurNameIsRequiredMesajınıGörüldüğünüOnaylar() {
        assertTrue(staffPage.invalidUserName.isDisplayed());
    }

    @Then("Your email is required mesajını görüldüğünü onaylar")
    public void yourEmailIsRequiredMesajınıGörüldüğünüOnaylar() {
        assertTrue(staffPage.invalidEmail.isDisplayed());
    }

    //===================== TC 07 ============

    @Given("kullanıcı_yedi, {string} sayfasına gider")
    public void kullanıcı_yediSayfasınaGider(String arg0) {
        Driver.getDriver().get(arg0);
        ReusableMethods.bekle(1);
    }

    @And("kulanıcı_yedi user ikonuna tikla")
    public void kulanıcı_yediUserIkonunaTikla() {
        homepage.userIcon.click();
    }

    @And("kullanıcı_yedi Register'i tıklar.")
    public void kullanıcı_yediRegisterITıklar() {
        homepage.register.click();
    }

    @And("First Name inputu tıklar ve {string}. rakamlarını.")
    public void firstNameInputuTıklarVeRakamlarını(String arg0) {
        accountPage.registerFirstName.sendKeys(arg0);
    }

    @And("Last Name inputu tıklar ve {string} rakamlarını girer.")
    public void lastNameInputuTıklarVeRakamlarınıGirer(String arg0) {
        accountPage.registerLastName.sendKeys(arg0);
    }
    @And("kullanıcı_yedi Usurname inputu boş bırakır.")
    public void kullanıcı_yediUsurnameInputuBoşBırakır() {
        accountPage.registerUserName.click();
    }

    @And("Kullanıcı_yedi Your FirstName is required mesajını görüldüğünü onaylar")
    public void kullanıcı_yediYourFirstNameIsRequiredMesajınıGörüldüğünüOnaylar() {
        assertTrue(staffPage.invalidFirstName.isDisplayed());

    }


    @Then("Kullanıcı_yedi Your LastName is required mesajını görüldüğünü onaylar")
    public void kullanıcı_yediYourLastNameIsRequiredMesajınıGörüldüğünüOnaylar() {
        assertTrue(staffPage.invalidLastName.isDisplayed());
    }


}



