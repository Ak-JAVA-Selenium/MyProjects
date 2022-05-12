package Vtiger;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.MySeleniumUtility;

public class VtigerTask_Script extends MySeleniumUtility{
	
	LoginPage_POM test1;
	DashboardPage_POM test2;
	LeadsPage test3;
	
	@BeforeTest
	public void openBrower(){
		driver=setUp("edge", "https://demo.vtiger.com/vtigercrm/index.php");
		test1 = new LoginPage_POM(driver);
		
	}
	@BeforeMethod
	public void login() {
		test2 = test1.loginIntoVtiger("admin", "Test@123");	
	}

	@Test
	public void testCreateNewTask() {
		test3=test2.selectLead();
		test3.createLead("Akshay", "Bote");
	}
	@Test
	public void testNewTaskUpdation() {
		
	}
	@Test
	public void testNewTaskDeletion() {
		
	}
	
	@AfterMethod
	public void logout() {
		
	}
	@AfterTest
	public void closeBrowser() {
//		cleanUp();
	}
}
