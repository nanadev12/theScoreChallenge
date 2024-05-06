package com.theScore.test;

import org.testng.Assert;
import org.testng.annotations.Test;



public class TheScoreTest extends DriverManager {

	@Test
	public void testTheScoreApp() {
		try {

     
 
                    
             getStarted.clickGetStarted();
             favoriteLeague.clickOnSport();
             favoriteLeague.clickContinueButton();
             favoriteTeamPage.clickOnSportTeam();
             favoriteLeague.clickContinueButton();
             favoriteLeague.clickContinueButton();
             favoriteLeague.clickOnNotification();
             favoriteTeamInfo.clickOnWSHTeam();
             Assert.assertTrue(favoriteTeamInfo.verifyWSHTeamName());
             favoriteTeamInfo.clickOnWSHStats();
             Assert.assertTrue(favoriteTeamInfo.verifyOffenseStatsText());
             favoriteTeamInfo.clickBackButton();
             
             
             
             
             
             

	

		
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
