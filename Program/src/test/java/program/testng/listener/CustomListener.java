package program.testng.listener;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class CustomListener  implements IInvokedMethodListener{

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("beforeInvocation");
		System.out.println("Method Name:" +method.getTestMethod().getMethodName() +" : Class Name "+ testResult.getTestClass().getName());
		
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("afterInvocation");
		System.out.println("Method Name:" +method.getTestMethod().getMethodName() +" : Class Name "+ testResult.getTestClass().getName());
		
		
	}

}
