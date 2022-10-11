package basicSeleniumConcepts;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String value = "./chromedriver.exe";
		System.setProperty(key, value);
		
		ChromeDriver chromeDriver = new ChromeDriver();

	}

}
