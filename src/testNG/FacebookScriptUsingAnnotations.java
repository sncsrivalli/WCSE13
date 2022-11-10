package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookScriptUsingAnnotations {
	WebDriver driver;
	
	@BeforeMethod
	public void methodSetup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void forgottenPasswordTest() {
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.id("identify_email")).sendKeys("9876543210");
		driver.findElement(By.id("did_submit")).click();		
	}
	
	@Test
	public void createAPageTest() {
		driver.findElement(By.linkText("Create a Page")).click();
	}
	
	@AfterMethod
	public void methodTeardown() {
		driver.quit();
	}

}
