package qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestA extends DemoJ{
	@Test
	public void testMain() {
		Reporter.log("Started Executing", true);
		openApplication();
		verifyTitle("Google");
		Reporter.log("Execution Complete", true);
		closeApplication();
	}
} 