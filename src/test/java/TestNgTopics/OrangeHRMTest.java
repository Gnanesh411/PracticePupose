package TestNgTopics;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
/*1)open application
 * 2)test logo presence
 * 3)login
 * 4)close
 */
public class OrangeHRMTest {
	WebDriver driver;
	@Test(priority = 1)
	public void openApp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}

	@Test(priority = 2)
	void testLogo() throws InterruptedException {
		Thread.sleep(3000);
		String exp = driver.findElement(By.xpath("//h5[normalize-space()='Login']")).getText();
		String act = "Login";
		SoftAssert sf = new SoftAssert();
		sf.assertEquals(exp, act);
		sf.assertAll();
		//boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		//System.out.println("logo is displayed:"+status);
	}

	@Test(priority = 3)
	void testLogin() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}

	@Test(priority = 4)
	void closeApp() {
		driver.close();
	}
}