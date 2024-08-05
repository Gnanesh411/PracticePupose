package TestNgTopics;

import org.testng.annotations.AfterMethod;
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

public class C1 {
	@Test
	void abc() {
		System.out.println("this is abc from c1...");
	}

	@BeforeTest
	void bt() {
		System.out.println("this is beforetest method");
	}

}
