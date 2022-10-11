package basicSeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageSourceVerification {

	public static void main(String[] args) {
		// Launch the chrome browser
		WebDriver driver = new ChromeDriver();

		// Navigate to the application
		driver.get("https://www.facebook.com/");

		// Fetch the page source of the page
		String actualPageSource = driver.getPageSource();
		String expectedPageSource = "Facebook";

		// Verification of web page title
		if (actualPageSource.contains(expectedPageSource)) {
			System.out.println("Test Case Passed");
		} else
			System.out.println("Test Case is Failed");

		// close the browser
		driver.quit();

	}

}
