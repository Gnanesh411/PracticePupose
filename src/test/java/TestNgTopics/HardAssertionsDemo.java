package TestNgTopics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionsDemo {
	@Test
	void test() {
		//Assert.assertEquals("abc", "ABC");
		//Assert.assertEquals(123, 456);
		//Assert.assertEquals("abc", 123);
		//Assert.assertEquals("123", 123);
		
		//Assert.assertNotEquals(123, 123);//Failed
		//Assert.assertNotEquals(123, 456);//Passed
		
		//Assert.assertTrue(true);//pass
		//Assert.assertTrue(false);//fail
		
		//Assert.assertTrue(1==2);//fail
		//Assert.assertTrue(1==1);//pass
		
		//Assert.assertFalse(1==2);//pass
		//Assert.assertFalse(1==1);//fail
		
		Assert.fail();
	}
}
