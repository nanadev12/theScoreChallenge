package pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class FavoriteTeamInfo {
AppiumDriver driver;
	
	public FavoriteTeamInfo(AppiumDriver driver)
	{
		this.driver=driver;
	}
	
	public static By WSH = By.xpath("//android.widget.TextView[@text='WSH']");
	public static By WSHSTATS = By.xpath("//android.widget.TextView[@text='TEAM STATS']");
	public static By BACKBUTTON = AppiumBy.accessibilityId("Navigate up");
	public static By OFFENSESTATSHEADER = AppiumBy.androidUIAutomator("new UiSelector().text(\"OFFENSE STATS\")");
	//TODO:use String.format() to dynamically select favorite team
	public static By WSHTITLE = By.xpath("//android.widget.TextView[@text='Washington Commanders']");
	public static By FAVORITESNAVBARBUTTON = By.xpath("//android.widget.TextView[@text='Favorites]");
	
	public void clickOnWSHTeam() 
	{
		driver.findElement(WSH).click();
	}
	
	public void clickOnWSHStats ()
	{
		driver.findElement(WSHSTATS).click();
	}	
	
	public void clickBackButton() {
		driver.findElement(BACKBUTTON).click();
	}
	
	public boolean verifyOffenseStatsText() 
	{
		return driver.findElement(OFFENSESTATSHEADER).isDisplayed();
	}
	
	
	public boolean verifyWSHTeamName()
	{
		return driver.findElement(WSHTITLE).isDisplayed();
	}
	
	
	public boolean verifyFavoritesNavBar() 
	{
		return driver.findElement(FAVORITESNAVBARBUTTON).isDisplayed();
	}
	

}
