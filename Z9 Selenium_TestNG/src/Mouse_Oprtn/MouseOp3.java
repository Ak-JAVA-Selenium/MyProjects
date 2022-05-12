package Mouse_Oprtn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.WrapsElement;

import utilities.SeleniumUtility;

public class MouseOp3 {

	public static void main(String[] args) throws InterruptedException {
		
		SeleniumUtility s1 = new SeleniumUtility();
		
		WebDriver driver = s1.setUp("chrome", "https://www.globalsqa.com/demo-site/draganddrop/");
		// frame handling
		WebElement frame = driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
		driver.switchTo().frame(frame);

//		// create an instance of Actions class by passing required browser instance to
//		// its constructor
		Actions act = new Actions(driver);

//		List<WebElement> sourceElements = driver.findElements(By.cssSelector("ul#gallery>li"));
//		WebElement target = driver.findElement(By.id("trash"));
//
//		act.dragAndDrop(sourceElements.get(0), target).build().perform();
		
		WebElement drg = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		WebElement drp = driver.findElement(By.xpath("//div[@id='trash']"));
		
//		act.clickAndHold(drg).moveToElement(drp).release().build().perform();
		
//		act.dragAndDrop(drg, drp).build().perform();
	}

}
