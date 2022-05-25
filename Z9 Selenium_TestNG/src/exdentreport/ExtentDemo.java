package exdentreport;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentDemo extends SeleniumUtility {

	static ExtentTest test;
	static ExtentReports report;

	@BeforeClass
	public static void startTest() {
		report = new ExtentReports(".\\ExtentReport\\ExtentReportResults.html");
		test = report.startTest("GooglePageReport");
	}

	@Test
	public void extentReportsDemo() throws IOException {
		WebDriver driver = setUp("chrome", "https://www.google.com");
		if (getCurrentTitleOfApplication().equals("Google1")) {
			test.log(LogStatus.PASS, "Navigated to the specified URL successfully and page tile is also validated");
			// System.out.println("Navigated to the specified URL successfully and page tile
			// is also validated");
		} else {
			test.log(LogStatus.FAIL, test.addScreenCapture(screenShot(driver)), "Google page validation got failed");
			// System.out.println("Google page validation got failed");
		}
		cleanUp();
	}

	@AfterClass
	public static void endTest() {
		report.endTest(test);
		report.flush();
	}

	public static String screenShot(WebDriver driver) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("src/../BStackImages/" + System.currentTimeMillis() + ".png");
		String errflpath = Dest.getAbsolutePath();
		FileUtils.copyFile(scrFile, Dest);
		return errflpath;
	}
}