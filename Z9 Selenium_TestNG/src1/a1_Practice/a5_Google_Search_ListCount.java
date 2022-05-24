package a1_Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class a5_Google_Search_ListCount {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		WebElement searchInputField = driver.findElement(By.name("q"));
		searchInputField.sendKeys("Selenium Testing");

//		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.wM6W7d")));
		// to identify multiple web elements
		List<WebElement> suggList = driver.findElements(By.cssSelector("div.wM6W7d"));

		// get the count of identify element
		int suggCount = suggList.size();
		System.out.println("Search results count : "+suggCount);
		// to access one by one list element
		for (int i = 0; i < suggCount; i++) {
			System.out.println(suggList.get(i).getText());
		}
		// close current browser
		driver.close();
	}
}
