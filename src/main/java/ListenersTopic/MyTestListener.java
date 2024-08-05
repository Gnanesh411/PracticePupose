package ListenersTopic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestListener implements ITestListener {

	public void onStart(ITestContext it) {
		System.out.println("Test Case Execution Started");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case Passed:" + result.getName());
	}

	public void onTestFailure(ITestResult it) {
		System.out.println("Test Case Failed:" + it.getName());
	}

	public void onTestSkipped(ITestResult it) {
		System.out.println("Test Skipped:" + it.getName());
	}

	public void onFinish(ITestContext it) {
		System.out.println("Test Case Excution Finished");
	}
}
