package New;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Get;

public class BrokenLinks {

	public static void main(String[] args) {

//		WebDriver driver = Get.setUp("chrome", "https://www.amazon.in/");
//		
//		List<WebElement> links = driver.findElements(By.xpath("//*[@href]"));
//		
//		System.out.println(links.size());
//		
//		for(int i=0;i<links.size();i++) {
//			String url = links.get(i).getAttribute("href");
//		}

		String homePage = "https://www.flipkart.com/";
		String url = "";
		HttpURLConnection huc = null;
		int respCode;

		WebDriver driver = Get.setUp("chrome", homePage);

		List<WebElement> links = driver.findElements(By.tagName("a"));
//		links.addAll(driver.findElements(By.tagName("link")));

		System.out.println(links.size());

		Iterator<WebElement> it = links.iterator();

		int ct1 = 0, ct2 = 0, ct3 = 0, ct4 = 0;

		while (it.hasNext()) {

			url = it.next().getAttribute("href");

			System.out.println(url);

			if (url == null || url.isEmpty()) {
				System.out.println("	>URL is either not configured for anchor tag or it is empty");
				ct1++;
				continue;
			}

			if (!url.startsWith(homePage)) {
				System.out.println("	>URL belongs to another domain, skipping it.");
				ct2++;
				continue;
			}

			try {
				huc = (HttpURLConnection) (new URL(url).openConnection());

				huc.setRequestMethod("HEAD");

				huc.connect();

				respCode = huc.getResponseCode();

				if (respCode >= 400) {
					System.out.println("		>is a broken link");
					ct3++;
				} else {
					System.out.println("		>is a valid link");
					ct4++;
				}

			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Empty links : " + ct1 + "\nHompage : " + ct2 + "\nBroken : "+ct3+"\nValid : "+ct4);

		driver.quit();
	}
}
