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
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	

}
