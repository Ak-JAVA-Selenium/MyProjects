package IMDB_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OperationsIMDB {

	WebDriver driver;

	public OperationsIMDB(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(id = "suggestion-search")
	private WebElement search;
	
	@FindBy(xpath = "//td//a[contains(text(),'India')]//parent::td//following-sibling::td[1]")
	private WebElement countryReleaseDate;
	
	public void getIMDbMainPage(String url) {
		driver.get(url);
	}
	
	public void serchMovie(String moviename) {
		search.sendKeys(moviename);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		search.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	}
	
	public String getMoviePageTitle() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver.getTitle();
	}
	
	public String getMovieReleaseDate(String getDetail) {
		driver.findElement(By.xpath("//a[contains(text(),'"+getDetail+"')]//parent::li//following-sibling::div//ul//li//a")).click();
		String releaseDate = countryReleaseDate.getText();
		driver.navigate().back();
		return releaseDate;
	}
	
	public String getMovieRegion(String getDetail) {
		String region =driver.findElement(By.xpath("//span[contains(text(),'"+getDetail+"')]//ancestor::li//a")).getText();
		return region;
	}
}
