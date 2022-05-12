package a2_Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class a9_gsmarena_OptionCount {

	public static void main(String[] args) throws InterruptedException {

		String path = System.getProperty("user.dir") + "/Drivers/chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", path);

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, 20);

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("https://www.gsmarena.com/");

		WebElement pf = driver.findElement(By.cssSelector("a.pad-single.pad-finder"));
		System.out.println("Options From : " + pf.getText() + "\n");

		List<WebElement> option = driver.findElements(By.cssSelector(".brandmenu-v2.light.l-box.clearfix>ul>li"));

		for (int i = 0; i < option.size(); i++) {
			System.out.println("Brand " + (i + 1) + " : " + option.get(i).getText());
		}
		driver.close();
	}
}
