package listeners;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

import util.TLDriverFactory;
public class TestListener implements ITestListener, IAnnotationTransformer {

	private static String selectedBrowserName = "";

	@Override
	public void onTestStart(ITestResult result) {

		String browserName = result.getMethod().getXmlTest()
				.getLocalParameters().get("browser");
		selectedBrowserName = TLDriverFactory.getBrowserName();
		if (selectedBrowserName == null)
			TLDriverFactory.setDriver(browserName);
		else if (!browserName.contentEquals(selectedBrowserName))
			TLDriverFactory.setDriver(browserName);
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		String methodName = result.getName().toString();
		System.out.println("After test passed listener");
	}

	@Override
	public void onTestFailure(ITestResult result) {

		String methodName = result.getName().toString();
		System.out.println("After test Failed listener");
	}

	@Override
	public void onTestSkipped(ITestResult result) {

		// TODO Auto-generated method stub
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		// TODO Auto-generated method stub
	}

	@Override
	public void onStart(ITestContext context) {

		// TODO Auto-generated method stub
	}

	@Override
	public void onFinish(ITestContext context) {

		System.out.println("Inside on Finish");
		// TODO Auto-generated method stub
	}

	@Override
	public void transform(ITestAnnotation annotation, Class testClass,
			Constructor testConstructor, Method testMethod) {

	}
}
