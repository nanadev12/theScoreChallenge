package core;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


import org.testng.annotations.BeforeMethod;
import pages.FavoriteLeague;
import pages.FavoriteTeamInfo;
import pages.FavoriteTeamPage;
import pages.GetStartedPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import utils.PropertiesUtil;

public class DriverManager {
    public GetStartedPage getStarted;
    public FavoriteLeague favoriteLeague;
    public FavoriteTeamPage favoriteTeamPage;
    public FavoriteTeamInfo favoriteTeamInfo;


    AppiumDriver driver;

    @BeforeMethod
    public void setup() throws IOException,MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        final URL url = new URL(PropertiesUtil.getData("server"));
        options.setDeviceName("androidtestdevice");
        options.setAppPackage(PropertiesUtil.getData("appPackage"));
        options.setAppActivity(PropertiesUtil.getData("appActivity"));
        options.setAutoGrantPermissions(true);
        options.setAutomationName("UiAutomator2");
        options.setPlatformName("Android");
        options.setNoReset(false);
        options.setPlatformVersion(PropertiesUtil.getData("platformVersion"));
        driver = new AndroidDriver(url, options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        getStarted = new GetStartedPage(driver);
        favoriteLeague = new FavoriteLeague(driver);
        favoriteTeamPage = new FavoriteTeamPage(driver);
        favoriteTeamInfo = new FavoriteTeamInfo(driver);


    }
}
