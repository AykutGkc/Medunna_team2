package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.*;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class US_23_Payment {

    HomePage homepage = new HomePage();
    LoginPage loginpage = new LoginPage();
    AdminPage adminPage = new AdminPage();
    AccountRegisterPage accountPage = new AccountRegisterPage();
    StaffPage staffPage = new StaffPage();


    @Given("Staff_bir, {string} sayfasına gider")
    public void staff_birSayfasınaGider(String arg0) {
        Driver.getDriver().get(arg0);
        ReusableMethods.bekle(1);
    }

    @And("Staff_bir user ikonuna tikla")
    public void staff_birUserIkonunaTikla() {
        homepage.userIcon.click();
    }

    @And("Staff_bir sign in buttonunu tıklar.")
    public void staff_birSignInButtonunuTıklar() {
        homepage.signIn.click();
    }

    @And("Staff_bir username inputa {string} yazar")
    public void staff_birUsernameInputaYazar(String arg0) {
        loginpage.userName.sendKeys(arg0);
    }

    @And("Staff_bir password inputa {string} şifrenisini yazar")
    public void staff_birPasswordInputaŞifrenisiniYazar(String arg0) {
        loginpage.password.sendKeys(arg0);
    }

    @And("Staff_bir sign in buttonuna tıklayarak login yapar.")
    public void staff_birSignInButtonunaTıklayarakLoginYapar() {
        loginpage.submit.click();
    }

    @And("Staff_bir My Pages buttonuna tıklayar")
    public void staff_birMyPagesButtonunaTıklayar() {
        staffPage.myPage.click();
    }

    @And("Staff_bir Search Patient ikonuna tıklar")
    public void staff_birSearchPatientIkonunaTıklar() {
        staffPage.searchPatient.click();
    }

    @And("Staff_bir açılan sayfada Patient SSN inputu tıklayarak {string} ssn numarısını girer.")
    public void staff_birAçılanSayfadaPatientSSNInputuTıklayarakSsnNumarısınıGirer(String arg0) {
        staffPage.patientSSN.sendKeys(arg0);
    }

    @And("Staff_bir Show Appointments buttonunu tıklar")
    public void staff_birShowAppointmentsButtonunuTıklar() {
        staffPage.showAppointments.click();
    }

    @And("Staff_bir Paymant_invoicprocess buttonuna tıklar")
    public void staff_birPaymant_invoicprocessButtonunaTıklar() {
        staffPage.paymentInvoiceProcess.click();
    }


    @And("Staff_bir Create Invoice buttonuna tıklar")
    public void staff_birCreateInvoiceButtonunaTıklar() {
        staffPage.createInvoice.click();
    }

    @And("Staf_bir acılan sayfaya Save buttonunu tıklayarak fatura oluşturur.")
    public void staf_birAcılanSayfayaSaveButtonunuTıklayarakFaturaOluşturur() {
        staffPage.saveInvoice.click();
    }
    @Then("Staff_bir faturanın oluştuğunu teyit eder")
    public void staff_birFaturanınOluştuğunuTeyitEder() {
        assertTrue(staffPage.invoice.isDisplayed());
    }


    //=======================TC_02 =====================================

    @Given("Staff, {string} sayfasına gider")
    public void staffSayfasınaGider(String arg0) {
        Driver.getDriver().get(arg0);
        ReusableMethods.bekle(1);
    }

    @And("Staff user ikonuna tikla")
    public void staffUserIkonunaTikla() {
        homepage.userIcon.click();
    }

    @And("Staff sign in buttonunu tıklar.")
    public void staffSignInButtonunuTıklar() {
        homepage.signIn.click();
    }

    @And("Staff username inputa {string} yazar")
    public void staffUsernameInputaYazar(String arg0) {
        loginpage.userName.sendKeys(arg0);
    }

    @And("Staff password inputa {string} şifrenisini yazar")
    public void staffPasswordInputaŞifrenisiniYazar(String arg0) {
        loginpage.password.sendKeys(arg0);
    }

    @And("Staff sign in buttonuna tıklayarak login yapar.")
    public void staffSignInButtonunaTıklayarakLoginYapar() {
        loginpage.submit.click();
    }

    @And("Staff My Pages buttonuna tıklayar")
    public void staffMyPagesButtonunaTıklayar() {
        staffPage.myPage.click();
    }

    @And("Staff Search Patient ikonuna tıklar")
    public void staffSearchPatientIkonunaTıklar() {
        staffPage.searchPatient.click();
    }

    @And("Staff açılan sayfada Patient SSN inputu tıklayarak {string} ssn numarısını girer.")
    public void staffAçılanSayfadaPatientSSNInputuTıklayarakSsnNumarısınıGirer(String arg0) {
        staffPage.patientSSN.sendKeys(arg0);
    }

    @And("Staff Show Appointments buttonunu tıklar")
    public void staffShowAppointmentsButtonunuTıklar() {
        staffPage.showAppointments.click();
    }

    @And("Staff Paymant_invoicprocess buttonuna tıklar")
    public void staffPaymant_invoicprocessButtonunaTıklar() {
        staffPage.paymentInvoiceProcess.click();
    }

    @And("Staff Exam Fee yazısının görüldüğünü teyit eder")
    public void staffExamFeeYazısınınGörüldüğünüTeyitEder() {
        assertTrue(staffPage.examFee.isDisplayed());

    }

    @And("Staff Show Invoice buttonuna tıklar")
    public void staffShowInvoiceButtonunaTıklar() {
        staffPage.showInvoiceButton.click();
    }

    @Then("Staff fatura oluşturma formunun acıldığını onaylar.")
    public void staffFaturaOluşturmaFormununAcıldığınıOnaylar() {
        assertTrue(staffPage.invoice.isDisplayed());
    }

    // =================== TC_03 =========================

    @Given("Staff_iki, {string} sayfasına gider")
    public void staff_ikiSayfasınaGider(String arg0) {
        Driver.getDriver().get(arg0);
        ReusableMethods.bekle(1);
    }

    @And("Staff_iki user ikonuna tikla")
    public void staff_ikiUserIkonunaTikla() {
        homepage.userIcon.click();
    }

    @And("Staff_iki sign in buttonunu tıklar.")
    public void staff_ikiSignInButtonunuTıklar() {
        homepage.signIn.click();
    }

    @And("Staff_iki username inputa {string} yazar")
    public void staff_ikiUsernameInputaYazar(String arg0) {
        loginpage.userName.sendKeys(arg0);
    }

    @And("Staff_iki password inputa {string} şifrenisini yazar")
    public void staff_ikiPasswordInputaŞifrenisiniYazar(String arg0) {
        loginpage.password.sendKeys(arg0);
    }

    @And("Staff_iki sign in buttonuna tıklayarak login yapar.")
    public void staff_ikiSignInButtonunaTıklayarakLoginYapar() {
        loginpage.submit.click();
    }

    @And("Staff_iki My Pages buttonuna tıklayar")
    public void staff_ikiMyPagesButtonunaTıklayar() {
        staffPage.myPage.click();
    }

    @And("Staff_iki Search Patient ikonuna tıklar")
    public void staff_ikiSearchPatientIkonunaTıklar() {
        staffPage.searchPatient.click();
    }

    @And("Staff_iki açılan sayfada Patient SSN inputu tıklayarak {string} ssn numarısını girer.")
    public void staff_ikiAçılanSayfadaPatientSSNInputuTıklayarakSsnNumarısınıGirer(String arg0) {
        staffPage.patientSSN.sendKeys(arg0);
    }
    @And("Staff_iki Show Appointmants buttonunu tıklar tıklar")
    public void staff_ikiShowAppointmantsButtonunuTıklarTıklar() {
        staffPage.showAppointments.click();
    }

    @And("Staff_iki Payment Invoice Process buttonunu tıklar tıklar")
    public void staff_ikiPaymentInvoiceProcessButtonunuTıklarTıklar() {
        staffPage.paymentInvoiceProcess.click();

    }


    @And("Staff_iki detaylı faturayı görüntüler")
    public void staff_ikiDetaylıFaturayıGörüntüler() {
        assertTrue(staffPage.paymentDetail.isDisplayed());
    }




    //====================================================

}
