package a2_Assignment;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Point;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class b2_gsmarena_PageLinks {

	public static void main(String[] args) throws InterruptedException {

		String path = System.getProperty("user.dir") + "/Drivers/geckodriver.exe";

		System.setProperty("webdriver.gecko.driver", path);

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.manage().window().setPosition(new Point(0, 0));;

		driver.manage().window().setSize(new Dimension(1000, 700));;

//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//		WebDriverWait wait = new WebDriverWait(driver, 20);

//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("https://www.gsmarena.com/");
		System.out.println("=============================");

		String Url = "https://www.gsmarena.com/";
		System.out.println("Is HomePage url verified : " + driver.getCurrentUrl().equals(Url));

		String title = "GSMArena.com - mobile phone reviews, news, specifications and more...";
		System.out.println("Is HomePage title verified : " + driver.getTitle().equals(title));

//		Thread.sleep(3000);
		WebElement realme = driver.findElement(By.cssSelector("a[href='realme-phones-118.php']"));
//		wait.until(ExpectedConditions.elementToBeClickable(realme));
		realme.click();

//		Thread.sleep(3000);
		WebElement page = driver.findElement(By.cssSelector("div#wrapper>div>div#body>div>:nth-child(4)>div.nav-pages"));
//		wait.until(ExpectedConditions.elementToBeClickable(page));
		System.out.println(page.getText());
		String p1url = driver.getCurrentUrl();
		String p1urlactl = "https://www.gsmarena.com/realme-phones-118.php";
		System.out.println("Page-1 url : \n" + p1url);

		if (p1url.equals(p1urlactl)) {
			System.out.println("URL verified===");
		} else {
			System.out.println("Wrong URL***");
		}

//		Thread.sleep(3000);
		WebElement p2 = driver.findElement(By.cssSelector("div[class='nav-pages']>:nth-child(3)"));
//		wait.until(ExpectedConditions.elementToBeClickable(p2));
		p2.click();
		String p1ur2 = driver.getCurrentUrl();
		String p1ur2actl = "https://www.gsmarena.com/realme-phones-f-118-0-p2.php";
		System.out.println("Page-2 url : \n" + p1ur2);

		if (p1ur2.equals(p1ur2actl)) {
			System.out.println("URL verified===");
		} else {
			System.out.println("Wrong URL***");
		}

//		Thread.sleep(3000);
		WebElement p3 = driver.findElement(By.cssSelector("div[class='nav-pages']>:last-child"));
//		wait.until(ExpectedConditions.elementToBeClickable(p3));
		p3.click();
		String p1ur3 = driver.getCurrentUrl();
		String p1ur3actl = "https://www.gsmarena.com/realme-phones-f-118-0-p3.php";
		System.out.println("Page-3 url : \n" + p1ur3);

		if (p1ur3.equals(p1ur3actl)) {
			System.out.println("URL verified===");
		} else {
			System.out.println("Wrong URL***");
		}

//		Thread.sleep(3000);
		driver.close();

	}
}