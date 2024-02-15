package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.MyPages;
import pages.PhysicianAppointmentPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US11 {

    LoginPage loginPage=new LoginPage();
    MyPages myPages= new MyPages();

    PhysicianAppointmentPage physicianAppointmentPage=new PhysicianAppointmentPage();

    @When("Geben Sie {string} in Feld Yourname")
    public void gebenSieInFeldYourname(String arg0) {
       loginPage.userName.sendKeys(arg0);


    }

    @Given("Klicken Sie auf die Schaltflache My Pages")
    public void klickenSieAufDieSchaltflacheMyPages() {
        myPages.myPages.click();
    }

    @Then("Klicken Sie auf die Schaltflache Edit von Patienten")
    public void klickenSieAufDieSchaltflacheEditVonPatienten() {
    physicianAppointmentPage.EditButtonInPhysicianAppointment.click();
    }
}
