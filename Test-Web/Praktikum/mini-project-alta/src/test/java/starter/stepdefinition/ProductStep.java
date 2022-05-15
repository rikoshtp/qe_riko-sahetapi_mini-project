package starter.stepdefinition;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.HomePage;

public class ProductStep {
    @Steps
    HomePage homePage;

    @Given("I am on Landing_Page")
    public void onLandingPagee(){
        homePage.onPageHomee();
    }

    @When("I search and found \"Tensi Darah Elektrik\"")
    public void searchAndFoundTensiElektrik(){
        homePage.validateTensiElektrik();
    }

    @And("I click \"Beli\"")
    public void clickBeli(){
        homePage.clickBuyTensiElektrik();
    }

    @Then("The product \"Tensi Darah Elektrik\" was added to cart")
    public void productTensiElektrikWasAddedToCart(){
        homePage.validateIncreaseItemCart();
    }

    @Given("I am on Landing_Pagee")
    public void onLandingPageee(){
        homePage.onPageHomeee();
    }

    @When("I search and found product \"Kamera\"")
    public void searchAndFoundProductKamera(){
        homePage.findProductKamera();
    }

    @And("I click button \"DETAIL\"")
    public void clickButtonDetail(){
        homePage.clickButtonDetail();
    }

    @Then("Display product detail page")
    public void displayProductDetailPage(){
        homePage.validateOnDetailPageKamera();
    }
}
