package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BlockNotificationPopupInFirefox {

	public static void main(String[] args) throws InterruptedException {
		FirefoxOptions option = new FirefoxOptions();
		option.addArguments("--disable-notifications");
			
		WebDriver driver = new FirefoxDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		driver.quit();

	}

}
