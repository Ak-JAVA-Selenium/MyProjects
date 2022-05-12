package a2_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class a5_demositeLogin {

	public static void main(String[] args) throws InterruptedException {

		String path = System.getProperty("user.dir") + "/Drivers/chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", path);

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, 20);

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("https://demosite.executeautomation.com/Login.html");

		System.out.println("Title : " + driver.getTitle() + "\nTitle length : " + driver.getTitle().length());

		System.out.println(
				"Current URL : " + driver.getCurrentUrl() + "\nURL length : " + driver.getCurrentUrl().length());

		driver.findElement(By.cssSelector("input[name='UserName']")).sendKeys("execution");

		driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("admin");

		driver.findElement(By.cssSelector("input[name='Login']")).click();

		System.out.println(
				"Title HomePage : " + driver.getTitle() + "\nHomePage Title length : " + driver.getTitle().length());

		System.out.println("HomePage URL : " + driver.getCurrentUrl() + "\nHomePage URL length : "
				+ driver.getCurrentUrl().length());

		driver.findElement(By.cssSelector("*[href='Login.html']")).click();

		Thread.sleep(3000);

		driver.close();
	}
}
