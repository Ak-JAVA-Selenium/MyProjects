package a2_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import utilities.Get;

public class c3_SauceDemo {

	public static void main(String[] args) throws Exception {

		WebDriver driver = Get.setUp("chrome", "https://www.saucedemo.com/");

		String user = driver.findElement(By.id("login_credentials")).getText();
		String user1 = user.substring(user.indexOf(':') + 1).trim();
		System.out.println(user1);
		String[] u = user1.split("user");
		String pass = driver.findElement(By.className("login_password")).getText();
		String[] arr = pass.split(":");
		for (int i = 0; i < u.length; i++) {
			System.out.print(u[i] + "user".trim());
			driver.findElement(By.id("user-name")).sendKeys(u[i] + "user".trim());
			driver.findElement(By.id("password")).sendKeys(arr[1]);
			Thread.sleep(2000);
			driver.findElement(By.id("login-button")).click();
			Thread.sleep(2000);
			driver.navigate().to("https://www.saucedemo.com/");
		}
		Thread.sleep(2000);
	}
}
