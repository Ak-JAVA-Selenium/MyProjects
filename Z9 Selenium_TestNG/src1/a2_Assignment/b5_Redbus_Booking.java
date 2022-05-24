package a2_Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Get;

public class b5_Redbus_Booking {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Get.setUp("chrome", "https://www.redbus.in/");

		WebDriverWait wait = new WebDriverWait(driver, 20);

		driver.findElement(By.cssSelector("#src")).sendKeys("Pune");

		driver.findElement(By.cssSelector("li[select-id='results[0]']")).click();

		driver.findElement(By.cssSelector("#dest")).sendKeys("Goa");

		driver.findElement(By.cssSelector("li[select-id='results[0]']")).click();

		driver.findElement(By.cssSelector(".db.text-trans-uc")).click();

		driver.findElement(By.cssSelector(".next")).click();

		driver.findElement(By.cssSelector(".rb-calendar>table>tbody>:nth-child(4)>:first-child")).click();

		driver.findElement(By.id("search_btn")).click();

		WebElement bb = driver.findElement(By.cssSelector(".dept-time.dt-time-filter>:nth-child(4)>:nth-child(2)"));
		wait.until(ExpectedConditions.elementToBeClickable(bb));
		bb.click();

		WebElement cc = driver.findElement(By.cssSelector(".list-chkbox>:nth-child(3)>:nth-child(2)"));
		wait.until(ExpectedConditions.elementToBeClickable(cc));
		cc.click();

		Thread.sleep(5000);

		WebElement element = driver.findElement(By.xpath("//body"));
		element.sendKeys(Keys.ESCAPE);
		for (int i = 0; i < 25; i++) {
			element.sendKeys(Keys.PAGE_DOWN);
			Thread.sleep(500);
		}

		List<WebElement> list1 = driver.findElements(By.cssSelector(".column-two.p-right-10.w-30.fl"));
		System.out.println("Buses Found : " + list1.size());

		for (int i = 0; i < list1.size(); i++) {
			String a2 = driver.findElements(By.cssSelector(".column-two.p-right-10.w-30.fl")).get(i).getText();
			String a3 = driver.findElements(By.cssSelector(".fare.d-block")).get(i).getText();
			System.out.println((i + 1) + "." + a2 + " : " + a3 + "\n");
		}
//		driver.close();
	}
}
