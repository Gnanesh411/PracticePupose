package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	// constructor
	LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Locators
	By txt_uname_loc = By.xpath("//input[@placeholder='Username']");
	By txt_password_loc = By.xpath("//input[@placeholder='Password']");
	By btn_login_loc = By.xpath("//button[normalize-space()='Login']");

	// Action Methods

	public void setUserName(String user) {
		driver.findElement(txt_uname_loc).sendKeys(user);
	}

	public void setPassWord(String pwd) {
		driver.findElement(txt_password_loc).sendKeys(pwd);
	}

	public void ClickLogin() {
		driver.findElement(btn_login_loc).click();
	}

}