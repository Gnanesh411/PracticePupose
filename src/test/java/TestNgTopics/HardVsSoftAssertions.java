package TestNgTopics;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {
	
	/*
	 * @Test void hardAssertions() { System.out.println("Testing.....");
	 * System.out.println("Testing.....");
	 * 
	 * //Assert.assertEquals(1, 1); Assert.assertEquals(1,2);//Hard Assertions
	 * 
	 * System.out.println("Testing....."); System.out.println("Testing....."); }
	 */
	@Test
	void softAssertions() {
		
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		
		SoftAssert sa = new SoftAssert();
		
		//Assert.assertEquals(1, 1);
		sa.assertEquals(1,2);//Soft Assertions
		
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		
		sa.assertAll();//Mandatory.	
	}
}
