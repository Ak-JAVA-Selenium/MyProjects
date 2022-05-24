package a2_Assignment;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Get;

public class c7_etrain_Menu {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Get.setUp("chrome", "https://etrain.info/current-booking");
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		Actions act = new Actions(driver);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='transstn1']")).sendKeys("Pune", Keys.ARROW_DOWN, Keys.ENTER,
				Keys.TAB);
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("LTT", Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@class='pdlr5']/button")).click();

		List<WebElement> results = driver
				.findElements(By.xpath("//div[@id='lowerdata']/table/tbody/tr[@class='even']"));
		System.out.println("Results : " + results.size());

		for (int i = 0; i < results.size(); i++) {

			List<WebElement> result = driver
					.findElements(By.xpath("//div[@id='lowerdata']/table/tbody/tr[@class='even'][" + (i + 1)
							+ "]/td/div/table/tbody/tr[1]/td"));
			System.out.println();
			System.out.print((i + 1) + ".");

			for (int j = 0; j < result.size(); j++) {

				String res = driver.findElement(By.xpath("//div[@id='lowerdata']/table/tbody/tr[@class='even']["
						+ (i + 1) + "]/td/div/table/tbody/tr[1]/td[" + (j + 1) + "]")).getText();
				System.out.println(res);
			}
		}
		
	}
}
