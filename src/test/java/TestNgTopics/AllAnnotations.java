package TestNgTopics;

import org.testng.annotations.*;

public class AllAnnotations {
	@BeforeSuite
	void bs() {
		System.out.println("before suite.....");
	}
	@AfterSuite
	void as() {
		System.out.println("after suite.....");
	}
	@BeforeTest
	void bt() {
		System.out.println("before test....");
	}
	@AfterTest
	void at() {
		System.out.println("after test....");
	}
	@BeforeClass
	void bc() {
		System.out.println("before class...");
	}
	@AfterClass
	void ac() {
		System.out.println("after class....");
	}
	@BeforeMethod
	void bm() {
		System.out.println("before method....");
	}
	@AfterMethod
	void am() {
		System.out.println("after method......");
	}
	@Test(priority = 1)
	void tm1() {
		System.out.println("This is Test Method1....");
	}
	@Test(priority = 2)
	void tm2() {
		System.out.println("This is Test Method2....");
	}
}
