package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountPractice {
	
	
	@Test(invocationCount = 3)
	public void demo1() {
		Reporter.log("Demo1 test",true);
	}
	
	@Test(invocationCount = 0)
	public void demo2() {
		Reporter.log("Demo2 test",true);
	}
	
	@Test(priority = -1, invocationCount = 3)
	public void demo3() {
		Reporter.log("Demo3 test",true);
	}

}
