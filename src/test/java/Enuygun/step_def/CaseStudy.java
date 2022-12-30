package Enuygun.step_def;

import Enuygun.pages.HomePage;
import Enuygun.pages.PaymentPage;
import Enuygun.pages.TicketPage;
import Enuygun.utils.Helper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CaseStudy {
    Helper _helper;
    HomePage _homepage;
    TicketPage _ticketpage ;
    PaymentPage _paymentpage;

    public CaseStudy() {
        _helper = new Helper();
        _homepage = new HomePage();
        _ticketpage=new TicketPage();
        _paymentpage =new PaymentPage();
    }

    @Given("Go to url Flight Ticket Selection Page")
    public void goToUrlFlightTicketSelectionPage() {
        _helper.navigateToUrl("https://www.enuygun.com/");
    }

    @And("Choose from which point to board the plane")
    public void chooseFromWhichPointToBoardThePlane() {
        _homepage.clickDepartureTextBox();
    }

    @And("Choose where to go")
    public void chooseWhereToGo() {
        _homepage.clickLandingPointTexBox();
    }

    @And("Select departure date")
    public void selectDepartureDate() {
        _homepage.seleckDepartureDate();
    }

    @And("Click on find cheap tickets")
    public void clickOnFindCheapTickets() {
        _homepage.clickfindTicketBtn();
    }

    @And("Select first ticket")
    public void selectFirstTicket() {
        _ticketpage.clickFirstBtn();
    }

    @And("Enter {string} address")
    public void enterAddress(String email) {
        _paymentpage.clickEmailTextBox(email);
    }

    @And("Enter {string} number")
    public void enterNumber(String telephone) {
        _paymentpage.clickTelephoneTextBox(telephone);
    }

    @And("Enter {string}")
    public void enter(String Name) {
        _paymentpage.clickNameTextBox(Name);
    }

    @And("Enter last {string}")
    public void enterLast(String Surname) {
    _paymentpage.clickSurnaameTextBox(Surname);
    }

    @And("Enter birthday date")
    public void enterBirthdayDate() {
        _paymentpage.clickBirtdayBtn();
    }

    @And("Enter TC Identification {string}")
    public void enterTCIdentification(String number) {
        _paymentpage.clickIdenftyNumber(number);
    }

    @When("Click on go to payment button")
    public void clickOnGoToPaymentButton() {
        _paymentpage.clickPaymentBtn();

    }

    @Then("Verify payment page is opened correctly")
    public void verifyPaymentPageIsOpenedCorrectly() {
        _paymentpage.checkBuyBtn();
    }
}
