package a1_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a6_Rediff_SignUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");

		Thread.sleep(2000);

		driver.findElement(By.cssSelector("input[name^='name']")).sendKeys("Dhanraj Shinde" );

		driver.close();
	}
}
