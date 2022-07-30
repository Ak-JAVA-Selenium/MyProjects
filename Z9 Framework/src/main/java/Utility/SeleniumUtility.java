package Utility;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumUtility {

	public WebDriver setUp(String browserName) {

		WebDriver driver = null;
		if (browserName.equalsIgnoreCase("Chrome")) {
			// use setup method of WebDriverManager
			WebDriverManager.chromedriver().setup();
			// step2: create an instance of Chrome Browser
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			// use setup method of WebDriverManager
			WebDriverManager.edgedriver().setup();
			// step2: create an instance of Chrome Browser
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			// use setup method of WebDriverManager
			WebDriverManager.firefoxdriver().setup();
			// step2: create an instance of Chrome Browser
			driver = new FirefoxDriver();
		}
		// maximize browser
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		return driver;
	}
}
