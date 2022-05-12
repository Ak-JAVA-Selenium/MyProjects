package a2_Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Get;

public class c6_Jqueryui_Frame {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Get.setUp("chrome", "https://jqueryui.com/sortable/");
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, 20);
		Actions act = new Actions(driver);

		act.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.PAGE_UP, Keys.PAGE_UP).perform();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		List<WebElement> drgdrp = driver.findElements(By.xpath("//ul[@id='sortable']/li"));
		System.out.println(drgdrp.size());
		int i = 0;
		while (drgdrp.size() > i) {
			System.out.println(drgdrp.get(i).getText());
			i++;
		}
		Thread.sleep(3000);

		for (int j = 1; j < drgdrp.size(); j++) {
			WebElement drg = driver.findElement(By.xpath("//body/ul[@id='sortable']/li[" + j + "]"));
			WebElement drp = driver.findElement(By.xpath("//body/ul[@id='sortable']/li["+drgdrp.size()+"]"));
			act.dragAndDrop(drp, drg).build().perform();
			Thread.sleep(3000);
		}
		driver.close();
	}
}