package a2_Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.Get;

public class b9_AutoMatnTesting {

	public static void main(String[] args) {

		WebDriver driver = Get.setUp("chrome", "http://demo.automationtesting.in/Register.html");
		Actions act = new Actions(driver);

		List<WebElement> menu = driver.findElements(By.xpath("//ul[@class='nav navbar-nav']/li/a"));

		for (int i = 0; i < menu.size(); i++) {
			System.out.println((i + 1) + "." + menu.get(i).getText());
			act.moveToElement(menu.get(i)).build().perform();
			List<WebElement> submenu = driver
					.findElements(By.xpath("//ul[@class='nav navbar-nav']/li[" + (i + 1) + "]/ul/li/a"));
			if (submenu.size() > 0) {
				for (int j = 0; j < submenu.size(); j++) {
					System.out.println("  " + (j + 1) + "." + submenu.get(j).getText());
				}
			}
		}
		driver.close();
	}
}
