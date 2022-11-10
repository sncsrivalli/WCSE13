package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledParameterPractice {
	
	@Test(enabled = false)
	public void demo1() {
		Reporter.log("demo1 test",true);
	}

	@Test(priority = 1, invocationCount = 2, enabled = true)
	public void demo2() {
		Reporter.log("demo2 test",true);
	}
	
	@Test(priority = 1, invocationCount = 2, enabled = false)
	public void demo3() {
		Reporter.log("demo3 test",true);
	}
	
	@Test(priority = -1, invocationCount = 3, enabled = true)
	public void demo4() {
		Reporter.log("demo4 test",true);
	}
	
	@Test(priority = 0, invocationCount = 4)
	public void demo5() {
		Reporter.log("demo5 test",true);
	}
	
}
