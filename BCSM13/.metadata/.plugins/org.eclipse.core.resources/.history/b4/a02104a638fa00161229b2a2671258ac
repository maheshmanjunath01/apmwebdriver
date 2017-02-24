package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoD {
	
	//public static String key="webdriver.gecko.driver";
	//public static String value="./Drivers/geckodriver.exe";
	public static String key="webdriver.chrome.driver";
	public static String value="./Drivers/chromedriver.exe";
	
	static{
		
		System.setProperty(key, value);
		//System.setProperty(key1, value1);
	}
	/*public static void testBrowser(WebDriver driver){
		driver.get("https://www.google.co.in");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String title=driver.getTitle();
		System.out.println(title);
		//String browser = driver.getTitle();
		System.out.println(driver);
		driver.quit();
	}*/
	
	public static void main(String[] args){
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
	/*	DemoD.testBrowser(driver);	
		DemoD.testBrowser(new ChromeDriver());
		*/
		driver.get("file:///G:/QSpiders/DemoD.html");
		
		
		/*WebElement ele=driver.findElement(By.tagName("a"));
		ele.click();*/
		
		//Ex1:Using tagName locator
		driver.findElement(By.tagName("a")).click();
		
		//Ex2:Using id locator
		driver.findElement(By.id("a2")).click();
		
		//Ex3:Using Name locator
		driver.findElement(By.name("n1")).click();
		
		//Ex4:Using ClassName locator
		driver.findElement(By.className("c1")).click();
		
		//Ex5:Using linkText locator
		driver.findElement(By.linkText("Google")).click();

		//Ex6:Using partialLinkText locator
		driver.findElement(By.partialLinkText("Go")).click();
		//driver.findElement(By.partialLinkText("Inbox")).click(); This can be an example considered from Gmail, 
		//where Inbox keep loaded with new emails
	}

}
