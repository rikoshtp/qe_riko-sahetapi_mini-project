package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.HomePage;
import pages.LoginPage;

public class LoginStep {
    @Steps
    HomePage homePage;

    @Steps
    LoginPage loginPage;

    @Given("I am on Landing Page")
    public void onLandingPage(){
        homePage.onPageHomee();
    }

    @When("I click button sign-in")
    public void clickButtonSignin(){
        homePage.openSigninPage();
    }

    @And("I am on login page")
    public void onLoginPage(){
        loginPage.validateOnLoginPage();
    }

    @And("I input email {string} and password {string}")
    public void iInputUsernameAndPassword(String email, String password) {
        loginPage.inputEmail("rikoshtp@gmail.com");
        loginPage.inputPassword("qualityengineer");
    }

    @And("I click login button")
    public void clickLoginButton(){
        loginPage.clickLoginButton();
    }

    @Then("I am on home page")
    public void onHomePage(){
        homePage.onPageHomee();
    }

//======================= LOGIN3 ==================

    @Given("I am on LandingPage")
    public void onLandingPage3(){
        homePage.onPageHomee();
    }

    @When("I click button Sign In")
    public void clickButtonSignin3(){
        homePage.openSigninPage();
    }

    @And("I am on LoginPage")
    public void onLoginPage3(){
        loginPage.validateOnLoginPage();
    }

    @And("I input invalid email {string} and invalid password {string}")
    public void iInputInvalidEmailAndInvalidPassword(String arg0, String arg1) {
        loginPage.inputEmail(arg0);
        loginPage.inputPassword(arg1);
    }

    @And("I click button login")
    public void clickLoginButton3(){
        loginPage.clickLoginButton();
    }

    @Then("Show Error Message \"record not found\"")
    public void onHomePage3(){
        loginPage.errorMessage();
    }

    //================== LOGIN2 ==================

    @Given("I am on Landing Page2")
    public void onLandingPage2(){
        homePage.onPageHomee();
    }

    @When("I click button sign-In")
    public void clickButtonSignin2(){
        homePage.openSigninPage();
    }

    @And("I am on login  Page")
    public void onLoginPage2(){
        loginPage.validateOnLoginPage();
    }

    @And("I input valid email {string} and invalid password {string}")
    public void iInputValidEmailAndInvalidPassword(String arg0, String arg1) {
        loginPage.inputEmail(arg0);
        loginPage.inputPassword(arg1);
    }

    @And("I click login Button")
    public void clickLoginButton2(){
        loginPage.clickLoginButton();
    }

    @Then("Show error Message \"email or password is invalid\"")
    public void onHomePage2(){
        loginPage.showErrorInvalid();
    }

//  ============LOGIN1================
    @Given("I am on Landing Page1")
    public void iAmOnLandingPage() {
        homePage.onPageHomeee();
    }

    @When("I click button Sign-in")
    public void iClickButtonSignIn() {
        homePage.openSigninPage();
    }

    @And("I am on login Page")
    public void iAmOnLoginPage() {
        loginPage.validateOnLoginPage();
    }

    @And("I input invalid email {string} and valid password {string}")
    public void iInputInvalidEmailAndValidPassword(String arg0, String arg1) {
        loginPage.inputEmail(arg0);
        loginPage.inputPassword(arg1);
    }

    @And("I click Button Login")
    public void iClickButtonLogin() {
        loginPage.clickLoginButton();
    }

    @Then("Showing Error Message \"record not found\"")
    public void showingErrorMessage() {
        loginPage.errorMessage();
    }
}

