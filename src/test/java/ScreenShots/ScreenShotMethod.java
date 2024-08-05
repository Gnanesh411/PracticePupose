package ScreenShots;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScreenShotMethod {

	public void screenShot(WebDriver driver, String filename) throws IOException {
		WebElement ele = driver.findElement(By.xpath("//img[@title='iPhone']"));
		//TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ele.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(source, new File(filename));

	}

}
