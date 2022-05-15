package pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import static org.hamcrest.CoreMatchers.is;

public class CartPage extends PageObject {
    private By buttonPlus(){
        return By.cssSelector("#order-370 > div.v-list-item__icon > button:nth-child(3)");
    }

    private By buttonMin(){
        return By.cssSelector("#order-370 > div.v-list-item__icon > button:nth-child(1)");
    }

    private By buttonBayar(){
        return By.cssSelector("#button-bayar");
    }

    private By quantityThree(){
        return By.cssSelector("#label-total-quantity");
    }

    private By quantityTwo(){
        return By.tagName("2");
    }

    @Step
    public void clickButtonPlus(){
        $(buttonPlus()).click();

    }

    @Step
    public void clickButtonMin(){
        $(buttonMin()).click();
    }

    @Step
    public void clickButtonBayar(){
        $(buttonBayar()).click();
    }
}
