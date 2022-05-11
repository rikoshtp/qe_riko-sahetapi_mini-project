package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.TransactionPage;

public class OrderStep {
    @Steps
    HomePage homePage;

    @Steps
    CartPage cartPage;

    @Steps
    LoginPage loginPage;

    @Steps
    TransactionPage transactionPage;

    @Given("I am on Landing_Pages")
    public void onLandingPages(){
        homePage.onPageHomeee();
    }

    @When("I click \"Buy\" on any product")
    public void clickBuyOnAnyProduct(){
        homePage.clickBuyTensiElektrik();
    }

    @And("I click Icon Cart")
    public void clickIconCart(){
        homePage.clickIconCart();
    }

    @And("I click \"+\" 2 times")
    public void clickPlus(){
        for (int i = 1; i >=2; i++) {
            cartPage.clickButtonPlus();
        }
    }

    @And("I click \"-\"")
    public void clickMin(){
        cartPage.clickButtonMin();
    }

    @And("I click button Bayar")
    public void clickButtonBeli(){
        cartPage.clickButtonBayar();
    }

    @Then("Show Sign In Page")
    public void showSignInPage(){
        loginPage.validateOnLoginPage();
    }

//    ======== Rrder2 ==========
    @And("I click button \"+\" 2 times")
    public void iClickButtonTimes() {
        for (int j = 1; j >=2; j++) {
            cartPage.clickButtonPlus();
        }
    }

    @And("I click button \"-\"")
    public void clickButtonMinn(){
        cartPage.clickButtonMin();
    }

    @And("I Click button Bayar")
    public void iClickButton() {
        cartPage.clickButtonBayar();
    }

    @And("I am go to login page")
    public void iAmGoToLoginPage() {
        loginPage.validateOnLoginPage();
    }

    @And("I input email {string} and invalid password {string}")
    public void iInputEmailAndInvalidPassword(String arg0, String arg1) {
        loginPage.inputEmail("rikoshtp@gmail.com");
        loginPage.inputPassword("qualityengineer");
    }

    @And("I click LOGIN button")
    public void iClickLOGINButton() {
        loginPage.clickLoginButton();
    }

    @Then("I am on Transaction Page")
    public void iAmOnTransactionPage() {
        transactionPage.onTransactionPage();
    }
}
