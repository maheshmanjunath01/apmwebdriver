package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements AutoConstants {

	public WebDriver driver;
	
	@BeforeMethod
	public void openApplication(){
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver = new ChromeDriver();
		driver.get(URL);
	}
	
	@AfterMethod
	public void closeApplication(){
		driver.close();
	}
	
}