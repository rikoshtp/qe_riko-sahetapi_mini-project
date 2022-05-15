package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.automation.pages.HomeScreen;

public class ProductStep {
    @Steps
    HomeScreen homeScreen;

    @Given("I am on Product Screen")
    public void onProductScreen(){
        homeScreen.isPage();
    }

    @When("I Search and Found product")
    public void searchAndFoundProduct(){
        homeScreen.productMousePad();
    }

    @And("I click Beli")
    public void clickButtonBeli(){
        homeScreen.tapBeliMousePad();
    }
    @Then("The number of items in the Cart increases")
    public void numberItemCartIncreases(){
        homeScreen.showCartOne();
    }
}
