package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextPractice {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to the application
		driver.get("https://demo.actitime.com/login.do");
		
		//Click on forgot your password link
		driver.findElement(By.partialLinkText("Forgot")).click();
		
		//Wait Statement
		Thread.sleep(2000);
		
		//Click on return to login page
		driver.findElement(By.partialLinkText("Return")).click();
		
		//Close the browser
		driver.quit();
	}

}
