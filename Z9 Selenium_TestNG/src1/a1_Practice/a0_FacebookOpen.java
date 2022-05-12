package a1_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class a0_FacebookOpen {
	static WebDriver driver;

	static void browser(String BrowserName) {
		if (BrowserName.equalsIgnoreCase("chrome")) {
			String path = ".\\Drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);
			driver = new ChromeDriver();
		} else if (BrowserName.equalsIgnoreCase("firefox")) {
			String path = ".\\Drivers\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", path);
			driver = new FirefoxDriver();
		} else if (BrowserName.equalsIgnoreCase("edge")) {
			String path = ".\\Drivers\\msedgedriver.exe";
			System.setProperty("webdriver.edge.driver", path);
			driver = new EdgeDriver();
		}
	}

	public static void main(String[] args) throws InterruptedException {

		String title = "Facebook – log in or sign up";
		a0_FacebookOpen.browser("chrome");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/");
		System.out.println("TITLE : " + driver.getTitle());
		System.out.println("URL : " + driver.getCurrentUrl());
		System.out.println("Source Length : " + driver.getPageSource().length());
		System.out.println(title.equals(driver.getTitle()));
		Thread.sleep(3000);
		driver.close();
	}
}
