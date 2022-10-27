package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement allDropdown = driver.findElement(By.id("searchDropdownBox"));
		Select s = new Select(allDropdown);
		s.selectByIndex(5);
		Thread.sleep(2000);
		s.selectByValue("search-alias=computers-intl-ship");
		Thread.sleep(2000);
		s.selectByVisibleText("Kindle Store");
		Thread.sleep(2000);
		driver.quit();
	}

}
