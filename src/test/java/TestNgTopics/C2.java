package TestNgTopics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*1)Login--@BeforeMethod
 * 2)Search--@Test
 * 3)Logout--@AfterMethod
 * 4)Login
 * 5)Advanced Search--@Test
 * 6)Logout
 */

public class C2 {

	@Test
	void abc() {
		System.out.println("this is abc from c2...");
	}
	@AfterTest
	void bt() {
		System.out.println("this is AfterTest method");
	}

}
