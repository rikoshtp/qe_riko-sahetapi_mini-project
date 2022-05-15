package pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class TransactionPage extends PageObject {
    private By transactionPage(){
        return By.cssSelector("#app > div > main > div > div > h1");
    }

    public void onTransactionPage(){
        $(transactionPage()).isDisplayed();
    }
}
