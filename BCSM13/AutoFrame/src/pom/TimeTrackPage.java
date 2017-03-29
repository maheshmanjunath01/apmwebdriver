package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import generic.BasePage;

public class TimeTrackPage extends BasePage{
	@FindBy(xpath="(//div[@class='popup_menu_arrow'])[last()]")
	private WebElement helpLink;
	
	@FindBy(xpath="//a[.='About your actiTIME']")
	private WebElement aboutLink;
	
	@FindBy(xpath="//span[.='actiTIME 2017 Online']")
	private WebElement prodVersion;
	
	@FindBy(xpath="//img[@title='Close']")
	private WebElement closeBtn;
	
	public void clickHelp(){
		helpLink.click();
	}
	
	public void clickAbout(){
		aboutLink.click();
	}
	
	public void verifyProductVersion(String eVersion){
		String aVersion=prodVersion.getText();
		Assert.assertEquals(aVersion, eVersion);
	}
	
	public void clickCloseBtn(){
		closeBtn.click();
	}

	public TimeTrackPage(WebDriver driver) {
		super(driver);
		
	}

}
