package Basic_Fuctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTime_Log_InOut4 {

	public static void main(String[] args) throws InterruptedException {

		String driverPath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverPath);

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://demo.actitime.com/login.do");

		String expectedTitle = "actiTIME - Login";
		String actualTitle = driver.getTitle();// 0-30
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Login page opened sucessfully...");
		} else {
			System.out.println("Either login page not opened or page title got changed");
		}

		driver.findElement(By.id("username")).sendKeys("admin");

		driver.findElement(By.name("pwd")).sendKeys("manager");

		driver.findElement(By.id("loginButton")).click();

		// explicit wait -- hard coded wait
		Thread.sleep(2000);
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
