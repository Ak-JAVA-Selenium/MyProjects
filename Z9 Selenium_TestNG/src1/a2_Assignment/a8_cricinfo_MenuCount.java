package a2_Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class a8_cricinfo_MenuCount {

	public static void main(String[] args) {

		String path = System.getProperty("user.dir") + "/Drivers/chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", path);

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, 20);

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("https://www.espncricinfo.com/");

		List<WebElement> menu = driver.findElements(By.cssSelector(".ds-popper-wrapper>a"));

		System.out.println("Menu Count : " + menu.size());

		for (int i = 0; i < menu.size(); i++) {
			System.out.println("Menu " + (i + 1) + " : " + menu.get(i).getText());
		}
		driver.close();
	}
}
