package a2_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a6_Amazon {

	public static void main(String[] args) {

		String path = System.getProperty("user.dir") + "/Drivers/chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", path);

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("https://www.amazon.in/");

		System.out.println("Page title : " + driver.getTitle());

		String Url = driver.getCurrentUrl();

		System.out.println("Page URL : " + Url);

		driver.findElement(By.cssSelector("div[id='nav-xshop']>*:nth-child(3)")).click();

		System.out
				.println("Next Page Title : " + driver.getTitle() + "\nPage URL : " + driver.getCurrentUrl().length());

		driver.navigate().back();

		String UrlBack = driver.getCurrentUrl();

		if (Url.equals(UrlBack)) {
			System.out.println("After back to home page Url verified successfully....");
		} else {
			System.out.println("After back to home page Url verification failed....");
		}
		driver.close();
	}
}
