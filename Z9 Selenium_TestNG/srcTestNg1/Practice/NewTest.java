package Practice;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.Get;

public class NewTest {
  @Test
  public void f() {
	  WebDriver driver = Get.setUp("firefox", "https://mail.google.com/");
	  driver.switchTo().activeElement().sendKeys("akshaybote311995@gmail.com",Keys.ENTER);
  }
}
