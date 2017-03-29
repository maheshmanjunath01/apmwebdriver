package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import pom.LoginPage;

public class Test_Case_02 extends BaseTest {
	@Test
	public void testInvalidLogin(){
		LoginPage login = new LoginPage(driver);
		login.setUserName("invalidUN");
		login.setPassword("invalidPWD");
		login.clickLogin();
		login.verifyErrorMessageIsPresent();
	}

}
