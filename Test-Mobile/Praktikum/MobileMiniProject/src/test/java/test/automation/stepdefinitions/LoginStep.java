package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.automation.pages.HomeScreen;
import test.automation.pages.LoginScreen;

public class LoginStep {
    @Steps
    HomeScreen homeScreen;

    @Steps
    LoginScreen loginScreen;

    @Given("I am on Page Home")
    public void userOnHomePage() {
        homeScreen.isPage();

    }

    @When("I tap icon login")
    public void tapIconLogin(){
        homeScreen.clickIconLogin();
    }


    @And("I input valid Email {string} and password {string}")
    public void iInputValidEmailAndPassword(String arg0, String arg1) {
        loginScreen.inputEmail(arg0);
        loginScreen.inputPassword(arg1);
    }

    @And("I tap button \"Login\"")
    public void tapButtonLogin(){
        loginScreen.tapLoginButton();
    }

    @Then("I am on Product Page")
    public void onProductPage(){
        boolean actual = homeScreen.isPage();
        Assert.assertTrue(actual);
    }

}
