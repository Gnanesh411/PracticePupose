package TestNgTopics;

import java.time.Duration;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	WebDriver driver;
	String password;

	@BeforeClass
	void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(dataProvider = "dp")
	void testLogin(String email, String pwd) throws InterruptedException {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		boolean status = driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='My Account']"))
				.isDisplayed();
		if (status = true) {
			driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
			Assert.assertTrue(true);
		} else {
			Assert.fail(); 
		}
	}

	@AfterClass
	void tearDown() {
		driver.close();
	}

	/*
	 * @DataProvider(name = "dp",indices = {3,4}) Object[][] loginData() { Object
	 * data[][] = { { "abc@gmail.com", "test123" }, { "xyz@gmail.com", "test012" },
	 * { "john@gmail.com", "test@123" }, { "gnaneshgaming@gmail.com", "Gnanesh@411"
	 * }, { "johncanedy@gmail.com", "test" } }; return data; }
	 */

	@DataProvider(name = "dp")
	Object[][] loginData() {
		Object data[][] = { { AlphaNumeric(), password() }, { AlphaNumeric(), password() } };
		return data;
	}

	public String randomString() {

		String generateString = RandomStringUtils.randomAlphanumeric(4);
		String generateNumbers = RandomStringUtils.randomNumeric(3);
		return generateString+"@"+generateNumbers;
	}

	public String randomNumbers() {
		String generateNumbers = RandomStringUtils.randomNumeric(5);
		return generateNumbers;
	}

	public String AlphaNumeric() {
		String generateAlphaNumeraic = RandomStringUtils.randomAlphanumeric(4);
		//String generateNumbers = RandomStringUtils.randomNumeric(5);
		return generateAlphaNumeraic + "@gmail.com" ;
	}

	public String password() {
		this.password = randomString();
		return this.password;
	}

}
