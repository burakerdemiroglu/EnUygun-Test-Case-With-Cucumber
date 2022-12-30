package Enuygun.pages;

import Enuygun.utils.Driver;
import Enuygun.utils.Helper;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends Helper {
    public PaymentPage (){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(css = "#contact_email")
    public WebElement eMailTextBox ;
    @FindBy(id = "contact_cellphone")
    public WebElement telephoneTextBox ;
    @FindBy(id = "firstName_0")
    public WebElement nameTextBox ;
    @FindBy(id = "lastName_0")
    public WebElement surnameTextBox ;
    @FindBy(css = "#birthDateDay_0")
    public WebElement daybtn ;
    @FindBy(xpath = "//option[normalize-space()='20']")
    public WebElement choosedaybtn ;
    @FindBy(css = "#birthDateMonth_0")
    public WebElement mounthbtn ;
    @FindBy(xpath = "//option[normalize-space()='Eylül']")
    public WebElement chooseMounthbtn ;
    @FindBy(css = "#birthDateYear_0")
    public WebElement yearsbtn ;
    @FindBy(css = "option[value='1993']")
    public WebElement chooseyearsbtn ;

    @FindBy(xpath = "//input[@id='_0']")
    public WebElement idenftyNumber ;
    @FindBy(xpath = "//button[normalize-space()='Ödemeye ilerle']")
    public WebElement paymentBtn ;
    @FindBy(xpath = "//div[@class='payment-form-wrapper']//i[@class='ei-chevron-right chevron-alternate']")
    public WebElement  buyTicket  ;



    public void clickEmailTextBox(String email){
        sendKeysElement(eMailTextBox,email);
    }
    public void clickTelephoneTextBox(String telephone){
        sendKeysElement(telephoneTextBox,telephone);
    }
    public void clickNameTextBox(String name){
        sendKeysElement(nameTextBox,name);
    }
    public void clickSurnaameTextBox(String Surname){
        sendKeysElement(surnameTextBox,Surname);
    }

    public void clickBirtdayBtn (){
        clickElement(daybtn);
        selectDropDown(daybtn, choosedaybtn.getText());
        clickElement(mounthbtn);
        selectDropDown(mounthbtn,chooseMounthbtn.getText());
        clickElement(yearsbtn);
        clickElement(chooseyearsbtn);
    }
    public void clickIdenftyNumber(String number){
       sendKeysElement(idenftyNumber,number);
    }
    public void clickPaymentBtn (){
        scrollIntoView(paymentBtn);
        clickElement(paymentBtn);
    }
    public void checkBuyBtn (){
        Assert.assertTrue(buyTicket.isDisplayed());
    }
}
