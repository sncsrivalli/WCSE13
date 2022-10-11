package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdAndNameLocators {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to the application
		driver.get("https://demo.actitime.com/login.do");
		
		//Enter the Username
		driver.findElement(By.name("username")).sendKeys("admin");
		
		//Enter password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		//Wait Statement
		Thread.sleep(2000);
		
		//Close the browser
		driver.quit();
		
	
	}

}
