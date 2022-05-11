package pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {
    private By onRegisPage(){
        return By.cssSelector("#app > div > main > div > div > div > div.v-card__title");
    }

    private By buttonRegister(){
        return By.cssSelector("#app > div > main > div > div > div > div.v-card__text > form > div.text-center > button > span");
    }

    private By namaField(){
        return By.id("input-401");
    }

    private By emailField(){
        return By.id("input-404");
    }

    private By passwordField(){
        return By.id("input-407");
    }

    private By errorRegister(){
        return By.cssSelector("#app > div > main > div > div > div > div.v-card__text > div.v-alert.v-sheet.theme--light.elevation-2.v-alert--border.v-alert--border-top > div > div.v-alert__content");
    }

    @Step
    public void validateOnRegisPage(){
        $(onRegisPage()).isDisplayed();
    }

    @Step
    public void inputNama(String nama){
        $(namaField()).type(nama);
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
    public void clickButtonRegis(){
        $(buttonRegister()).click();
    }

    @Step
    public void showErrorRegister(){
        $(errorRegister()).isDisplayed();
    }

}
