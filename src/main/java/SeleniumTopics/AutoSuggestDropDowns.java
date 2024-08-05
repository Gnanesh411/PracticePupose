package SeleniumTopics;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutoSuggestDropDowns {
	WebDriver driver;

	@BeforeTest
	public void invoke() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void mainTest() throws InterruptedException {
		WebElement e = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		e.click();
		e.sendKeys("Selenium");
		String user_title = "Google";
		String act_title = driver.getTitle();
		System.out.println(act_title);
		Thread.sleep(3000);
		Assert.assertEquals(act_title, user_title);
		List<WebElement> names = driver.findElements(By.xpath("//div[@id='Alh6id']//li"));
		int cnt = names.size();
		Thread.sleep(3000);
		for (WebElement elems : names) {
			System.out.println(elems.getText());
		}
		names.get(cnt-1).click();
		//driver.quit();
	}

//	@AfterTest
//	public void tearDown() {
//		driver.close();
//	}
}
