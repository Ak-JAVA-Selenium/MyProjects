package Listners;

import org.testng.IReporter;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.observer.ExtentObserver;
import com.aventstack.extentreports.observer.entity.ObservedEntity;
import com.aventstack.extentreports.observer.entity.ReportEntity;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReport implements ITestListener,IReporter {

	ExtentReports report;
	ExtentTest test;

	public ExtendReport() {
		ExtentSparkReporter reporter = new ExtentSparkReporter(".\\src\\test\\resources\\ExtentReports\\report.html");
		reporter.config().setDocumentTitle("Test Doc Title");
		reporter.config().setReportName("Vtiger Automation");
		reporter.config().setTheme(Theme.STANDARD);
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
		ScreenshotNew sss= new ScreenshotNew();
		String path = sss.TakeSS();
		test = report.createTest(result.getMethod().getMethodName());
		test.fail(result.getThrowable()).addScreenCaptureFromPath(path);
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
