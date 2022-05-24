package a2_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class a1_actiTime {

	public static void main(String[] args) {

		String path = System.getProperty("user.dir") + "/Drivers/chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", path);

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://demo.actitime.com/login.do");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		System.out.println("Title : " + driver.getTitle() + "\nTitle Lenght : " + driver.getTitle().length());

		String url = "https://demo.actitime.com/login.do";

		if (url.equals(driver.getCurrentUrl())) {
			System.out.println("Page url is correct : " + driver.getCurrentUrl());
		} else {
			System.out.println("Page url is incorrect : " + driver.getCurrentUrl());
		}

		String PageSource = driver.getPageSource();

		System.out.println("Page Source Length : " + PageSource.length());

		driver.close();
	}
}
