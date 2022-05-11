package pages;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import net.thucydides.core.pages.PageObject;


public class HomePage extends PageObject {
    private By clickButtonSignin(){
        return By.cssSelector("#app > div > header > div > button:nth-child(4) > span > i");
    }

    private By title(){
        return By.id("input-1030");
    }

    private By productTensiElektrik(){
        return By.cssSelector("#\\33 68 > div > div.v-card__title.product-title");
    }

    private By buttonBuyTensiElektrik(){
        return By.cssSelector("#\\33 68 > div > div.v-card__actions.d-block > div.mt-3 > button.button-beli.ml-3.v-btn.v-btn--outlined.theme--light.v-size--small.primary--text");
    }

    private By increaseItemInCart(){
        return By.cssSelector("#app > div > header > div > button:nth-child(3) > span > span > span > span");
    }

    private By foundProductKamera(){
        return By.cssSelector("#\\33 89 > div > div.v-card__title.product-title");
    }

    private By buttonDetail(){
        return By.cssSelector("#\\33 89 > div > div.v-card__actions.d-block > div.mt-3 > button:nth-child(1)");
    }

    private By detailKamera(){
        return By.cssSelector("#app > div > main > div > div > div > div > p.text-h4.text--primary");
    }

    private By categoryMenu(){
        return By.cssSelector("#input-476");
    }

    private By categoryKesehatan(){
        return By.cssSelector("#list-item-745-0 > div > div");
    }
    private By categoryAlat(){
        return By.xpath("//*[@id=\"list-item-745-2\"]/div/div");
    }

    private By alertEmpty(){
        return By.cssSelector("#app > div.v-application--wrap > main > div > div > div.v-alert.v-sheet.theme--light.elevation-2.v-alert--border.v-alert--border-top > div > div.v-alert__content");
    }
    private By alertCanNotGetProduct(){
        return By.cssSelector("#app > div.v-application--wrap > main > div > div > div.v-alert.v-sheet.theme--light.elevation-2.v-alert--border.v-alert--border-top > div > div.v-alert__content");
    }

    private By iconCart(){
        return By.cssSelector("#app > div > header > div > button:nth-child(3) > span > span > i");
    }


    @Step
    public void openSigninPage(){
        $(clickButtonSignin()).click();
    }

    @Step
    public void onPageHomee(){
        $(title()).isDisplayed();
    }

    @Step
    public void validateTensiElektrik(){
        $(productTensiElektrik()).isDisplayed();
    }

    @Step
    public void clickBuyTensiElektrik(){
        $(buttonBuyTensiElektrik()).isDisplayed();
    }

    @Step
    public void validateIncreaseItemCart(){
        $(increaseItemInCart()).isDisplayed();
    }

    @Step
    public void onPageHomeee(){
        $(title()).isDisplayed();
    }

    @Step
    public void findProductKamera(){
        $(foundProductKamera()).isDisplayed();
    }

    @Step
    public void clickButtonDetail(){
        $(buttonDetail()).click();
    }

    @Step
    public void validateOnDetailPageKamera(){
        $(detailKamera()).isDisplayed();
    }

    @Step
    public void clickMenuCategory(){
        $(categoryMenu()).click();
    }
    @Step
    public void clickCategoryKesehatan(){
        $(categoryKesehatan()).click();
    }
    @Step
    public void showAlertEmpty(){
        $(alertEmpty()).isDisplayed();
    }

    @Step
    public void clickCategoryAlat(){
        $(categoryAlat()).click();
    }
    @Step
    public void showAlertCantGetProduct(){
        $(alertCanNotGetProduct()).isDisplayed();
    }

    @Step
    public void clickIconCart(){
        $(iconCart()).click();
    }
}
