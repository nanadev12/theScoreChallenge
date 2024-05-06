package core;

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

public class DriverManager {
    public GetStartedPage getStarted;
    public FavoriteLeague favoriteLeague;
    public FavoriteTeamPage favoriteTeamPage;
    public FavoriteTeamInfo favoriteTeamInfo;


    AppiumDriver driver;

    @BeforeMethod
    public void setup() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        final URL url = new URL("http://127.0.0.1:4723");
        options.setDeviceName("androidtestdevice");
        options.setAppPackage("com.fivemobile.thescore");
        options.setAppActivity("com.fivemobile.thescore.ui.MainActivity");
        options.setAutoGrantPermissions(true);
        options.setAutomationName("UiAutomator2");
        options.setPlatformName("Android");
        options.setNoReset(false);
        options.setPlatformVersion("13");
        driver = new AndroidDriver(url, options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        getStarted = new GetStartedPage(driver);
        favoriteLeague = new FavoriteLeague(driver);
        favoriteTeamPage = new FavoriteTeamPage(driver);
        favoriteTeamInfo = new FavoriteTeamInfo(driver);


    }
}
