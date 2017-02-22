package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DemoA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for chrome
		System.out.println("Selenium");
		String key="webdriver.chrome.driver";
		String value="./Drivers/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver = new ChromeDriver();
		driver.close();
		//for mozilla
		String keys="webdriver.gecko.driver";
		String values="./Drivers/geckodriver.exe";
		System.setProperty(keys, values);
		FirefoxDriver driverf = new FirefoxDriver();
		driverf.get("http://google.com");
		driverf.close();
	}

}
