package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class LoginScreen extends BasePageObject {
    private By fieldEmail(){
        return MobileBy.xpath("//android.view.View//android.widget.EditText[1]");
    }
    private By fieldPassword(){
        return MobileBy.xpath("//android.view.View//android.widget.EditText[2]");
    }
    private By buttonLogin(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    }

    @Step
    public void inputEmail(String email){
        onClick(fieldEmail());
        sendKeys(fieldEmail(), email);
    }

    @Step
    public void inputPassword(String pwd){
        onClick(fieldPassword());
        sendKeys(fieldPassword(), pwd);
    }

    @Step
    public void tapLoginButton(){
        onClick(buttonLogin());
    }

}
