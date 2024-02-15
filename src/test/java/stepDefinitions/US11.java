package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US11 {

    LoginPage loginPage=new LoginPage();
    MyPages myPages= new MyPages();
    HomePage homePage=new HomePage();
    AppointmentUpdatePages appointmentUpdatePages=new AppointmentUpdatePages();


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

    @Then("Klicken Sie auf die Schaltflache Sign in im HomePage")
    public void klickenSieAufDieSchaltflacheSignInImHomePage() {
        homePage.signIn.click();
    }

    @Then("Geben Sie ein gultiges Password {string} ein")
    public void gebenSieEinGultigesPasswordEin(String arg0) {
        homePage.passwordinSignIn.sendKeys(arg0);
    }

    @And("Klicken Sie auf die Schaltflache SignInSignIn")
    public void klickenSieAufDieSchaltflacheSignInSignIn() {
        homePage.signInInSignIn.click();
    }

    @Then("Geben Sie ein {string} in Anamnesis")
    public void gebenSieEinInAnamnesis(String arg0) {
        appointmentUpdatePages.anammesisBox.sendKeys(arg0);
    }

    @When("Geben Sie ein {string} in Treatment")
    public void gebenSieEinInTreatment(String arg0) {
        appointmentUpdatePages.treatmentBox.sendKeys(arg0);
        
    }

    @And("Geben Sie ein {string} in Diagnosis")
    public void gebenSieEinInDiagnosis(String arg0) {
        appointmentUpdatePages.diagnosisBox.sendKeys(arg0);
    }

    @And("Klicken Sie auf die Schaltflache Save in ApointmentPages")
    public void klickenSieAufDieSchaltflacheSaveInApointmentPages() {
        ReusableMethods.scroll(appointmentUpdatePages.saveButtonInAppointmentUpdate);
        ReusableMethods.waitFor(2);
        appointmentUpdatePages.saveButtonInAppointmentUpdate.click();
    }

    @And("Es erscheint ein grünes Kontrollkästchen")
    public void esErscheintEinGrünesKontrollkästchen() {
    appointmentUpdatePages.grünesKontrollBox.isDisplayed();

    }


    @Given("Vereinbaren Sie mit Firstname {string}, Lastname{string},SSN als NNN-NN-NNNN {string},e-mail{string},Phone{string}")
    public void vereinbarenSieMitFirstnameLastnameSSNAlsNNNNNNNNNEMailPhone(String Firstname, String Lastname, String SSN, String email, String phone) {
        ReusableMethods.scroll(homePage.firstNameInMakeAAppointment);
        ReusableMethods.waitFor(2);
        homePage.firstNameInMakeAAppointment.sendKeys(Firstname, Keys.TAB,Lastname,Keys.TAB,SSN,Keys.TAB,email,Keys.TAB,phone);
    }

    @Then("Klicken Sie auf die Schaltflache Send an Appointment Request")
    public void klickenSieAufDieSchaltflacheSendAnAppointmentRequest() {
        homePage.sendAnAppointmentRequest.click();
    }
}
