package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.LoginPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US04 {
    HomePage homePage = new HomePage();
    @Given("The User goes to Medunna")
    public void theUserGoesToMedunna() {
        Driver.getDriver().get("https://www.medunna.com/");
        ReusableMethods.bekle(2);
    }

    @Then("Click on the user icon at the top right")
    public void clickOnTheUserIconAtTheTopRight() {
        homePage.userIcon.click();

    }

    @And("The User cliks Sign in")
    public void theUserCliksSignIn() {
        homePage.signIn.click();
    }

    @And("Enter valid username and password")
    public void enterValidUsernameAndPassword() {

    }

    @And("Clicks on the remember me button")
    public void clicksOnTheRememberMeButton() {
    }

    @And("Clicks on the Sign in button")
    public void clicksOnTheSignInButton() {
    }

    @Then("Verifies that the user is logged in with username")
    public void verifiesThatTheUserIsLoggedInWithUsername() {
    }

    @And("closes the page")
    public void closesThePage() {
    }
}
