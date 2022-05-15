package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.HomePage;
import pages.LoginPage;

public class CategoryStep {
    @Steps
    HomePage homePage;

    @Given("I am on landing Page")
    public void onLandingPage1(){
        homePage.onPageHomeee();
    }

    @Given("I click button \"Select category...\"")
    public void clickButtonSelectCategory(){
        homePage.clickMenuCategory();
    }

    @When("I click category \"Kesehatan\"")
    public void clickCategoryKesehatan(){
        homePage.clickCategoryKesehatan();
    }

    @Then("Show alert \"Product is empty!\"")
    public void ShowAlertProductEmpty(){
        homePage.showAlertEmpty();
    }

    @Given("I am on landing Pagee")
    public void onLandingPagee(){
        homePage.onPageHomee();
    }

    @When("I click button \"Select category..\"")
    public void clickButtonPilihCategory(){
        homePage.clickMenuCategory();
    }

    @And("I click category \"Alat\"")
    public void clickCategoryAlat(){
        homePage.clickCategoryAlat();
    }

    @Then("Show alert \"Can not get products!\"")
    public void showAlertCanNotGetProducts(){
        homePage.showAlertCantGetProduct();
    }
}
