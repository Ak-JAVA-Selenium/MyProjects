package a1_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class a3_Demosite_Login {

	public static void main(String[] args) throws InterruptedException {

		String path = ".\\Drivers\\geckodriver.exe";

		System.setProperty("webdriver.gecko.driver", path);

		WebDriver driver = new FirefoxDriver();

//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://demosite.executeautomation.com/Login.html");
		
		driver.findElement(By.name("UserName")).sendKeys("execution");
		
		driver.findElement(By.name("Password")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		Thread.sleep(3000);
		driver.quit();
	}
}