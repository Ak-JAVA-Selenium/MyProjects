package KeyBoard_Oprtn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;
/**
 * possible ways to refresh the browser:
 * 1. driver.navigate().refresh();
 * 2. sendKeys(Keys.f5)
 * 3. by hitting same URL again
 * 4. ctrl+R
 */
public class KeyboardOps3 {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.flipkart.com/");
	
		Thread.sleep(5000);
//		driver.navigate().refresh();
		//or
//		driver.findElement(By.cssSelector("body")).sendKeys(Keys.F5);
		//or
//		driver.get("https://www.flipkart.com/");
		//or
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.chord(Keys.CONTROL,"r"));
		
	}

}
