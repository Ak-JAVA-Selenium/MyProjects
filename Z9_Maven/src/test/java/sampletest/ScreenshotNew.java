package sampletest;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import utilities.MySeleniumUtility;

public class ScreenshotNew extends MySeleniumUtility {

	@Test
	public String TakeSS() {
		WebDriver driver = setUp("Chrome", "https://www.rockstargames.com/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		TakesScreenshot ss = (TakesScreenshot) driver;
		
		File file = ss.getScreenshotAs(OutputType.FILE);
		
		Date date = new Date();
		
		String name = date.toString().replace(" ", "").replace(":", "");

		String filePath = ".\\src\\test\\resources\\ScreenShots\\"+name+".png";
		
		try {
			Files.copy(file, new File(filePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		return filePath;
	}
}
