package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.google.common.io.Files;
import utilities.MySeleniumUtility;

public class Screenshot extends MySeleniumUtility {

	@Test
	public void testScreenShot() {

		WebDriver driver = setUp("chrome", "https://www.facebook.com/");
		
		TakesScreenshot ss = (TakesScreenshot) driver;
		
		File file = ss.getScreenshotAs(OutputType.FILE);
		Date date = new Date();
		String namess = date.toString().replace(" ", "").replace(":", "");
		try {
			Files.copy(file, new File(".\\src\\test\\resources\\ScreenShots\\"+namess+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		cleanUp();
	}
}
