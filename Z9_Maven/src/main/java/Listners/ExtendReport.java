package Listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReport extends ScreenshotNew implements ITestListener {

	ExtentSparkReporter reporter;
	ExtentReports report;
	ExtentTest test;
	ScreenshotNew SS;

	ExtendReport() {
		reporter = new ExtentSparkReporter(".\\src\\test\\java\\Vtiger\\report.html");
		reporter.config().setCss("background-color:#5285c5");
		reporter.config().setDocumentTitle("Test Doc Title");
		reporter.config().setReportName("Vtiger Automation");
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setTimelineEnabled(true);
		report = new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("User", "Akshay");
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Start............");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test = report.createTest(result.getMethod().getMethodName());
		test.log(Status.PASS, "Test case pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		ScreenshotNew SS = new ScreenshotNew();
		test = report.createTest(result.getMethod().getMethodName());
		test.fail(result.getThrowable()).addScreenCaptureFromPath("");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test = report.createTest(result.getMethod().getMethodName());
		test.log(Status.SKIP, "test case skipped");
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}
}
