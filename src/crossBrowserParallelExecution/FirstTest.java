package crossBrowserParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//cross browser parallel
public class FirstTest {
	public WebDriver driver;
	//This parameters are coming from xml
	@Parameters("Browser")
	@Test
	public void demoTest(String browser) {
		
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
			System.out.println("Chrome started");
		}
		else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
			System.out.println("firefox started");
		}
		else if(browser.equals("edge")) {
			driver = new EdgeDriver();
			System.out.println("edge started");
		}
		
		
	}

}
