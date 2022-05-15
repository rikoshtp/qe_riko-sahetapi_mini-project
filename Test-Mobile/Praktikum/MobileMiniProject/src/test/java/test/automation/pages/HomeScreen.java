package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class HomeScreen extends BasePageObject {
    private By homePage(){
        return MobileBy.AccessibilityId("Products");
    }
    private By iconLogin(){
        return MobileBy.xpath("\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    }

    private By viewProduct(){
        return MobileBy.xpath("(//android.view.View[@content-desc])");
    }
    private By beliProduct(){
        return MobileBy.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[1]");
    }
    private By cartOne(){
        return MobileBy.xpath("//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button");
    }

    @Step
    public boolean isPage(){
        return waitUntilPresence(homePage()).isDisplayed();
    }

    @Step
    public void clickIconLogin(){
        onClick(iconLogin());
    }

    @Step
    public boolean productMousePad(){
        return waitUntilPresence(viewProduct()).isDisplayed();
    }

    @Step
    public void tapBeliMousePad(){
        onClick(beliProduct());
    }

    @Step
    public void showCartOne(){
        waitUntilVisible(cartOne()).isDisplayed();
    }
}
