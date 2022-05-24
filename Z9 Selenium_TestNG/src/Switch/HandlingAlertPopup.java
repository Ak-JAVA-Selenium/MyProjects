package Switch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class HandlingAlertPopup {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		
		//as the required element is present inside the frame, so need to switch our control inside frame first
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(iframe);
		//or
//		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		System.out.println("Alert text msg is: "+driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.close();
	}
}
/**
In order handle any JavaScirpt Pop-up we need use driver.switchTo().alert()
because java script popup doesn't contain HTML code
we use predefined functions of Alert to perform any operation on it
after every action control comes back to the main page
*/