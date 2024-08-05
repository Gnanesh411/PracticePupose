package POM;
import java.util.List;

//Using Find Factory
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {

	WebDriver driver;

	// constructor
	LoginPage2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);//MANDATORY
	}

	// Locators

	//@FindBy(xpath = "//input[@placeholder='Username']")
	@FindBy(how=How.XPATH,using="//input[@placeholder='Username']")
	WebElement txt_userName;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement txt_passWord;

	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement btn_login;
	
	@FindBy(tagName="a")
	List<WebElement> links;

	// Action Methods

	public void setUserName(String user) {
		txt_userName.sendKeys(user);
	}

	public void setPassWord(String pwd) {
		txt_passWord.sendKeys(pwd);
	}

	public void ClickLogin() {
		btn_login.click();
	}

}
