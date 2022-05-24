package a1_Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class a4_FlipkartOptions {

	public static void main(String[] args) throws InterruptedException {

		String path = System.getProperty("user.dir") + "./Drivers/chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", path);

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, 20);

		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(1000, 700));
		driver.manage().window().maximize();
		driver.manage().window().setPosition(new Point(400, 10));
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("._2QfC02>._2KpZ6l._2doB4z")));

		WebElement pop = driver.findElement(By.cssSelector("._2QfC02>._2KpZ6l._2doB4z"));
		wait.until(ExpectedConditions.elementToBeClickable(pop));
		pop.click();

		String ActlURL = "https://www.flipkart.com/";
		String CtURL = driver.getCurrentUrl();
		if (ActlURL.equals(CtURL)) {
			System.out.println("URL Open successfully..");
		} else {
			System.out.println("URL is incorrect..");
		}

		String ActlTag = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		String CtTag = driver.getTitle();
		if (ActlTag.equals(CtTag)) {
			System.out.println("Page Open successfully..\nTitle : " + CtTag + driver.getTitle() + "\nTitle Length : "
					+ CtTag.length());
		} else {
			System.out.println("Page Title is incorrect..");
		}

		Thread.sleep(500);
		WebElement LoginB = driver.findElement(By.cssSelector("._1_3w1N"));
		wait.until(ExpectedConditions.elementToBeClickable(LoginB));
		LoginB.click();

		Thread.sleep(500);
		driver.findElement(By.linkText("New to Flipkart? Create an account")).click();

		Thread.sleep(500);
		WebElement pop2 = driver.findElement(By.cssSelector("._2KpZ6l._2doB4z"));
		wait.until(ExpectedConditions.elementToBeClickable(pop2));
		pop2.click();

		Thread.sleep(500);
		WebElement Cart = driver.findElement(By.cssSelector(".V3C5bO"));
		wait.until(ExpectedConditions.elementToBeClickable(Cart));
		Cart.click();

		Thread.sleep(500);
		driver.navigate().back();
		Thread.sleep(500);
		driver.navigate().forward();
		Thread.sleep(500);
		driver.navigate().back();
		Thread.sleep(500);
		driver.navigate().refresh();

		WebElement categories = driver.findElement(By.cssSelector(".eFQ30H>*:nth-child(1)"));
		System.out.println(categories.isDisplayed());
		System.out.println(categories.isEnabled());
		System.out.println(categories.getText());
		System.out.println("================================");

//		List<WebElement> menu = driver.findElements(By.cssSelector(".eFQ30H>a"));
		List<WebElement> menu = driver.findElements(By.className("eFQ30H"));
		System.out.println("Option count is: " + menu.size());

		for (int i = 0; i < menu.size(); i++) {
			WebElement ref = menu.get(i);
			System.out.println("Option is: " + ref.getText());
			System.out.println(ref.isDisplayed());
			System.out.println(ref.isEnabled());
			System.out.println();
		}

		driver.navigate().to("https://www.demoblaze.com/");
		Thread.sleep(1000);
		driver.close();
		System.out.println("End.....wM6W7d.......");
	}
}
