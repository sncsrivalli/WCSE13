package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdAndNameLocatorPractice {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver =new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to the application
		driver.get("https://www.facebook.com/");
		
		//Enter Username
		driver.findElement(By.id("email")).sendKeys("admin");
		
		//Enter Password
		driver.findElement(By.id("pass")).sendKeys("12345");
		
		//Click on login button
		driver.findElement(By.name("login")).click();
		
		//Wait Statement
		Thread.sleep(2000);
		
		//Close the browser
		driver.quit();

	}

}
