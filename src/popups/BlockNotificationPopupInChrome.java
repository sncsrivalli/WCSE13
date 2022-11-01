package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BlockNotificationPopupInChrome {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		driver.quit();

	}

}
