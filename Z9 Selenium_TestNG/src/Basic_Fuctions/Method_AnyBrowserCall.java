package Basic_Fuctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Method_AnyBrowserCall {
	static WebDriver ref;

	static void browser(String BrowserName) {
		if (BrowserName.equalsIgnoreCase("chrome")) {
			String path = "./Drivers/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);
			ref = new ChromeDriver();
		} else if (BrowserName.equalsIgnoreCase("firefox")) {
			String path = ".\\Drivers\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", path);
			ref = new FirefoxDriver();
		} else if (BrowserName.equalsIgnoreCase("edge")) {
			String path = ".\\Drivers\\msedgedriver.exe";
			System.setProperty("webdriver.edge.driver", path);
			ref = new EdgeDriver();
		}
		ref.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void main(String[] args) throws Throwable {

		Method_AnyBrowserCall.browser("chrome");
		Thread.sleep(3000);
		ref.close();
		Method_AnyBrowserCall.browser("firefox");
		Thread.sleep(3000);
		ref.close();
		Method_AnyBrowserCall.browser("edge");
		Thread.sleep(3000);
		ref.close();
	}
}
