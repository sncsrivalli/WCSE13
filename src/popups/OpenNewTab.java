package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewTab {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().newWindow(WindowType.TAB);
		//driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.amazon.com/");
		
		String parentBrowser = driver.getWindowHandle();
		System.out.println(parentBrowser);
		
		Set<String> browsers = driver.getWindowHandles();
		System.out.println(browsers);
		
		for(String browser: browsers) {
			driver.switchTo().window(browser);
			System.out.println(driver.getTitle());
		}
		
		driver.quit();

	}

}
