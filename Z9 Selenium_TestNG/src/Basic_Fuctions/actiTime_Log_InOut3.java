package Basic_Fuctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actiTime_Log_InOut3 {

	public static void main(String[] args) {

		String driverPath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverPath);

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://demo.actitime.com/login.do");

		String expectedTitle = "actiTIME - Login";
		String actualTitle = driver.getTitle();
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Login page opened sucessfully...");
		} else {
			System.out.println("Either login page not opened or page title got changed");
		}

		driver.findElement(By.id("username")).sendKeys("admin");

		driver.findElement(By.name("pwd")).sendKeys("manager");

		driver.findElement(By.id("loginButton")).click();

		WebElement logoutButton = driver.findElement(By.id("logoutLink"));
		// explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(logoutButton));

		String actaulHomePageTitle = driver.getTitle();
		String expectedHomePageTitle = "actiTIME - Enter Time-Track";
		if (actaulHomePageTitle.equals(expectedHomePageTitle)) {
			System.out.println("Login is successfull and home page title is also varified..");
		} else {
			System.out.println("Either Login is failed or home page title is changed");
		}

		driver.findElement(By.id("logoutLink")).click();

		driver.close();
	}
}
