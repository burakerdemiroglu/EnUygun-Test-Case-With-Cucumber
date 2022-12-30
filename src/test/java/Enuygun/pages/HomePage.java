package Enuygun.pages;

import Enuygun.utils.Driver;
import Enuygun.utils.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Helper {
    public HomePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "#OriginInput")
    public WebElement departureTextBox;
    @FindBy (xpath = "//div[contains(text(),'İstanbul')]")
    public WebElement popularCountry;
    @FindBy(css = "#DestinationInput")
    public WebElement landingPointTextBox;
    @FindBy (xpath = "//div[normalize-space()='Dalaman']")
    public WebElement  landingPointArea;
    @FindBy (css = "#DepartureDate")
    public WebElement departureTextBoxDate;
    @FindBy(css = "td[aria-label='Cuma, 20 Ocak 2023'] div[class='CalendarDay__content']")
    public WebElement selectDepartureDate ;
    @FindBy (css = "div[class='D_FSF__col'] span:nth-child(1)")
    public WebElement findTicketBtn;


    public void clickDepartureTextBox( ) {
        clickElement(departureTextBox);
        clickElement(popularCountry);
    }
    public void  clickLandingPointTexBox(){
        clickElement(landingPointTextBox);
        clickElement(landingPointArea);
    }
    public void seleckDepartureDate(){
        clickElement(departureTextBoxDate);
        clickElement(selectDepartureDate);
    }
    public void clickfindTicketBtn (){
        clickElement(findTicketBtn);
    }

}
