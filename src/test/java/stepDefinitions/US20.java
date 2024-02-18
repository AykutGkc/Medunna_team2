package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AdminUserManagementUserEditPage;
import pages.HomePage;
import utilities.ReusableMethods;

public class US20 {

    HomePage homePage=new HomePage();
    AdminUserManagementUserEditPage adminUserManagementUserEditPage=new AdminUserManagementUserEditPage();
    @Then("Klicken Sie auf die Schaltflache Administration")
    public void klickenSieAufDieSchaltflacheAdministration() {
        homePage.administrationButtonInHomePage.click();
    }

    @Then("Klicken Sie auf die Schaltflache UserManagement")
    public void klickenSieAufDieSchaltflacheUserManagement() {
        homePage.userManagementButtonInHomePage.click();
    }

    @Given("Klicken Sie auf die Schaltflache Edit als Admin in User Management")
    public void klickenSieAufDieSchaltflacheEditAlsAdminInUserManagement() {
        homePage.editButtonInUserManagemenent2Reihe.click();
    }

    @Then("isDisplay Firstname, Lastname und E-mail")
    public void isdisplayFirstnameLastnameUndEMail() {
        adminUserManagementUserEditPage.firstnameTextInUsermanagement.isDisplayed();
        adminUserManagementUserEditPage.lastnameTextInUsermanagement.isDisplayed();
        adminUserManagementUserEditPage.emailTextInUsermanagement.isDisplayed();

    }

    @Then("Wählen Sie ROLE_ADMIN in der Profiles")
    public void wählenSieROLE_ADMINInDerProfiles() {
        adminUserManagementUserEditPage.RoleAdminOption.click();
    }

    @Then("Wählen Sie ROLE_USER in der Profiles")
    public void wählenSieROLE_USERInDerProfiles() {
        adminUserManagementUserEditPage.RoleUserOption.click();
    }

    @Then("Wählen Sie ROLE_PATIENT in der Profiles")
    public void wählenSieROLE_PATIENTInDerProfiles() {
        adminUserManagementUserEditPage.RolePatientOption.click();
    }

    @Then("Wählen Sie ROLE_STAFF in der Profiles")
    public void wählenSieROLE_STAFFInDerProfiles() {
        adminUserManagementUserEditPage.RoleStaffOption.click();
    }

    @Then("Wählen Sie ROLE_PHYSICIAN in der Profiles")
    public void wählenSieROLE_PHYSICIANInDerProfiles() {
        adminUserManagementUserEditPage.RolePhysicianOption.click();
    }

    @And("Es erscheint ein grünes Kontrollkästchen A user is updated with identifier user")
    public void esErscheintEinGrünesKontrollkästchenAUserIsUpdatedWithIdentifierUser() {
        ReusableMethods.waitFor(2);
        adminUserManagementUserEditPage.UserIsUpdatedWithIdentifierUser.isDisplayed();
    }

    @Then("Klicken Sie auf die Schaltflache Save in AdminUserManagementEdit")
    public void klickenSieAufDieSchaltflacheSaveInAdminUserManagementEdit() {
        ReusableMethods.waitFor(2);
        ReusableMethods.scroll(adminUserManagementUserEditPage.AdminUserManagementUserEditSaveButton);
        adminUserManagementUserEditPage.AdminUserManagementUserEditSaveButton.click();
    }
}
