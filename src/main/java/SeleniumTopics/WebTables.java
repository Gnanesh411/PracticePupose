package SeleniumTopics;

import java.time.Duration;
import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTables {
	WebDriver driver;

	@BeforeTest
	public void SetUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().window().maximize();
	}

	@Test
	public void Tables() {
		// List<WebElement> eles =
		// driver.findElements(By.xpath("//tbody[contains(@style,'box-sizing:inherit')]"));
		try {
			List<WebElement> eles = driver.findElements(By.xpath("//table[contains(@class,'tsc_table_s13')]"));
			System.out.println(eles.size());
			for (WebElement data : eles) {
				System.out.println(data.getText() + "\t");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Assert.assertEquals(driver.getTitle(), "Mastering Selenium Practice: Automating Web Tables with Demo Examples");
	}
}