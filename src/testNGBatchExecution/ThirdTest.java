package testNGBatchExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ThirdTest {
	
	@Test
	public void thirdTest() {
		Reporter.log("Test 3",true);
	}

}
