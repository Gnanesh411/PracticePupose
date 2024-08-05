package TestNGGrouping;

import org.testng.annotations.Test;

public class SignUpTests {//regression

	@Test(priority = 1,groups = {"regression"})
	void signupbyemail() {
		System.out.println("signup by email...");
	}
	@Test(priority = 2,groups = {"regression"})
	void signupbyfacebook() {
		System.out.println("signup by facebook...");
	}
	@Test(priority = 3,groups = {"regression"})
	void signupbytwitter() {
		System.out.println("signup by twitter");
	}
}
