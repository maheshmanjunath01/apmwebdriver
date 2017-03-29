package script;


import org.testng.annotations.Test;

import generic.BaseTest;
import pom.LoginPage;
import pom.TimeTrackPage;

public class Test_Case_03 extends BaseTest{

	@Test
	public void verifyProductVersion(){
		
		LoginPage login = new LoginPage(driver);
		login.setUserName(UserName);
		login.setPassword(PassWord);
		login.clickLogin();
		TimeTrackPage track = new TimeTrackPage(driver);
		track.clickHelp();
		track.clickAbout();
		track.verifyProductVersion("actiTIME 2017 Online");
		track.clickCloseBtn();
		login.clickLogout();
	}
	

}
