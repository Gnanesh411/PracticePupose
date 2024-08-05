package ListenersTopic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {
	public ExtentSparkReporter sparkReporter;// Ui of the report
	public ExtentReports extent;// populate common info on the report
	public ExtentTest test;// creating test case entries in the report and update status of the test
							// methods

	public void onStart(ITestContext context) {// excutes once only once before starting all tests
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/reports/myReport.html");
		sparkReporter.config().setDocumentTitle("Automation Report");// Title of report
		sparkReporter.config().setReportName("Functional Testing");// name of the report
		sparkReporter.config().setTheme(Theme.STANDARD);

		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);

		extent.setSystemInfo("Computer Name", "loacalhost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester Name", "Gnanesh");
		extent.setSystemInfo("OS", "Windows11");
		extent.setSystemInfo("Browser name", "Chrome");
	}

	/*
	 * public void onTestStart(ITestResult result) {// excutes multiple times before
	 * every test
	 * 
	 * }
	 */

	public void onTestSuccess(ITestResult result) {//result variable will contains all the passed methods details.
		
		test = extent.createTest(result.getName());// create a new entry in the report.
		test.log(Status.PASS, "Test case Passed is:"+result.getName());//update status of P/F/S methods
	}

	public void onTestFailure(ITestResult result) {//result variable will contains all the failed methods details.
		
		test = extent.createTest(result.getName());// create a new entry in the report.
		test.log(Status.FAIL, "Test case Failed is:"+result.getName());//update status of P/F/S methods
		test.log(Status.FAIL, "Test case Failed cause is:"+result.getThrowable());
	}

	public void onTestSkipped(ITestResult result) {//result variable will contains all the skipped methods details.

		test = extent.createTest(result.getName());// create a new entry in the report.
		test.log(Status.SKIP, "Test case Skipped is:"+result.getName());//update status of P/F/S methods
	}

	public void onFinish(ITestContext context) {//update the total thing into report.

		extent.flush();
	}

}
