package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class RegisterStep {
    @Steps
    HomePage homePage;

    @Steps
    LoginPage loginPage;

    @Steps
    RegisterPage registerPage;


    @Given("I am on register page")
    public void clickRegister(){
        loginPage.clickRegister();
        registerPage.validateOnRegisPage();
    }

    @When("I input nama {string} on field Nama Lengkap")
    public void iInputNamaOnFieldNamaLengkap(String arg0) {
        registerPage.inputNama(arg0);
    }

    @And("I input email {string} on field Email")
    public void iInputEmailOnFieldEmail(String arg0) {
        registerPage.inputEmail(arg0);
    }

    @And("I input password {string} on field Password")
    public void iInputPasswordOnFieldPassword(String arg0) {
        registerPage.inputPassword(arg0);
    }

    @And("I click register button")
    public void clickRegisterButton(){
        registerPage.clickButtonRegis();
    }

    @Then("I am on signin page")
    public void onSigninPage(){
        loginPage.validateOnLoginPage();
    }

//==============Register1==========
    @Given("I am on landing page")
    public void iAmOnLandingPage() {
        homePage.onPageHomee();
    }

    @When("I click button signin")
    public void iClickButtonSignin() {
        homePage.openSigninPage();
    }

    @And("I am on page login")
    public void iAmOnPageLogin() {
        loginPage.validateOnLoginPage();
    }

    @And("I click register")
    public void iClickRegister() {
        loginPage.clickRegister();
    }

    @And("I input nama {string} on field nama Lengkap")
    public void iInputNamaOnFieldNamalengkap(String arg0) {
        registerPage.inputNama(arg0);

    }

    @And("I input email {string} on field email")
    public void iInputEmailOnFieldMail(String arg0) {
        registerPage.inputEmail(arg0);
    }

    @And("I input password {string} on field password")
    public void iInputPasswordOnFieldPwd(String arg0) {
        registerPage.inputPassword(arg0);
    }

    @And("I click button register")
    public void iClickButtonRegister() {
        registerPage.clickButtonRegis();
    }

    @Then("Show alert error")
    public void iAmOnSigInPage() {
        registerPage.showErrorRegister();
    }
}
