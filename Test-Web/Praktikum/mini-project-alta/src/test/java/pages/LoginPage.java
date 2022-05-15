package pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject{

    private By emailField(){
        return By.id("input-18");
    }

    private By passwordField(){
        return By.id("input-21");
    }

    private By loginButton(){
        return By.cssSelector("#app > div > main > div > div > div > div.v-card__text > form > div.text-center > button");
    }

    private By clickRegis(){
        return By.cssSelector("#app > div > main > div > div > div > div.v-card__text > div > a");
    }

    private By alertError(){
        return By.cssSelector("#app > div > main > div > div > div > div.v-card__text > div.v-alert.v-sheet.theme--light.elevation-2.v-alert--border.v-alert--border-top > div");
    }

    private By alertInvalid(){
        return By.cssSelector("#app > div > main > div > div > div > div.v-card__text > div.v-alert.v-sheet.theme--light.elevation-2.v-alert--border.v-alert--border-top > div > div.v-alert__content");
    }

    @Step
    public void validateOnLoginPage(){
        $(loginButton()).isDisplayed();
    }

    @Step
    public void inputEmail(String email){
        $(emailField()).type(email);
    }

    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton(){
        $(loginButton()).click();
    }

    @Step
    public void clickRegister(){
        $(clickRegis()).click();
    }

    @Step
    public void errorMessage(){
        $(alertError()).isDisplayed();
    }

    @Step
    public void showErrorInvalid(){
        $(alertInvalid()).isDisplayed();
    }

}
