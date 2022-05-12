package a2_Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.Get;

public class c1_Flipkart_MenuSubM {

	public static void main(String[] args) {

		WebDriver driver = Get.setUp("chrome", "https://www.flipkart.com/");
		Actions act = new Actions(driver);

		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		List<WebElement> menu = driver.findElements(By.xpath("//div[@class='xtXmba']"));

		for (int i = 0; i < menu.size(); i++) {
			System.out.println((i + 1) + "." + menu.get(i).getText());
			act.moveToElement(menu.get(i)).build().perform();
			List<WebElement> submenu = driver.findElements(By.xpath("//div[@class='_3XS_gI _7qr1OC']/a"));
			if (submenu.size() > 0) {
				for (int j = 0; j < submenu.size(); j++) {
					System.out.println("	" + (j + 1) + "-" + submenu.get(j).getText());
					
					act.moveToElement(submenu.get(j)).build().perform();
					List<WebElement> sub_submenu = driver.findElements(By.xpath("//div[@class='_3XS_gI']/a"));
			//		System.out.println("======="+submenu.size());
					if (sub_submenu.size() > 0) {
						for (int k = 0; k < sub_submenu.size(); k++) {
							System.out.println("		" + (k + 1) + "_" + sub_submenu.get(k).getText());
						//	System.out.println("======="+sub_submenu.size());
						}
					}
				}
			}
		}
		driver.close();
	}

}
