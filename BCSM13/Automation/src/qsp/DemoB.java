package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///G:/QSpiders/DemoB.html");
//		driver.get("https://online.actitime.com/evry//login.do");
//		System.out.println(driver.getTitle());
//		driver.findElement(By.id("username")).sendKeys("ajithmanjunath01");
//		driver.findElement(By.name("pwd")).sendKeys("UQupEhag");
//		driver.findElement(By.xpath("//div[.='Login ']")).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		System.out.println(driver.getTitle());
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String src=driver.getPageSource();
		System.out.println(src);
		String title=driver.getTitle();
		System.out.println(title);
	}
}
