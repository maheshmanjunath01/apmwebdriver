package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Example for automating the FB login page using xpath
public class DemoE {
	public static String key="webdriver.chrome.driver";
	public static String value="./Drivers/chromedriver.exe";
	
	static{
		
		System.setProperty(key, value);
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String pgname=driver.getTitle();
		System.out.println(pgname);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Ajith");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("New");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		//driver.findElement(By.)
		//input[@name='firstname']
	
	}

}