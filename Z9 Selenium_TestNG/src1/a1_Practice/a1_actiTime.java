package a1_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class a1_actiTime {

	public static void main(String[] args) {

		String path = ".\\Drivers\\geckodriver.exe";

		System.setProperty("webdriver.gecko.driver", path);

		WebDriver driver = new FirefoxDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("Page URL : " + driver.getCurrentUrl());
		String CurrentURL = driver.getCurrentUrl();
		String expectedURL = "https://demo.actitime.com/login.do";
		if (CurrentURL.equals(expectedURL)) {
			System.out.println("Page URL is verified");
		}
		System.out.println("Page Title : " + driver.getTitle());
		System.out.println("Page Title  Length : " + driver.getTitle().length());
		String expectedTitle = "actiTIME - Login";
		String currentTitle = driver.getTitle();
		if (currentTitle.contentEquals(expectedTitle)) {
			System.out.println("Page Title is verified");
		}
		System.out.println("Page source length : " + driver.getPageSource().length());
		driver.close();
	}
}
