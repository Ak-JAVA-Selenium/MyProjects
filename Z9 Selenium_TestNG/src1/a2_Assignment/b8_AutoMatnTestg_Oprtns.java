package a2_Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Get;

public class b8_AutoMatnTestg_Oprtns {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Get.setUp("chrome", "http://demo.automationtesting.in/Register.html");

		WebDriverWait wait = new WebDriverWait(driver, 20);

		String ExUrl = "http://demo.automationtesting.in/Register.html";
		System.out.println("======================");
		String ActUrl = driver.getCurrentUrl();
		if (ExUrl.equals(ActUrl)) {
			System.out.println("url verified successfully...");
		} else {
			System.out.println("url verification failed...");
		}
		String ExTitle = "Register";
		String ActTitle = driver.getTitle();
		if (ExUrl.equals(ActUrl)) {
			System.out.println("Page Title verified successfully...");
		} else {
			System.out.println("Page Title verification failed...");
		}
		System.out.println("======================");
		System.out.println("Details we have to fill for registration :");
		List<WebElement> Details = driver.findElements(By.xpath("//form[@ng-submit='createdata()']/div/label"));
		for (int i = 0; i < Details.size(); i++) {
			System.out.println((i + 1) + "." + Details.get(i).getText());
		}
		System.out.println("======================");

		WebElement a1 = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		System.out.println(Details.get(0).getText());
		System.out.println("isDisplayed() : " + a1.isDisplayed() + "\nisEnabled() : " + a1.isEnabled()
				+ "\nisSelected() : " + a1.isSelected());
		a1.sendKeys("Akshay");
		System.out.println("======================");

		WebElement a2 = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		System.out.println(Details.get(1).getText());
		System.out.println("isDisplayed() : " + a2.isDisplayed() + "\nisEnabled() : " + a2.isEnabled()
				+ "\nisSelected() : " + a2.isSelected());
		a2.sendKeys("Bote");
		System.out.println("======================");

		WebElement a3 = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		System.out.println(Details.get(2).getText());
		System.out.println("isDisplayed() : " + a3.isDisplayed() + "\nisEnabled() : " + a3.isEnabled()
				+ "\nisSelected() : " + a3.isSelected());
		a3.sendKeys("Blue Mangoes,11/13, St Theresa Lane, St Theresa St, MG Road Area, Puducherry, 605001");
		System.out.println("======================");

		WebElement a4 = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		a4.sendKeys("johndoe@yourdomain.com", Keys.TAB, "9730907611", Keys.TAB);

		WebElement a5 = driver.findElement(By.xpath("//input[@value='Male']"));
		System.out.println(Details.get(4).getText());
		a5.click();
		System.out.println("isSelected() : " + a5.isSelected());
		System.out.println("======================");

		WebElement a6 = driver.findElement(By.xpath("//input[@id='checkbox1']"));
		System.out.println(Details.get(5).getText());
		a6.click();
		System.out.println("isSelected() : " + a6.isSelected());
		System.out.println("======================");

		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		driver.findElement(By.xpath("//div[@style='display: block;'][1]/ul/*[16]")).click();
		driver.findElement(By.xpath("//body")).click();

		WebElement a8 = driver.findElement(By.xpath("//select[@ng-model='Skill']"));
		Select tag = new Select(a8);
		System.out.println(Details.get(7).getText());
		System.out.println("isMultiple() : " + tag.isMultiple() + "\ngetFirstSelectedOption() : "
				+ tag.getFirstSelectedOption().getText());
		tag.selectByVisibleText("Data Analytics");
		System.out.println("\nSelected skill : " + tag.getFirstSelectedOption().getText());
		System.out.println("======================");

		driver.findElement(By.xpath("//span[@role='combobox']")).click();
		driver.findElement(By.xpath("//ul[@role='tree']/*[6]")).click();

		driver.findElement(By.xpath("//select[@ng-model='yearbox']")).click();
		driver.findElement(By.xpath("//select[@ng-model='yearbox']/*[83]")).click();
		driver.findElement(By.xpath("//select[@ng-model='monthbox']")).click();
		driver.findElement(By.xpath("//select[@ng-model='monthbox']/*[2]")).click();
		driver.findElement(By.xpath("//select[@ng-model='daybox']")).click();
		driver.findElement(By.xpath("//select[@ng-model='daybox']/*[4]")).click();

		driver.findElement(By.xpath("//input[@ng-model='Password']")).sendKeys("123456@abc");
		driver.findElement(By.xpath("//input[@ng-model='CPassword']")).sendKeys("123456@abc");

		driver.findElement(By.xpath("//input[@id='imagesrc']")).sendKeys("D:\\ford.jpg");
		Thread.sleep(5000);
		driver.close();
	}
}
