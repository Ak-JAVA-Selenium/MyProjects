package a2_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class a4_actiTime_Login {

	public static void main(String[] args) throws InterruptedException {

		String path = System.getProperty("user.dir") + "/Drivers/chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", path);

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.actitime.com/login.do");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, 20);

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.findElement(By.cssSelector("td[valign='middle']>*#username")).sendKeys("admin");

		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");

		WebElement checkBox = driver.findElement(By.cssSelector("input[id='keepLoggedInCheckBox']"));

		checkBox.click();

		System.out.println("Check Box Selected : " + checkBox.isSelected());
		Thread.sleep(3000);

		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[id='loginButton']")));

		driver.findElement(By.cssSelector("a[id='loginButton']")).click();

		Thread.sleep(3000);
		System.out.println("After Login Home Page Title : " + driver.getTitle() + "\nTitle Length : "
				+ driver.getTitle().length());

		Thread.sleep(3000);
		driver.findElement(By.id("logoutLink")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
