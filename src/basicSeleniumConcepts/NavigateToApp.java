package basicSeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToApp {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the chrome browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to voot application
		driver.navigate().to("https://www.voot.com/");
		
		//Navigate to Instagram application
		driver.navigate().to("https://www.instagram.com/");
		
		//Navigate back
		driver.navigate().back();
		
		//Navigate forward
		driver.navigate().forward();
		
		// Wait statement
		Thread.sleep(2000);
		
		//Refresh the current page
		driver.navigate().refresh();
		
		//Quit the application
		driver.quit();

	}

}
