package pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import org.testng.Assert;

public class FavoriteTeamPage {
    AppiumDriver driver;

    public FavoriteTeamPage(AppiumDriver driver) {
        this.driver = driver;
    }


    public static By WASHINGTON_COMANDERS = By.xpath("//android.widget.TextView[@text='Washington Commanders']");

    public void clickOnSportTeam() {
        driver.findElement(WASHINGTON_COMANDERS).click();
    }

    public void verifyTeamIsDisplayed(boolean isDisplayed) {
        Assert.assertTrue(isDisplayed);
    }

    public void verifyOffenseStatIsDisplayed(boolean isDisplayed) {
        Assert.assertTrue(isDisplayed);
    }

}
