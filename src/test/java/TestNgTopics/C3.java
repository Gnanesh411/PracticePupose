package TestNgTopics;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {
	@Test
	void pqr() {
		System.out.println("this is pqr from C3...");
	}
	@BeforeSuite
	void as() {
		System.out.println("This is Before Suite method...");
	}
	@AfterSuite
	void bs() {
		System.out.println("This is After Suite method...");
	}
}
