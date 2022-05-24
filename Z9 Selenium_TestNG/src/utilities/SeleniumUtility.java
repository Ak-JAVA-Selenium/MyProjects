package utilities;

import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumUtility {

	@BeforeMethod
	public WebDriver setUp(String browserName, String appUrl) {
		
		WebDriver driver = null;
		if (browserName.equalsIgnoreCase("Chrome")) {
			// use setup method of WebDriverManager
			WebDriverManager.chromedriver().setup();
			// step2: create an instance of Chrome Browser
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			// use setup method of WebDriverManager
			WebDriverManager.iedriver().setup();
			// step2: create an instance of Chrome Browser
			driver = new InternetExplorerDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			// use setup method of WebDriverManager
			WebDriverManager.firefoxdriver().setup();
			// step2: create an instance of Chrome Browser
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		// maximize browser
		driver.manage().window().setPosition(new Point(0, 0));
		driver.manage().window().setSize(new Dimension(1000, 720));
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(appUrl);
		return driver;
	}
}
