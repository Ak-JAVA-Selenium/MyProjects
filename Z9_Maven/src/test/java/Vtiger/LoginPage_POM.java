package Vtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.MySeleniumUtility;

public class LoginPage_POM extends MySeleniumUtility {

	WebDriver driver;

	LoginPage_POM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(xpath = "//button[text()='Sign in']")
	private WebElement Sign_in;

	public DashboardPage_POM loginIntoVtiger(String userId, String pwd) {
		typeInput(username, userId);
		typeInput(password, pwd);
		clickOnElement(Sign_in);
		DashboardPage_POM obj = new DashboardPage_POM(driver);
		return obj;
	}
}
