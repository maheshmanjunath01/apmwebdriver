package qsp;

import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoI {

	public static void main(String[] args) {
		//to check whether the listbox is in sorted array or not
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		DemoH demo = new DemoH();
		WebElement monthName = driver.findElement(By.id("month"));
		ArrayList<String> allMonth= demo.allTextFromListBox(monthName);
		ArrayList<String> checkMonth = new ArrayList<String>(allMonth);
		Collections.sort(allMonth);
		if(allMonth.equals(checkMonth)){
			System.out.println("Sorted");
		}
		else{
			System.out.println("Not Sorted");
		}
		//to check whether the specified month is present in list or not
		String value = "Nov";
		if(checkMonth.contains(value)){
			System.out.println("Month is Present");
		}
		else{
			System.out.println("Month is not Present");
		}
		driver.quit();
	}

}
