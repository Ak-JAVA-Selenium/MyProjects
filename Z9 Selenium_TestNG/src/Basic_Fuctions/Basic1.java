package Basic_Fuctions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic1 {

	public static void main(String[] args) {

		/** step1: set driver executable path by using; */
		String path1 = System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe";
		// System.getProperty("user.dir")+Driver folder & file location.

		String path2 = ".\\Drivers\\msedgedriver.exe";
		// --> ".Driver folder & file location"

		String path3 = "C:\\Users\\kumbh\\git\\MyProjects\\Z9 Selenium_TestNG\\Drivers\\chromedriver.exe";
		// Properties --> path copy

		System.setProperty("webdriver.gecko.driver", path1);

		System.setProperty("webdriver.edge.driver", path2);

		System.setProperty("webdriver.chrome.driver", path3);

		/** step2: create an instance of Chrome Browser; */
		FirefoxDriver ref1 = new FirefoxDriver();

		ChromeDriver ref2 = new ChromeDriver();

		EdgeDriver ref3 = new EdgeDriver();

		ref1.close();
		ref2.close();
		ref3.close();
	}
}
