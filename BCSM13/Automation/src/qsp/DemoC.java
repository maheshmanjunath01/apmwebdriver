package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///G:/QSpiders/DemoB.html");
		Thread.sleep(2000);
		driver.navigate().to("file:///G:/QSpiders/DemoC.html");
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.quit();
	}

}