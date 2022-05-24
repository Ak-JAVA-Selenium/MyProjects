package a1_Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class a2_vTiger_Login {

	public static void main(String[] args) throws InterruptedException {

		String path = ".\\Drivers\\geckodriver.exe";

		System.setProperty("webdriver.gecko.driver", path);

		WebDriver driver = new FirefoxDriver();

//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");

		WebElement inputUsername = driver.findElement(By.id("username"));
		inputUsername.clear();
		inputUsername.sendKeys("admin");

		WebElement inputPassword = driver.findElement(By.name("password"));
		inputPassword.clear();
		inputPassword.sendKeys("Test@123");

		WebElement LoginButton = driver.findElement(By.tagName("button"));
		LoginButton.click();

		Thread.sleep(3000);
		WebElement UserButton = driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/nav[1]/div[1]/div[1]/div[4]/ul[1]/li[5]/div[1]/a[1]/span[1]"));
		UserButton.click();

		WebElement LogoutButton = driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT"));
		LogoutButton.click();

		driver.close();
	}
}
