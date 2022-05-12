package a2_Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class b1_gsmarena_MobileNames {

	public static void main(String[] args) {

		String path = System.getProperty("user.dir") + "/Drivers/chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", path);

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, 20);

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("https://www.gsmarena.com/");
		System.out.println("=============================");

		WebElement realme = driver.findElement(By.cssSelector("a[href='realme-phones-118.php']"));
		wait.until(ExpectedConditions.elementToBeClickable(realme));
		realme.click();

		WebElement pf = driver.findElement(By.className("article-hgroup"));
		System.out.println("List of : " + pf.getText() + "\n");

		List<WebElement> option = driver.findElements(By.cssSelector("div#review-body>div>ul>li>a"));

		int i;
		for (i = 0; i < option.size(); i++) {
			System.out.println("Model " + (i + 1) + " : " + option.get(i).getText());
		}
		int k = i + 1;
		System.out.println("=============================");

		WebElement realme2 = driver.findElement(By.cssSelector("div[class='nav-pages']>:nth-child(3)"));
		wait.until(ExpectedConditions.elementToBeClickable(realme2));
		realme2.click();

		List<WebElement> option2 = driver.findElements(By.cssSelector("div[class='makers']>ul>li>a"));

		for (int j = 0; j < option2.size(); j++) {
			System.out.println("Model " + (k) + " : " + option2.get(j).getText());
			k++;
		}
		System.out.println("=============================");
		driver.close();
	}
}
