package pages;

import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AppointmentUpdatePages {

    public AppointmentUpdatePages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }






























































































































































    //Aykut 171-220
    @FindBy(xpath ="//*[@id='appointment-anamnesis']" )
    public WebElement anammesisBox;

    @FindBy(xpath ="//*[@id='appointment-treatment']" )
    public WebElement treatmentBox;

    @FindBy(xpath ="//*[@id='appointment-diagnosis']" )
    public WebElement diagnosisBox;

    @FindBy( xpath="//*[text()='Save']")
    public WebElement saveButtonInAppointmentUpdate;

    @FindBy( xpath="//*[text()='The Appointment is updated with identifier 90694']")
    public WebElement grünesKontrollBox;







}
