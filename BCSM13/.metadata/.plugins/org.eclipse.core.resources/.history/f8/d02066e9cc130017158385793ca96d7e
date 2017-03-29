package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import generic.BasePage;

public class LoginPage extends BasePage{

	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwdTB;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBtn;
	
	@FindBy(xpath="//span[.='Username or Password is invalid. Please try again.']")
	private WebElement errMsg;
	
	@FindBy(id="logoutLink")
	private WebElement logoutBtn;
	
	@FindBy(xpath="(//div[@class='popup_menu_arrow'])[last()]")
	private WebElement helpLink;
	
	@FindBy(xpath="//a[.='About your actiTIME']")
	private WebElement aboutLink;
	
	@FindBy(xpath="//span[.='actiTIME 2017 Online']")
	private WebElement prodVersion;
	
	@FindBy(xpath="//img[@title='Close']")
	private WebElement closeBtn;
	
	public void setUserName(String username){
		unTB.sendKeys(username);
	}
	
	public void setPassword(String password){
		pwdTB.sendKeys(password);
	}
	
	public void clickLogin(){
		loginBtn.click();
	}
	
	public void clickLogout(){
		logoutBtn.click();
	}
	
	public void verifyErrorMessageIsPresent(){
		verifyElementIsPresent(errMsg);
	}
	
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
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	

}
