package pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;

public class GetStartedPage {
AppiumDriver driver;
	
	public GetStartedPage(AppiumDriver driver)
	{
		this.driver=driver;
	}
	
	public static By GETSTARTED=By.xpath("//android.widget.TextView[@text='Get Started']");
	
	public void clickGetStarted() 
	{
		driver.findElement(GETSTARTED).click();
	}
	

}
