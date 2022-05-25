package Vtiger_POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.MySeleniumUtility;

public class DashboardPage_POM extends MySeleniumUtility {

	WebDriver driver;
	
	DashboardPage_POM(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id='appnavigator']/div/span")
	private WebElement menu;
	
	@FindBy(xpath="//span[text()=' MARKETING']")
	private WebElement mkt; 
	
	@FindBy(xpath="//span[text()=' Leads']")
	private WebElement Leads;
	
	public LeadsPage selectLead() {
		clickOnElement(menu);
		clickOnElement(mkt);
		clickOnElement(Leads);
		LeadsPage obj = new LeadsPage(driver);
		return obj;
	}
}
