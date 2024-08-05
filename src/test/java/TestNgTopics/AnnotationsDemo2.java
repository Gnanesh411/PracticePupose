package TestNgTopics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*1)Login--@BeforeClass
 * 2)Search--@Test
 * 3)Advanced Search--@Test
 * 6)Logout--@afterclass
 */

public class AnnotationsDemo2 {
	@BeforeClass
	void login() {
		System.out.println("This is login");
	}

	@Test(priority = 1)
	void search() {
		System.out.println("This is search");
	}

	@Test(priority = 2)
	void advsearch() {
		System.out.println("This is adv search");
	}

	@AfterClass
	void logout() {
		System.out.println("This is logout");
	}

}
