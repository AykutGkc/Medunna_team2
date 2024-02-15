package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.AccountRegisterPage;
import pages.DoctorPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US08 {
    HomePage homePage=new HomePage();
    LoginPage loginPage=new LoginPage();
    AccountRegisterPage account=new AccountRegisterPage();
    Faker faker=new Faker();
    String password;
   /* @Given("Der Benutzer geht zur Webseite")
    public void derBenutzerGehtZurWebseite() {
        Driver.getDriver().get("https://www.medunna.com/");
        ReusableMethods.bekle(1);
    }

    */

    @And("Meldet sich mit Ihrem registrierten Namen und Passwort auf der Website an.")
    public void meldetSichMitIhremRegistriertenNamenUndPasswortAufDerWebsiteAn() {
        homePage.userIcon.click();
        homePage.signIn.click();
        loginPage.userName.sendKeys(ConfigReader.getProperty("userNameDrE"));
        loginPage.password.sendKeys(ConfigReader.getProperty("passwordDrE"));
        loginPage.submit.click();


    }

    @And("Klickt auf den Benutzernamen")
    public void klicktAufDenBenutzernamen() {
        account.userMenu.click();
    }
    @And("Klickt im Menu auf Password")
    public void klicktImMenuAufPassword() {
        account.passwordOnMenu.click();

    }
    @And("Das aktuelle Passwort wird in das Feld Aktuelles Passwort eingegeben.")
    public void dasAktuellePasswortWirdInDasFeldAktuellesPasswortEingegeben() {
        account.currentPassword.sendKeys(ConfigReader.getProperty("passwordDrE"));

    }


    @Given("Das neue Passwort wird in das neue Passwortfeld eingegeben.")
    public void dasNeuePasswortWirdInDasNeuePasswortfeldEingegeben() {
        password =faker.internet().password();
        account.newPassword.sendKeys(password);
    }

    @And("Im Feld Neues Passwort bestätigen wird ein neues Passwort eingegeben.")
    public void ımFeldNeuesPasswortBestätigenWirdEinNeuesPasswortEingegeben() {
        account.confirmPassword.sendKeys(password);

    }

    @And("Klicken Sie auf die Schaltfläche Speichern")
    public void klickenSieAufDieSchaltflächeSpeichern() {
        account.saveButtonForPassword.click();
    }

    @And("Bestätigt, dass das Passwort erfolgreich geändert wurde.")
    public void bestätigtDassDasPasswortErfolgreichGeändertWurde() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(account.successMessageAboutChangePassword.isDisplayed());
        ReusableMethods.cleanByJs(account.currentPassword);
        ReusableMethods.bekle(1);
        account.currentPassword.sendKeys(password);
        ReusableMethods.cleanByJs(account.newPassword);
        ReusableMethods.bekle(1);
        account.newPassword.sendKeys(ConfigReader.getProperty("passwordDrE"));
        ReusableMethods.bekle(1);
        account.confirmPassword.click();
        ReusableMethods.cleanByJs(account.confirmPassword);
        ReusableMethods.bekle(2);
        account.confirmPassword.sendKeys(ConfigReader.getProperty("passwordDrE"));
        ReusableMethods.bekle(1);
        account.saveButtonForPassword.click();
    }

    @Given("Geben Sie im Feld Neues Passwort Ihr acht-stelliges Passwort ein, das nur aus Zahlen besteht.")
    public void gebenSieImFeldNeuesPasswortIhrStelligesPasswortEinDasNurAusZahlenBesteht() {
      int number=faker.number().numberBetween(10000000,99999999);
        String password = String.valueOf(number);
      account.newPassword.sendKeys(password);
    }

    @And("Passwort Ebene bestätigt, dass es sich um die erste Ebene handelt.")
    public void passwortEbeneBestätigtDassEsSichUmDieErsteEbeneHandelt() {
      Assert.assertTrue(account.firstLevelPassword.isDisplayed());
    }

    @And("Geben Sie Ihr acht-stelliges Passwort, bestehend aus Kleinbuchstaben und Zahlen, in das Feld Neues Passwort ein.")
    public void gebenSieIhrStelligesPasswortBestehendAusKleinbuchstabenUndZahlenInDasFeldNeuesPasswortEin() {

        String password=faker.internet().password(7,8,false,false,true);
        System.out.println("password = " + password);
        ReusableMethods.cleanByJs(account.newPassword);
        ReusableMethods.bekle(1);
        account.newPassword.sendKeys(password);
    }

    @And("Passwort Ebene bestätigt, dass es sich um die zweite Ebene handelt.")
    public void passwortEbeneBestätigtDassEsSichUmDieZweiteEbeneHandelt() {
        Assert.assertTrue(account.secondLevelPassword.isDisplayed());
    }

    @And("Geben Sie Ihr acht-stelliges Passwort, bestehend aus Großbuchstabe und Zahlen, in das Feld Neues Passwort ein.")
    public void gebenSieIhrAchtStelligesPasswortBestehendAusGroßbuchstabeUndZahlenInDasFeldNeuesPasswortEin() {
   String password=faker.number().numberBetween(10000000,99999999)+"A";
   ReusableMethods.cleanByJs(account.newPassword);
   ReusableMethods.bekle(1);
   account.newPassword.sendKeys(password);
    }

    @Given("Geben Sie im Feld Neues Passwort Ihr acht-stelliges Passwort ein, das nur aus Kleinbuchstabe besteht.")
    public void gebenSieImFeldNeuesPasswortIhrAchtStelligesPasswortEinDasNurAusKleinbuchstabeBesteht() {
        String password=faker.internet().password(7,8,false,false,false);
        account.newPassword.sendKeys(password);
    }
}
