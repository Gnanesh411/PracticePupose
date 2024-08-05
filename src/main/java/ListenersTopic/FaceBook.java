package ListenersTopic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//@Listeners(ListenersTopic.MyTestListener.class)
public class FaceBook {
	WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
	}

	@Test
	public void loginTest() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8978360192");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Gnanesh@411");
		WebElement login_btn = driver.findElement(By.name("login"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", login_btn);

		Assert.assertEquals(driver.getTitle(), "Facebook");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
