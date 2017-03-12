package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import sun.awt.image.PNGImageDecoder.Chromaticities;

public class DemoG {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///G:/QSpiders/DemoF.html");
		WebElement menu = driver.findElement(By.id("mtr"));
		Select select = new Select(menu);
		//to select all options and deselect all option in reverse order
		List<WebElement> option = select.getOptions();
		int count = option.size();
		System.out.println("No of options available:"+count);
		for(int i=0; i<count; i++){
			select.selectByIndex(i);
		}
		Thread.sleep(2000);
		for(int j=count-1;j>=0;j--){
			select.deselectByIndex(j);
		}
		//to print all available options
		for(int i=0; i<count;i++){
			 WebElement text = option.get(i);
			 System.out.println("Option "+i+":"+text.getText());
		}
		//to print all available options in reverse order
		for(int e=count-1;e>=0;e--){
			 WebElement text = option.get(e);
			 System.out.println("Option "+e+":"+text.getText());
		}
		//to select options by value
			select.selectByValue("a");
			select.selectByValue("b");
			select.selectByValue("d");
		}
		
	}

