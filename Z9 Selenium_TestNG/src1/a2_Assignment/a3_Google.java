package a2_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a3_Google {

	public static void main(String[] args) throws InterruptedException {

		String path = System.getProperty("user.dir") + "/Drivers/chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", path);

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://www.google.com/");

		System.out.println("Page Title : " + driver.getTitle() + "\nPage title length : " + driver.getTitle().length());

		System.out.println(
				"Current Page URL : " + driver.getCurrentUrl() + "\nURL lenngth : " + driver.getCurrentUrl().length());

		System.out.println("Page Source Length : " + driver.getPageSource().length());

		driver.close();
	}
}
