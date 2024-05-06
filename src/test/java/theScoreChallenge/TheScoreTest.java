package theScoreChallenge;

import core.DriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TheScoreTest extends DriverManager {

    @Test
    public void testTheScoreApp() {
            getStarted.clickGetStarted();
            favoriteLeague.clickOnSport();
            favoriteLeague.clickContinueButton();
            favoriteTeamPage.clickOnSportTeam();
            favoriteLeague.clickContinueButton();
            favoriteLeague.clickContinueButton();
            favoriteLeague.clickOnNotification();
            favoriteLeague.clickOnOkGotIt();
            favoriteTeamInfo.clickOnWSHTeam();
            favoriteTeamPage.verifyTeamIsDisplayed(favoriteTeamInfo.verifyWSHTeamName());
            favoriteTeamInfo.clickOnWSHStats();
            favoriteTeamPage.verifyOffenseStatIsDisplayed(favoriteTeamInfo.verifyOffenseStatsText());
            favoriteTeamInfo.clickBackButton();
    }
}
