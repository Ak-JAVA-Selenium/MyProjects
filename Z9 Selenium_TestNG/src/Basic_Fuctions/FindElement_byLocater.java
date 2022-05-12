package Basic_Fuctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * In order to identify any object/element from the application UI we use findElement(By)
 * this method returns WebElement
 * 
 * By is predefined class in selenium and all its method are static which are also known as "locator"
 * Selenium support following locator:
 * id , name, linkText, partialLinkText, className, tagName, cssSelector, xpath
 * 
 * Action: all the below actions will be performed on the webelement
 * 			if you want to type any input on the field use--> sendKeys("");
 * 		   if you want to click on any element use---> click();
 * 		   clearing existing value from the field ---> clear();
 */
public class FindElement_byLocater {

	public static void main(String[] args) {

		String driverPath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverPath);

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.actitime.com/login.do");

		// compare expected Title vs actual Title
		String expectedTitle = "actiTIME - Login";

		String actualTitle = driver.getTitle();

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Login page opened sucessfully...");
		} else {
			System.out.println("Either login page not opened or page title got changed");
		}

		/** identify the required element from the UI */
		WebElement userNameInputField = driver.findElement(By.id("username"));

		/** perform appropriate action the identified element */
		userNameInputField.sendKeys("admin");

		/** remove existing text from the input field */
		userNameInputField.clear();

		// perform appropriate action the identified element again
		userNameInputField.sendKeys("admin");

		// identify the required element from the UI
		WebElement passwordInputField = driver.findElement(By.name("pwd"));
		// perform appropriate action the identified element
		passwordInputField.sendKeys("manager");

		// identify the required element from the UI
		WebElement loginButton = driver.findElement(By.id("loginButton"));

		/** perform appropriate action the identified element */
		loginButton.click();

		System.out.println("===========================");

		/** close browser */
		driver.close();
	}
}
