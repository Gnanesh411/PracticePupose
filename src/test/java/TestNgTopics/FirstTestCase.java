package TestNgTopics;

import org.testng.annotations.Test;

/*
 * 1)open app
 * 2)Login
 * 3)Logout
 */

public class FirstTestCase {
	
	@Test
	void OpenApp() {
		System.out.println("Opening Application...");
	}
	@Test(priority = 200)
	void Login() {
		System.out.println("Login Application....");
	}
	@Test(priority = 300)
	void Logout() {
		System.out.println("Logout Application.......");
	}
}
