package a2_Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.Get;

public class c2_CricInfo_Menu {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = Get.setUp("chrome", "https://www.espncricinfo.com/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);

		List<WebElement> menu = driver.findElements(By.xpath("//div[@class='ds-flex ds-flex-row']/div/a"));

		for (int i = 0; i < menu.size(); i++) {
			System.out.println((i + 1) + "." + menu.get(i).getText());
			act.moveToElement(menu.get(i)).build().perform();
			Thread.sleep(1000);
			List<WebElement> submenu = driver
					.findElements(By.xpath("//div[@class='tippy-content']/div/div/div/ul/li/a/span"));
			
			if (submenu.size() > 0) {
				for (int j = 0; j < submenu.size(); j++) {
					System.out.println("	" + (j + 1) + "." + submenu.get(j).getText());
				}
			}
		}
		driver.close();
	}

