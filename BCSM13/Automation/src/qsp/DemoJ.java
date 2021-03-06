package qsp;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class DemoJ {

	public WebDriver driver;
	public WebDriverWait wait;
	
	public void openApplication() {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");	
	driver = new ChromeDriver();
	driver.get("https://www.google.co.in/");
	}
	public void verifyTitle(String eTitle){
		
		String aTitle = driver.getTitle();
		//assertEquals(aTitle, eTitle);
		SoftAssert sA = new SoftAssert();
		sA.assertEquals(aTitle, eTitle);
		sA.assertAll();
	}
	public void closeApplication(){
		driver.quit();
	}
	
}