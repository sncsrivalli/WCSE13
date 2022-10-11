package basicSeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageTitleVerification {

	public static void main(String[] args) {
		
		//Launch the chrome browser
		WebDriver driver = new ChromeDriver();
		
		//Navigate to the application
		driver.get("https://accounts.google.com/");
		
		//Fetch the title of the page
		String actualTitle = driver.getTitle();
		String expectedTitle = "Gmail";
		
		//Verification of web page title
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Test Case Passed");
		}
		else
			System.out.println("Test Case is Failed");
		
		//close the browser
		driver.quit();

	}

}
