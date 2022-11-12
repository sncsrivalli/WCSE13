package assertions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertPractice {
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
		Assert.assertEquals(title, "Hello");
//		if(title.equals("Hello"))
//			System.out.println("test pass");
//		else
//			System.out.println("test fail");
		Reporter.log(driver.getCurrentUrl(), true);
	}
	
	@AfterMethod
	public void closeBrowser() {
		Reporter.log("In after method",true);
		driver.quit();
	}
}
