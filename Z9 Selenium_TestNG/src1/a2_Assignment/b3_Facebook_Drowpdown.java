package a2_Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class b3_Facebook_Drowpdown {

	public static void main(String[] args) throws InterruptedException {

		String path = System.getProperty("user.dir") + "/Drivers/chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", path);

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().window().setPosition(new Point(0, 0));

		driver.manage().window().setSize(new Dimension(1000, 730));

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, 20);

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("https://www.facebook.com/");

		String titleExptd = "Facebook – log in or sign up";

		String titleActl = driver.getTitle();

		if (titleExptd.equals(titleActl)) {
			System.out.println("\nTitle Verified : \n" + titleActl);
		} else {
			System.out.println("\nTitle Verification failed : \n" + titleActl);
		}

		String urlExptd = "https://www.facebook.com/";

		String urlActl = driver.getCurrentUrl();

		if (urlExptd.equals(urlActl)) {
			System.out.println("\nPage URL Verified : \n" + urlActl + "\n");
		} else {
			System.out.println("\nPage URL Verification failed : \n" + urlActl + "\n");
		}

		driver.findElement(By.cssSelector("a[id*='u_0_2_']")).click();

		driver.findElement(By.name("firstname")).sendKeys("Dhanraj");

		driver.findElement(By.name("lastname")).sendKeys("Shinde");

		driver.findElement(By.name("reg_email__")).sendKeys("9730907611");

		driver.findElement(By.name("reg_passwd__")).sendKeys("Revo@123");

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		Select daylist = new Select(day);
		Select monthlist = new Select(month);
		Select yearlist = new Select(year);

		List<WebElement> d = daylist.getOptions();
		List<WebElement> m = daylist.getOptions();
		List<WebElement> y = daylist.getOptions();

		System.out.println("Day selecter dropdown :");
		System.out.println("is visible : " + day.isDisplayed());
		System.out.println("is enable : " + day.isEnabled());
		System.out.println("is selected : " + day.isSelected());
		System.out.println("name : " + day.getAttribute("name"));
		System.out.println("is mutiselect : " + daylist.isMultiple());
		System.out.println("default value : " + daylist.getFirstSelectedOption().getText());
		System.out.println("total option count : " + d.size());
		daylist.selectByValue("3");
		System.out.println("updated value : " + daylist.getFirstSelectedOption().getText() + "\n");

		System.out.println("Month selecter dropdown :");
		System.out.println("is visible : " + month.isDisplayed());
		System.out.println("is enable : " + month.isEnabled());
		System.out.println("is selected : " + month.isSelected());
		System.out.println("name : " + month.getAttribute("name"));
		System.out.println("is mutiselect : " + monthlist.isMultiple());
		System.out.println("default value : " + monthlist.getFirstSelectedOption().getText());
		System.out.println("total option count : " + m.size());
		monthlist.selectByVisibleText("Jan");
		System.out.println("updated value : " + monthlist.getFirstSelectedOption().getText() + "\n");

		System.out.println("Year selecter dropdown :");
		System.out.println("is visible : " + year.isDisplayed());
		System.out.println("is enable : " + year.isEnabled());
		System.out.println("is selected : " + year.isSelected());
		System.out.println("name : " + year.getAttribute("name"));
		System.out.println("is mutiselect : " + yearlist.isMultiple());
		System.out.println("default value : " + yearlist.getFirstSelectedOption().getText());
		System.out.println("total option count : " + y.size());
		yearlist.selectByIndex(27);
		System.out.println("updated value : " + yearlist.getFirstSelectedOption().getText() + "\n");

		Thread.sleep(3000);
		driver.close();
	}
}
