package basicSeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowManagement {

	public static void main(String[] args) throws InterruptedException {

		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Wait statement
		Thread.sleep(2000);
		
		//Minimize the window
		driver.manage().window().minimize();
		
		//Wait statement
		Thread.sleep(2000);
		
		//Full screen mode
		driver.manage().window().fullscreen();
		
		//Wait statement
		Thread.sleep(2000);
		
		//Navigate to the application
		driver.get("https://www.flipkart.com/");
		
		
		//Close the browser
		driver.quit();

	}

}
