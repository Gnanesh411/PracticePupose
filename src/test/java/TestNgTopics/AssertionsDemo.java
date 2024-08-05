package TestNgTopics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {

	@Test
	void titleTest() {
		String exp_Title = "Opencart";
		String act_Title = "Openshop";
		/*
		 * if (exp_Title.equals(act_Title)) { System.out.println("Test passed");
		 * Assert.assertTrue(true); } else { System.out.println("Test failed");
		 * Assert.assertTrue(false); }
		 */
		Assert.assertEquals(exp_Title, act_Title);
	}
}
