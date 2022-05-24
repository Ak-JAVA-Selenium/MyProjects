package WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtility;

public class HandlingCalender{

	public static void main(String[] args) throws InterruptedException {
		
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		driver.findElement(By.cssSelector("label[for='departure']")).click();
		
		WebElement pop = driver.findElement(By.cssSelector("span.langCardClose"));
		wait.until(ExpectedConditions.elementToBeClickable(pop));
		pop.click();
		
		driver.findElement(By.cssSelector("div.DayPicker-Months>*:last-child>.DayPicker-Body>div:nth-of-type(2)>*:nth-child(2)>div>p")).click();

		driver.close();
	}

}
