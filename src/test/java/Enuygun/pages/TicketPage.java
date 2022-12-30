package Enuygun.pages;

import Enuygun.utils.Driver;
import Enuygun.utils.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TicketPage extends Helper {
    public TicketPage(){
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(xpath = "//div[@id='SearchRoot']//div[3]//div[1]//div[1]//div[2]//div[1]//div[5]//button[1]//span[1]")
    public WebElement firstTicketbtn;

    public void clickFirstBtn (){
        clickElement(firstTicketbtn);
    }
}
