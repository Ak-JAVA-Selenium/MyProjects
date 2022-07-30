package WikipediaPOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utility.SeleniumUtility;

public class OperationsWikipedia extends SeleniumUtility {
	WebDriver driver;

	public OperationsWikipedia(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "searchInput")
	private WebElement search;

	@FindBy(id = "searchButton")
	private WebElement searchButton;

	public void getWikiMainPage(String url) {
		driver.get(url);
	}

	public void serchMovie(String moviename) {
		search.sendKeys(moviename);
		searchButton.click();
	}

	public String getMoviePageTitle() {
		return driver.getTitle();
	}

	public String getMovieDetails(String getDetail) {
		String detail = "";
		List<WebElement> list = driver.findElements(By.xpath("//table[@class='infobox vevent']//tr//th"));
		for (int i = 0; i < list.size(); i++) {
			String actual = list.get(i).getText();
			if (getDetail.equalsIgnoreCase(actual)) {
				detail = driver.findElement(By.xpath("//table[@class='infobox vevent']//tr[" + (i + 2) + "]//td"))
						.getText();
			}
		}
		return detail;
	}
}
