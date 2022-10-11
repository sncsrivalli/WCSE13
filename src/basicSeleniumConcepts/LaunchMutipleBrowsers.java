package basicSeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchMutipleBrowsers {

	public static void main(String[] args) {

		String key1 = "webdriver.chrome.driver";
		String value1 = "./chromedriver.exe";
		
		System.setProperty(key1, value1);
		
		//Launch chrome browser
		WebDriver driver1 = new ChromeDriver();
		
		String key2 = "webdriver.gecko.driver";
		String value2 = "./geckodriver.exe";
		
		System.setProperty(key2, value2);
		
		//Launch firefox browser
		WebDriver driver2 = new FirefoxDriver();

	}

}
