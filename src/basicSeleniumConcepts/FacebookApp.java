package basicSeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookApp {

	public static void main(String[] args) {
		
		String key = "webdriver.chrome.driver";
		String value = "./chromedriver.exe";
		
		System.setProperty(key, value);
		
		//Launch chrome browser
		WebDriver driver = new ChromeDriver();
		
		//Navigate to the application
		driver.get("https://www.facebook.com/");
		
		//Fetch the title of web page
		String title = driver.getTitle();
		System.out.println(title);
		
		//Fetch the url of current application
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//Fetch the page source of the web page
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		//close the browser
		driver.quit();

	}

}
