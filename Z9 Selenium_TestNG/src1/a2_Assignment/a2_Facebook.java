package a2_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a2_Facebook {

	public static void main(String[] args) {

		String path = System.getProperty("user.dir") + "/Drivers/chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", path);

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		String title = "Facebook – log in or sign up";

		if (title.equals(driver.getTitle())) {
			System.out.println(
					"Page Title is correct : " + driver.getTitle() + "\nTitle Length : " + driver.getTitle().length());
		} else {
			System.out.println("Page Title is incorrect : " + driver.getTitle() + "\nTitle Length : "
					+ driver.getTitle().length());
		}
		driver.findElement(By.linkText("Forgotten password?")).click();

		System.out
				.println("Forget Page Title : " + driver.getTitle() + "\nTitle Length : " + driver.getTitle().length());

		driver.close();
	}
}
