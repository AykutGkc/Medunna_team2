package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.AccountRegisterPage;
import pages.AdminPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class US06 {
    HomePage homePage = new HomePage();
    AccountRegisterPage accountPage = new AccountRegisterPage();
    LoginPage loginPage = new LoginPage();
    AdminPage adminPage = new AdminPage();
    Faker faker= new Faker();
    String userFirstnameNew= faker.name().firstName();
    String userLastnameNew= faker.name().lastName();
    String userEmailNew= faker.internet().emailAddress();

    @And("Yeni User hesabina ait Password gir")
    public void YeniUserHesabinaAitPasswordGir() {
        loginPage.password.sendKeys(ConfigReader.getProperty("firstPasswordUser"));

    }

    @Given("Kullanici medunna anasayfasina gider")
    public void kullaniciMedunnaAnasayfasinaGider() {
        Driver.getDriver().get("https://www.medunna.com/");
        ReusableMethods.bekle(1);
    }

    @Then("Sag ustteki user ikonuna tikla")
    public void sagUsttekiUserIkonunaTikla() {
        ReusableMethods.bekle(1);
        ReusableMethods.click(homePage.userIcon);

    }

    @Then("Register butonuna tikla")
    public void registerButonunaTikla() {

        ReusableMethods.clickElementByJS(homePage.register);


    }

    @And("Gecerli SSN numarasi {string} gir")
    public void gecerliSSNNumarasiGir(String ssnUser) {
        accountPage.registerSsn.sendKeys(ConfigReader.getProperty(ssnUser));

    }

    @And("Gecerli Firstname {string} gir")
    public void gecerliFirstnameGir(String firstName) {
        accountPage.registerFirstName.sendKeys(ConfigReader.getProperty(firstName));

    }

    @And("Gecerli Lastname {string} gir")
    public void gecerliLastnameGir(String lastName) {
        accountPage.registerLastName.sendKeys(ConfigReader.getProperty(lastName));

    }

    @And("User hesabina ait username {string} gir")
    public void userHesabinaAitUsernameGir(String userName) {
       loginPage.userName.sendKeys(ConfigReader.getProperty(userName));
       ReusableMethods.bekle(1);

    }

    @And("Gecerli Email {string} gir")
    public void gecerliEmailGir(String email) {
        accountPage.registerEmail.sendKeys(ConfigReader.getProperty(email));

    }

    @And("Gecerli New Password {string} gir")
    public void gecerliNewPasswordGir(String firstPassword) {
        accountPage.registerFirstPassword.sendKeys(ConfigReader.getProperty(firstPassword));

    }

    @And("New Password confirmation {string} gir")
    public void newPasswordConfirmationGir(String secondPassword) {
        accountPage.registerSecondPassword.sendKeys(ConfigReader.getProperty(secondPassword));

    }

    @And("Register islemini dogrula")
    public void registerIsleminiDogrula() {
        ReusableMethods.bekle(1);
    assertTrue(accountPage.alertRegistrationSaved.isDisplayed());
    }

    @And("Sign in butonuna tikla")
    public void signInButonunaTikla() {
        ReusableMethods.scroll(homePage.signIn);
        ReusableMethods.clickElementByJS(homePage.signIn);
    }

    @And("Kayitli Admin hesabina ait Username {string} gir")
    public void kayitliAdminHesabinaAitUsernameGir(String adminUsername) {
        loginPage.userName.sendKeys(ConfigReader.getProperty(adminUsername));
    }

    @And("Kayitli Admin hesabina ait Password {string} gir")
    public void kayitliAdminHesabinaAitPasswordGir(String adminPassword) {
        loginPage.password.sendKeys(ConfigReader.getProperty(adminPassword));
    }

    @And("Sign in \\(Submit) butonuna tikla")
    public void signInSubmitButonunaTikla() {
        ReusableMethods.clickElementByJS(loginPage.submit);
    }

    @And("Administration butonuna tikla")
    public void administrationButonunaTikla() {
        ReusableMethods.visibleWait(adminPage.administration,2);
        ReusableMethods.clickElementByJS(adminPage.administration);
    }

    @And("User Management butonuna tikla")
    public void userManagementButonunaTikla() {
        ReusableMethods.clickElementByJS(adminPage.userManagement);
    }

    @And("Users tablosunda son sayfaya tikla")
    public void usersTablosundaSonSayfayaTikla() {
        ReusableMethods.scroll(adminPage.usersLastPage);
        ReusableMethods.clickElementByJS(adminPage.usersLastPage);
    }

    @And("Yeni olusturulan kullaniciya ait Edit butonuna tikla")
    public void yeniOlusturulanKullaniciyaAitEditButonunaTikla() {
    ReusableMethods.clickElementByJS(adminPage.metinErdemEdit);
    }

    @And("Profiles bölümünden kullaniciya USER rolü ver")
    public void profilesBölümündenKullaniciyaUSERRolüVer() {
        ReusableMethods.ddmValue(adminPage.profilesDDM,"ROLE_USER");
    }

    @And("User Save butonuna tikla")
    public void userSaveButonunaTikla() {
        ReusableMethods.scroll(adminPage.userSave);
        ReusableMethods.clickElementByJS(adminPage.userSave);
    }

    @And("Yeni olusturulan kullaniciyi Activated yap")
    public void yeniOlusturulanusernameIOlanKullaniciyiActivatedYap() {
        ReusableMethods.clickElementByJS(adminPage.activatedButton);
    }

    @And("Yeni User hesabina ait Username gir")
    public void kayitliUserHesabinaAitUsernameGir() {
loginPage.userName.sendKeys(ConfigReader.getProperty("userNameUser"));
    }

    @And("Sag ustteki kullanici adina tikla")
    public void sagUsttekiKullaniciAdinaTikla() {
    }

    @And("Settings butonuna tikla")
    public void settingsButonunaTikla() {
ReusableMethods.clickElementByJS(accountPage.accountSettings);
    }

    @And("First Name'in {string} oldugunu dogrula")
    public void firstNameInOldugunuDogrula(String firstNameUser) {
        assertEquals(ConfigReader.getProperty(firstNameUser),accountPage.accountSettingsFirstName.getAttribute("value"));
    }

    @And("Last Name'in {string} oldugunu dogrula")
    public void lastNameInOldugunuDogrula(String lastNameUser) {
        assertEquals(ConfigReader.getProperty(lastNameUser),accountPage.accountSettingsLastName.getAttribute("value"));    }

    @And("Email'in {string} oldugunu dogrula")
    public void emailInOldugunuDogrula(String emailUser) {
        assertEquals(ConfigReader.getProperty(emailUser),accountPage.accountSettingsEmail.getAttribute("value"));
    }
    public static void scrollToElement(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    @And("Register\\(Submit) butonuna tikla")
    public void registerSubmitButonunaTikla() {
        scrollToElement(accountPage.registerSubmitButton);
        ReusableMethods.bekle(1);
        ReusableMethods.clickElementByJS(accountPage.registerSubmitButton);
    }

    @And("Sign out'a tikla")
    public void signOutATikla() {
        ReusableMethods.clickElementByJS(adminPage.signOutButton);
    }

    @And("Yeni olusturulan kullaniciyi sil")
    public void yeniOlusturulanKullaniciyiSil() {
        ReusableMethods.bekle(2);
        ReusableMethods.scroll(adminPage.DeleteButton);
        ReusableMethods.clickElementByJS(adminPage.DeleteButton);
        ReusableMethods.bekle(2);
        ReusableMethods.clickElementByJS(adminPage.deleteConfirmButton);
    }


    @And("User hesabina ait password {string} gir")
    public void userHesabinaAitPasswordGir(String username) {
        loginPage.password.sendKeys(ConfigReader.getProperty(username));
    }

    @And("Firstname kutusuna yeni bir veri gir")
    public void firstnameKutusunaYeniBirVeriGir() {
        accountPage.accountSettingsFirstName.clear();
        accountPage.accountSettingsFirstName.sendKeys(userFirstnameNew);
        ReusableMethods.bekle(1);
    }

    @And("Lastname kutusuna yeni bir veri gir")
    public void lastnameKutusunaYeniBirVeriGir() {
        accountPage.accountSettingsLastName.clear();
        accountPage.accountSettingsLastName.sendKeys(userLastnameNew);
        ReusableMethods.bekle(1);

    }

    @And("Email kutusuna yeni bir veri gir")
    public void emailKutusunaYeniBirVeriGir() {
        accountPage.accountSettingsEmail.clear();
        accountPage.accountSettingsEmail.sendKeys(userEmailNew);
        ReusableMethods.bekle(1);

    }

    @And("User Settings Save butonuna tikla")
    public void userSettingsSaveButonunaTikla() {
        ReusableMethods.click(accountPage.accountSettingsSave);
    }

    @And("First Name degerinin güncellendigini dogrula")
    public void firstNameDegerininGüncellendiginiDogrula() {
        assertEquals(userFirstnameNew,accountPage.accountSettingsFirstName.getAttribute("value"));
        ReusableMethods.bekle(1);

    }


    @And("Last Name degerinin güncellendigini dogrula")
    public void lastNameDegerininGüncellendiginiDogrula() {
        assertEquals(userLastnameNew,accountPage.accountSettingsLastName.getAttribute("value"));
        ReusableMethods.bekle(1);
    }

    @And("Email bilgisinin güncellendigini dogrula")
    public void emailBilgisininGüncellendiginiDogrula() {
        assertEquals(userEmailNew,accountPage.accountSettingsEmail.getAttribute("value"));
        ReusableMethods.bekle(1);
    }

    @And("Gecerli Username {string} gir")
    public void gecerliUsernameGir(String userNameUser) {
        accountPage.registerUserName.sendKeys(ConfigReader.getProperty(userNameUser));
    }
}
