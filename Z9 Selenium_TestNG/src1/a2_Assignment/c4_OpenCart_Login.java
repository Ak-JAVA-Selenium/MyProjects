package a2_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Get;

public class c4_OpenCart_Login { // ********************

	public static void main(String[] args) {
		
		WebDriver driver = Get.setUp("chrome", "https://www.google.co.in/");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.findElement(By.name("q")).sendKeys("https://www.opencart.com/",Keys.ENTER);//h3[text()='OpenCart - Open Source Shopping Cart Solution']
		driver.findElement(By.xpath("//h3[text()='OpenCart - Open Source Shopping Cart Solution']")).click();
		WebElement register = driver.findElement(By.cssSelector(".btn.btn-black.navbar-btn"));
		wait.until(ExpectedConditions.visibilityOf(register));
		register.click();
		driver.switchTo().activeElement().sendKeys("DahnrajShinde",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Dhanraj",Keys.TAB);
		
	}
