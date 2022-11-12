package assertions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertPractice {
	
	WebDriver driver ;
	@BeforeMethod
	public void openApp() {
		Reporter.log("In before method",true);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void firstTest() {
		String title = driver.getTitle();
		Reporter.log(title, true);
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(title, "Hello");
		soft.assertEquals(true, false);
		Reporter.log(driver.getCurrentUrl(), true);
		soft.assertAll();
	}
	
	@AfterMethod
	public void closeBrowser() {
		Reporter.log("In after method",true);
		driver.quit();
	}

}
