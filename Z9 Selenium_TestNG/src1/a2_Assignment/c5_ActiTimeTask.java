package a2_Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Get;

public class c5_ActiTimeTask {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Get.setUp("chrome", "https://demo.actitime.com/login.do");

		WebDriverWait wait = new WebDriverWait(driver, 20);

		driver.findElement(By.cssSelector("td[valign='middle']>*#username")).sendKeys("admin");

		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");

		driver.findElement(By.cssSelector("input[id='keepLoggedInCheckBox']")).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[id='loginButton']")));

		driver.findElement(By.cssSelector("a[id='loginButton']")).click();

		driver.findElement(By.cssSelector("tr>:nth-child(4)>a>div.label")).click();

		WebElement add = driver.findElement(By.cssSelector(".title.ellipsis"));
		wait.until(ExpectedConditions.elementToBeClickable(add));
		add.click();

		WebElement task = driver.findElement(By.cssSelector(".item.createNewTasks"));
		wait.until(ExpectedConditions.elementToBeClickable(task));
		task.click();

		WebElement a = driver.findElement(By.cssSelector("tr.selectCustomerRow>td>div>div>div>.selectedItem"));
		a.click();

		List<WebElement> list1 = driver.findElements(By.cssSelector(
				"div.selectCustomerAndProject>table>tbody>:first-child>:first-child>div>div>:nth-child(2)>div>:first-child>div>div"));
		list1.get(1).click();
		Thread.sleep(2000);

		WebElement b = driver.findElement(By.cssSelector("div.emptySelection"));
		wait.until(ExpectedConditions.elementToBeClickable(b));
		b.click();

		List<WebElement> list2 = driver
				.findElements(By.cssSelector("div.projectSelector>div>:nth-child(2)>div>:first-child>div>div"));
		list2.get(2).click();
		Thread.sleep(2000);

		List<WebElement> list3 = driver
				.findElements(By.cssSelector("label.components_checkboxContainer.projectListItem>span.label"));
		list3.get(2).click();
		Thread.sleep(2000);

		String d = "AkshayBote";
		driver.findElement(By.cssSelector("td.nameCell.first>:first-child")).sendKeys(d);

		driver.findElement(
				By.cssSelector("table.createTasksTable>:nth-child(3)>:first-child>:nth-child(6)>label>:nth-child(3)"))
				.click();

		WebElement e = driver.findElement(By.cssSelector("div.commitButtonPlaceHolder>div>:first-child"));
		wait.until(ExpectedConditions.elementToBeClickable(e));
		e.click();
		Thread.sleep(3000);
		
		List<WebElement> tasks = driver.findElements(By.xpath("//div[@class='namesContainer']/div[2]"));
		for (int i=0;i<tasks.size();i++) {
			String taskName = tasks.get(i).getText();
			if(taskName.equals(d)) {
				System.out.println("Task created successfillly....");
		
				WebElement statu = driver.findElement(By.xpath("//tbody/tr["+(i+1)+"]/td[3]/div[1]/div[1]/div[1]/div[3]"));
				String status = statu.getText();
				System.out.println("Task status...."+status);
				statu.click();
				driver.findElement(By.xpath("//div[@class='workflowStatus statusType_open statusColor_lightGreen statusTypeIcon_lightGreen']")).click();
				Thread.sleep(2000);
				System.out.println("Updated Task status...."+driver.findElement(By.xpath("//tbody/tr["+(i+1)+"]/td[3]/div[1]/div[1]/div[1]/div[3]")).getText());
			}
		}
		
		WebElement f = driver.findElement(By.cssSelector(
				"div[class*='tasksTableVerticalScrollContainer']>:first-child>:first-child>:first-child>:first-child>table>tbody>tr>:first-child>div>div"));
		wait.until(ExpectedConditions.elementToBeClickable(f));
		f.click();

		WebElement g = driver.findElement(By.cssSelector(".delete.button"));
		wait.until(ExpectedConditions.elementToBeClickable(g));
		g.click();

		driver.findElement(By.cssSelector(
				"div.dialogWithPointerWrapper.deleteDialog>:nth-child(1)>:nth-child(1)>div>:nth-child(6)>:first-child>div"))
				.click();

		WebElement h = driver.findElement(By.id("logoutLink"));
		wait.until(ExpectedConditions.elementToBeClickable(h));
		h.click();
		Thread.sleep(3000);
		driver.close();
	}
}
