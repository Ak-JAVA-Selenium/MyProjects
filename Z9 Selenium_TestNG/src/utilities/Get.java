package utilities;

import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Get {

	@BeforeMethod
	public static WebDriver setUp(String browserName, String appUrl) {
		WebDriver driver = null;
		if (browserName.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {

			WebDriverManager.edgedriver().setup();

			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().window().setPosition(new Point(0, 0));
		driver.manage().window().setSize(new Dimension(1000, 720));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(appUrl);
		return driver;
	}
}
