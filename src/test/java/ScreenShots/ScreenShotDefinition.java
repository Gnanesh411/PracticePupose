package ScreenShots;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScreenShotDefinition extends ScreenShotMethod {

	public WebDriver driver;

	@Test
	public void setUp() throws IOException {
		driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
//		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddhhmmss");
//		Date d = new Date();
//		String date = sf.format(d);
		
		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		screenShot(driver, System.getProperty("user.dir") + "\\Screenshots\\" + timeStamp + ".png");

	}
}
