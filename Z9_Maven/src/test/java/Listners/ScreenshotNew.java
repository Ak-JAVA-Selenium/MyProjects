package Listners;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.google.common.io.Files;
import utilities.MySeleniumUtility;

public class ScreenshotNew extends MySeleniumUtility {

	public String TakeSS() {

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		TakesScreenshot ss = (TakesScreenshot) MySeleniumUtility.driver;
		
		File file = ss.getScreenshotAs(OutputType.FILE);
		
		Date date = new Date();
		
		String name = date.toString().replace(" ", "").replace(":", "");

		String filePath = "C:\\Users\\kumbh\\git\\MyProjects\\Z9_Maven\\src\\test\\resources\\ScreenShots\\"+name+".png";
		     
		try {
			Files.copy(file, new File(filePath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver.close();
		return filePath;
	}
}
