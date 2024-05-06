package com.theScore.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import org.testng.annotations.BeforeMethod;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

public class DriverManagerForIOS {
	AppiumDriver driver;

	@BeforeMethod
	public void setup() throws MalformedURLException {
		XCUITestOptions options = new XCUITestOptions();
		final URL url = new URL("http://127.0.0.1:4723");
		options.setDeviceName("iPhone 12 Pro");
		options.setCapability("udid", "00008101-001C04991186001E");
		options.setCapability("bundleId", "iphone.thescore.com");
		options.setAutomationName("xcuitest");
		options.setPlatformName("ios");
		options.setNoReset(false);
		options.setPlatformVersion("17.4.1");
		driver = new IOSDriver(url, options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}

}
