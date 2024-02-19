package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AdminPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US04 {
    HomePage homePage = new HomePage();
    LoginPage loginPage= new LoginPage();
    AdminPage adminPage= new AdminPage();
    @Given("The User goes to Medunna")
    public void theUserGoesToMedunna() {
        Driver.getDriver().get("https://www.medunna.com/");
        ReusableMethods.bekle(2);
    }

    @Then("Click on the user icon at the top right")
    public void clickOnTheUserIconAtTheTopRight() {
        homePage.userIcon.click();
        ReusableMethods.bekle(2);

    }

    @And("The User cliks Sign in")
    public void theUserCliksSignIn() {

        homePage.signIn.click();
        ReusableMethods.bekle(2);
    }

    @And("Enter valid username and password")
    public void enterValidUsernameAndPassword() {
        loginPage.userName.sendKeys("hulkiadmin", Keys.TAB,"Hulki.123");

    }

    @And("Clicks on the remember me button")
    public void clicksOnTheRememberMeButton() {
        loginPage.rememberMeButton.click();
    }

    @And("Clicks on the Sign in button")
    public void clicksOnTheSignInButton() {
     loginPage.SignIn.click();
    }

    @Then("Verifies that the user is logged in with username")
    public void verifiesThatTheUserIsLoggedInWithUsername() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(adminPage.adminMenu.getText().contains("hulki admin"));

    }

    @And("closes the page")
    public void closesThePage() {
       Driver.closeDriver();
    }
}
