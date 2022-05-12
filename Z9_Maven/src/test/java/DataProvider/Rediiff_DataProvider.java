package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.MySeleniumUtility;

public class Rediiff_DataProvider extends MySeleniumUtility {

	@DataProvider(name="getData")
	public Object[][] datfromexcel(){
		ExcelToDataProvider hi = new ExcelToDataProvider(".\\src\\test\\resources\\testData\\Book1.xlsx");
		Object[][] data = hi.getData("Sheet1");
		return data;
	}
	@Test (dataProvider = "getData")
	public void rediffReg(String fullname, String rediffId, String password, String retypepass, String altemail,
			String mobno, String dob, String gender, String country) {
		WebDriver driver = setUp("chrome", "http://register.rediff.com/register/register.php?FormName=user_details");
		
		driver.findElement(By.xpath("//input[starts-with(@name,'name' )]")).clear();
		driver.findElement(By.xpath("//input[starts-with(@name,'name' )]")).sendKeys(fullname);

		driver.findElement(By.xpath("//input[contains(@name,'login')]")).clear();
		driver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys(rediffId);

		driver.findElement(By.xpath("//input[starts-with(@name,'passwd')]")).clear();
		driver.findElement(By.xpath("//input[starts-with(@name,'passwd')]")).sendKeys(password);

		driver.findElement(By.xpath("//input[starts-with(@name,'confirm_passwd')]")).clear();
		driver.findElement(By.xpath("//input[starts-with(@name,'confirm_passwd')]")).sendKeys(retypepass);

		driver.findElement(By.xpath("//input[starts-with(@name,'altemail')]")).clear();
		driver.findElement(By.xpath("//input[starts-with(@name,'altemail')]")).sendKeys(altemail);
		
		driver.findElement(By.id("mobno")).clear();
		driver.findElement(By.id("mobno")).sendKeys(mobno);
		
		String Datearr[] = dob.split(" ");
		String day = Datearr[0];
		String month = Datearr[1];
		String year = Datearr[2];
		Select sel = new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]")));
		sel.selectByValue(day);
		Select sel1 = new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]")));
		sel1.selectByValue(month);
		Select sel2 = new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]")));
		sel2.selectByValue(year);

		if (gender.equals("Male")) {
			driver.findElement(By.xpath("//input[@value='m']")).click();
		} else {
			driver.findElement(By.xpath("//input[@value='f']")).click();

		}
		Select sel3 = new Select(driver.findElement(By.xpath("//select[@id='country']")));
		driver.findElement(By.xpath("//select[@id='country']")).click();
		sel3.selectByVisibleText(country);
		
		cleanUp();
	}
}
