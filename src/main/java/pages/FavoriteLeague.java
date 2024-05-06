package pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;

public class FavoriteLeague {
    AppiumDriver driver;

    public FavoriteLeague(AppiumDriver driver) {
        this.driver = driver;
    }


    public static By NFL_FOOTBALL = By.xpath("//android.widget.TextView[@text='NFL Football']");
    public static By CONTINUE = By.xpath("//android.widget.TextView[@text='Continue']");
    public static By MAYBE_LATER = By.xpath("//android.widget.TextView[@text='Maybe Later']");
    public static By OK_GOT_IT = By.xpath("//android.widget.TextView[@text='Ok, Got It']");


    public void clickOnSport() {
        driver.findElement(NFL_FOOTBALL).click();
    }
  public void clickOnOkGotIt() {
        driver.findElement(OK_GOT_IT).click();
    }


    public void clickContinueButton() {
        driver.findElement(CONTINUE).click();
    }

    public void clickOnNotification() {
        driver.findElement(MAYBE_LATER).click();
    }
}
