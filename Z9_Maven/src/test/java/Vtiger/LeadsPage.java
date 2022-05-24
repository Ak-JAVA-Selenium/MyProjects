package Vtiger;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.MySeleniumUtility;

public class LeadsPage extends MySeleniumUtility {

	WebDriver driver;
	DashboardPage_POM test1;

	LeadsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		test1 = new DashboardPage_POM(driver);
	}

	@FindBy(xpath = "//li//button//div[@class='fa fa-plus']")
	private WebElement AddButton;

	@FindBy(name = "firstname")
	private WebElement name;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement save;

	@FindBy(css = ".recordLabel.pushDown")
	private WebElement LeadName;
	
	@FindBy(xpath = "//strong[text()='Updates']")
	private WebElement update;
	
	public void createLead(String firstname, String lastname) {
		clickOnElement(AddButton);
		name.sendKeys(firstname, Keys.TAB, lastname);
		clickOnElement(save);
		String leadName = firstname + " " + lastname;
		Assert.assertEquals(firstname + " " + lastname, leadName, "Lead not created successfully");
	}

	public void updateLead(String firstname, String lastname) {
	}
}
