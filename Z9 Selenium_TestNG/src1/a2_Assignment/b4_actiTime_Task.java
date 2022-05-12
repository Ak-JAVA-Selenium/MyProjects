package a2_Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class b4_actiTime_Task {

	public static void main(String[] args) throws InterruptedException {

		String path = System.getProperty("user.dir") + "/Drivers/chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", path);

		WebDriver driver = new ChromeDriver();

		driver.manage().window().setPosition(new Point(0, 0));
		
		driver.manage().window().setSize(new Dimension(1000, 730));
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 20);

		driver.get("https://demo.actitime.com/login.do");
		
		System.out.println("Home Page Title : " + driver.getTitle());

		driver.findElement(By.cssSelector("td[valign='middle']>*#username")).sendKeys("admin");

		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");

		WebElement checkBox = driver.findElement(By.cssSelector("input[id='keepLoggedInCheckBox']"));

		checkBox.click();

		System.out.println("Check Box Selected : " + checkBox.isSelected());

		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[id='loginButton']")));

		driver.findElement(By.cssSelector("a[id='loginButton']")).click();

		System.out.println("After Login, Page Title : " + driver.getTitle());
		
		driver.findElement(By.cssSelector("tr>:nth-child(4)>a>div.label")).click();
		
		WebElement add = driver.findElement(By.cssSelector(".title.ellipsis"));
		wait.until(ExpectedConditions.elementToBeClickable(add));
		add.click();
		
		WebElement task = driver.findElement(By.cssSelector(".item.createNewTasks"));
		wait.until(ExpectedConditions.elementToBeClickable(task));
		task.click();
		
		WebElement a= driver.findElement(By.cssSelector("tr.selectCustomerRow>td>div>div>div>.selectedItem"));
		a.click();
		
		List<WebElement> list1 = driver.findElements(By.cssSelector("div[class^='itemRow']"));
//		System.out.println(list1.size());
		for (int i =0;i<list1.size();i++) {
			String j = driver.findElements(By.cssSelector("div[class^='itemRow']")).get(i).getText();
			if(j.equalsIgnoreCase("Galaxy Corporation")) {
				driver.findElements(By.cssSelector("div[class^='itemRow']")).get(i).click();
				break;
			}
		}
		
		WebElement b= driver.findElement(By.cssSelector(".selectProjectRow.projectSelectorRow>td>div>div>div>div.selectedItem"));
		wait.until(ExpectedConditions.elementToBeClickable(b));
		b.click();
		
		List<WebElement> list2 = driver.findElements(By.cssSelector("div[class^='itemRow']"));
//		System.out.println(list2.size());
		for (int i =0;i<list2.size();i++) {
			String j = driver.findElements(By.cssSelector("div[class^='itemRow']")).get(i).getText();
			if(j.equalsIgnoreCase("Android prototyping")) {
				driver.findElements(By.cssSelector("div[class^='itemRow']")).get(i).click();
				break;
			}
		}
		
		String d = "AKshaypBote";
		driver.findElement(By.cssSelector("td.nameCell.first>:nth-child(1)")).sendKeys(d);
		
		driver.findElement(By.cssSelector(".commitButtonPlaceHolder>div>:nth-child(1)")).click();
		
		String c = driver.findElement(By.cssSelector("div[title='"+d+"']")).getText();
		
//		Thread.sleep(3000);
		if (c.equals(d)) {
			System.out.println("Task created successfully....");
		}else {
			System.out.println("Task creation failed...."+c);
		}
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector(".taskRowsTableContent>div>:nth-child(1)>table>tbody>:nth-child(1)>:nth-child(1)>div>div")).click();
		                                 //.taskRowsTableContent>div>:nth-child(1)>table>tbody>:nth-child(1)>:nth-child(1)>div>div 
		
		WebElement e= driver.findElement(By.cssSelector(".delete.button"));
		wait.until(ExpectedConditions.elementToBeClickable(e));
		e.click();
		
		driver.findElement(By.cssSelector("div.dialogWithPointerWrapper.deleteDialog>:nth-child(1)>:nth-child(1)>div>:nth-child(6)>:first-child>div")).click();
		
		driver.findElement(By.id("logoutLink")).click();
	
		Thread.sleep(3000);
		driver.close();
	}
}
