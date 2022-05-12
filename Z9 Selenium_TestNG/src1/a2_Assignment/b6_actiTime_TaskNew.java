package a2_Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Get;

public class b6_actiTime_TaskNew {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Get.setUp("chrome", "https://demo.actitime.com/login.do");

		WebDriverWait wait = new WebDriverWait(driver, 20);

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

		WebElement a = driver.findElement(By.cssSelector("tr.selectCustomerRow>td>div>div>div>.selectedItem"));
		a.click();

		List<WebElement> list1 = driver.findElements(By.cssSelector(
				"div.selectCustomerAndProject>table>tbody>:first-child>:first-child>div>div>:nth-child(2)>div>:first-child>div>div"));
		System.out.println("\nCustomers : " + list1.size());

		for (int j = 0; j < list1.size(); j++) {
//			if (!list1.get(j).getText().isEmpty()) {
			System.out.println((j + 1) + "." + list1.get(j).getText());
//			}
		}
		Thread.sleep(3000);
		list1.get(1).click();

		WebElement b = driver.findElement(By.cssSelector("div.emptySelection"));
		wait.until(ExpectedConditions.elementToBeClickable(b));
		b.click();

		List<WebElement> list2 = driver
				.findElements(By.cssSelector("div.projectSelector>div>:nth-child(2)>div>:first-child>div>div"));
		System.out.println("\nProjects : " + list2.size());

		for (int j = 0; j < list2.size(); j++) {
//			if (!list2.get(j).getText().isEmpty()) {
			System.out.println((j + 1) + "." + list2.get(j).getText());
//			}
		}
		Thread.sleep(3000);
		list2.get(2).click();

		List<WebElement> list3 = driver
				.findElements(By.cssSelector("label.components_checkboxContainer.projectListItem>span.label"));
		System.out.println("\nProjects : " + list3.size());

		for (int j = 0; j < list3.size(); j++) {
//			if (!list3.get(j).getText().isEmpty()) {
			System.out.println((j + 1) + "." + list3.get(j).getText());
//			}
		}
		Thread.sleep(3000);
		list3.get(2).click();

		String d = "AkshayBote";
		driver.findElement(By.cssSelector("td.nameCell.first>:first-child")).sendKeys(d);

		driver.findElement(
				By.cssSelector("table.createTasksTable>:nth-child(3)>:first-child>:nth-child(6)>label>:nth-child(3)"))
				.click();

		WebElement e = driver.findElement(By.cssSelector("div.commitButtonPlaceHolder>div>:first-child"));
		wait.until(ExpectedConditions.elementToBeClickable(e));
		e.click();

		Thread.sleep(3000);
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
