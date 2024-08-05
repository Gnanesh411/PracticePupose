package ListenersTopic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListner implements ITestListener {

	public void onStart(ITestContext context) {// excutes once only once before starting all tests
		System.out.println("Test excution is started.....");
	}

	public void onTestStart(ITestResult result) {// excutes multiple times before every test
		System.out.println("test started....."+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("test passed....");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("test failed....");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("test skipped....");
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test excution completed");
	}
}
