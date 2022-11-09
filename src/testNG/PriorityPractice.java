package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityPractice {
	
	@Test(priority = 0)
	public void firstTest() {
		Reporter.log("First test",true);
	}
	
	@Test(priority = 1)
	public void secondTest() {
		Reporter.log("Second test",true);
	}
	
	@Test(priority = -1)
	public void thirdTest() {
		Reporter.log("Third test",true);
	}
	
	@Test(priority = 2)
	public void fourthTest() {
		Reporter.log("Fourth test",true);
	}
	
	@Test(priority = -2)
	public void fifthTest() {
		Reporter.log("Fifth test",true);
	}

}
