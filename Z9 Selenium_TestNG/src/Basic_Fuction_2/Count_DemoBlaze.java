package Basic_Fuction_2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_DemoBlaze {

	public static void main(String[] args) {

		String driverPath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverPath);

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.demoblaze.com/");

		List<WebElement> devices=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
		System.out.println("Device count: "+devices.size());
		
		System.out.println();
		
		for(int i=0;i<devices.size();i++) {
			System.out.println(devices.get(i).getText());
		}
		driver.close();
	}
}
